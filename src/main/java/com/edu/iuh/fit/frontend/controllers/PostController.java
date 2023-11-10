package com.edu.iuh.fit.frontend.controllers;

import com.edu.iuh.fit.backend.entities.Post;
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
    @PostMapping("/addPost")
    public String addPost(@ModelAttribute Post post, HttpSession session){
        post.setCreatedAt(LocalDateTime.now());
        post.setPublishAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());
        post.setUser((User) session.getAttribute("user"));
        post.setPublished(true);
        postRepository.save(post);
        return "redirect:user/logIn";
    }
}
