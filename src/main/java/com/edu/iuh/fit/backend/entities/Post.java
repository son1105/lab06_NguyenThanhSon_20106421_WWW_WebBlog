package com.edu.iuh.fit.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "post")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private long id;
    @Lob
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "created_at", length = 6)
    private LocalDateTime createdAt;
    @Column(name = "meta_title", length = 100)
    private String metaTitle;
    private boolean published;
    @Column(name = "publish_at", length = 6)
    private LocalDateTime publishAt;
    @Lob
    @Column(columnDefinition = "text")
    private String summary;
    @Column(length = 75)
    private String title;
    @Column(name = "updated_at", length = 6)
    private LocalDateTime updatedAt;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Post post;
    @OneToMany(mappedBy = "post")
    private Set<Post> posts;
    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments;
}
