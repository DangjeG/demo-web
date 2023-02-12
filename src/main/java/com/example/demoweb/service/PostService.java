package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Hi",0));
        posts.add(new Post("Hello",0));
        posts.add(new Post("Bomzhur",0));
        return posts;
    }
}
