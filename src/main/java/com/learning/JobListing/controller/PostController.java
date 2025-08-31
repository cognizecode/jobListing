package com.learning.JobListing.controller;

import com.learning.JobListing.model.Post;
import com.learning.JobListing.repository.PostRepository;
import com.learning.JobListing.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repository;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/posts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> searchPost(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post) {
        return repository.save(post);
    }
}
