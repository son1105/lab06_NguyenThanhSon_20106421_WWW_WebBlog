package com.edu.iuh.fit;

import com.edu.iuh.fit.backend.entities.Post;
import com.edu.iuh.fit.backend.entities.PostComment;
import com.edu.iuh.fit.backend.entities.User;
import com.edu.iuh.fit.backend.repositories.PostCommentRepository;
import com.edu.iuh.fit.backend.repositories.PostRepository;
import com.edu.iuh.fit.backend.repositories.UserRepository;
import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.loremipsum.LoremIpsum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;

@SpringBootApplication
public class LabWeek06NguyenThanhSon20106421WwwApplication {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostCommentRepository postCommentRepository;

    public static void main(String[] args) {
        SpringApplication.run(LabWeek06NguyenThanhSon20106421WwwApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(){
        return args -> {
            User userAdmin = new User("Nguyễn", "Thanh", "Sơn", "0955687321", "son@gmail.com", "123", "Hello everyone", "My name is Son");
            userRepository.save(userAdmin);
            Faker faker = new Faker(new Locale("vi", "VN"));
            Random random = new Random();
            String[] ho = {"Nguyễn", "Trần", "Lê", "Võ", "Phạm", "Phan"};
            String[] tenLot = {"Văn", "Thanh", "Tấn"};
            String[] ten = {"Sơn", "Phong", "Toàn", "Lợi", "Việt"};
            for (int i = 2; i <= 100; i++) {
                User user = new User(ho[random.nextInt(6)], tenLot[random.nextInt(3)], ten[random.nextInt(5)],
                        "09"+random.nextLong(10000000L,99999999L),"user"+i+"@gmail.com",
                        "123", LoremIpsum.createParagraph(100), LoremIpsum.createParagraph(100));
                userRepository.save(user);
            }
            for (int i = 1; i <= 200; i++) {
                Post post = new Post(LoremIpsum.createParagraph(100), "post"+i, LocalDateTime.now(), "summary of post "+i, "post #"+i, LocalDateTime.now(), userRepository.findById(random.nextLong(1,101)).get(), null);
                postRepository.save(post);
            }
            for (int i = 1; i <= 500; i++) {
                PostComment postComment = new PostComment("Comment #"+i, LoremIpsum.createParagraph(50), LocalDateTime.now(), postRepository.findById(random.nextLong(1, 201)).get(), userRepository.findById(random.nextLong(1,101)).get(), null);
                postCommentRepository.save(postComment);
            }
        };
    }
}
