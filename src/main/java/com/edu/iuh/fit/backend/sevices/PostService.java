package com.edu.iuh.fit.backend.sevices;

import com.edu.iuh.fit.backend.entities.Post;
import com.edu.iuh.fit.backend.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Page<Post> findAll(int pageNo, int pageSize, String sortBy, String sortDirection){
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        List<Post> posts = postRepository.findAllByPost(null);
        return postRepository.findAll(pageable);
//        return new PageImpl<>(posts, pageable, posts.size());
    }
}
