package com.example.demoweb.service;

import com.example.demoweb.model.Post;

import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService(List<Post> posts){
        this.posts = posts;
    }

    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {

        posts.add(new Post(text, new Date()));
    }
}
