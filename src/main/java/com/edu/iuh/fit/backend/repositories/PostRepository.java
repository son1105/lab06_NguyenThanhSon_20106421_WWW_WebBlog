package com.edu.iuh.fit.backend.repositories;

import com.edu.iuh.fit.backend.entities.Post;
import com.edu.iuh.fit.backend.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByPost(Post post);

    List<Post> findAllByUserOrderByUpdatedAtDesc(User user);

    List<Post> findAllByMetaTitle(String metaTitle);

    List<Post> findAllByUserLastName(String lastName);

    List<Post> findAllByUserLastNameAndUserMiddleName(String lastName, String middleName);

    List<Post> findAllByUserLastNameAndUserMiddleNameAndUserFirstName(String lastName, String middleName, String firstName);
}