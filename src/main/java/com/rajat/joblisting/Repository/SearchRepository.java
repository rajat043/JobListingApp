package com.rajat.joblisting.Repository;

import com.rajat.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
