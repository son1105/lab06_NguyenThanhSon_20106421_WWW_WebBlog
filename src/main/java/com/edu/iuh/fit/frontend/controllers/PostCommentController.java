package com.edu.iuh.fit.frontend.controllers;

import com.edu.iuh.fit.backend.entities.Post;
import com.edu.iuh.fit.backend.entities.PostComment;
import com.edu.iuh.fit.backend.entities.User;
import com.edu.iuh.fit.backend.repositories.PostCommentRepository;
import com.edu.iuh.fit.backend.repositories.PostRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Controller
public class PostCommentController {
    @Autowired
    private PostCommentRepository postCommentRepository;
    @Autowired
    private PostRepository postRepository;
    @PostMapping("/addComment")
    public String addComment(HttpSession session, @RequestParam("postId") Long postId, @ModelAttribute("comment") PostComment postComment, Model model){
        postComment.setCreatedAt(LocalDateTime.now());
        postComment.setPublished(true);
        postComment.setPublishedAt(LocalDateTime.now());
        postComment.setPost(postRepository.findById(postId).get());
        postComment.setUser((User) session.getAttribute("user"));
        postCommentRepository.save(postComment);
        return "redirect:user/logIn";
    }
}
