package com.rajat.joblisting.Controller;


import com.rajat.joblisting.Repository.PostRepository;
import com.rajat.joblisting.Repository.SearchRepository;
import com.rajat.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;
    @Autowired
    SearchRepository searchRepository;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){

        return searchRepository.findByText(text);

    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return postRepository.save(post);
    }
}
