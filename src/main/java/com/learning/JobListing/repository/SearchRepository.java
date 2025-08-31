package com.learning.JobListing.repository;

import com.learning.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
