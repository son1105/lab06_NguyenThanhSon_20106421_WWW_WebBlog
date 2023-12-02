package com.edu.iuh.fit.frontend.controllers;

import com.edu.iuh.fit.backend.entities.Post;
import com.edu.iuh.fit.backend.entities.PostComment;
import com.edu.iuh.fit.backend.entities.User;
import com.edu.iuh.fit.backend.repositories.PostRepository;
import com.edu.iuh.fit.backend.repositories.UserRepository;
import com.edu.iuh.fit.backend.sevices.PostService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addPost")
    public String addPost(@ModelAttribute Post post, HttpSession session) {
        post.setCreatedAt(LocalDateTime.now());
        post.setPublishAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());
        post.setUser((User) session.getAttribute("user"));
        post.setPublished(true);
        postRepository.save(post);
        return "redirect:user/logIn";
    }

    @GetMapping("/post/user/{userId}")
    public String getPostOfUser(@PathVariable("userId") long userId, Model model) {
        List<Post> posts = postRepository.findAllByUserOrderByUpdatedAtDesc(userRepository.findById(userId).get());
        PostComment postComment = new PostComment();
        model.addAttribute("comment", postComment);
        model.addAttribute("user", userRepository.findById(userId).get());
        model.addAttribute("posts", posts);
        return "post/postOfUser";
    }

    @GetMapping("/post/search")
    public String getPostSearch(@RequestParam("keySearch") Optional<String> key, Model model) {
        if (key.isPresent()) {
            List<Post> posts;
            posts = postRepository.findAllByMetaTitle(key.get());
            if(posts.isEmpty()){
                String[] search = key.get().split(" ");
                if(search.length==1)
                    posts = postRepository.findAllByUserLastName(search[0]);
                else if(search.length==2)
                    posts = postRepository.findAllByUserLastNameAndUserMiddleName(search[1], search[0]);
                else
                    posts = postRepository.findAllByUserLastNameAndUserMiddleNameAndUserFirstName(search[2], search[1], search[0]);
            }
            PostComment postComment = new PostComment();
            model.addAttribute("comment", postComment);
            model.addAttribute("posts", posts);
        }
        return "post/postOfUser";
    }
}
