package com.learning.JobListing.repository;

import com.learning.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

}
