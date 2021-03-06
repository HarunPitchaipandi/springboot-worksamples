package com.example.demo.post;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {
	
   @Autowired
   private PostService PostService;
	
   @RequestMapping(value="/posts")
   public List<Post> getAllPosts() {
		
	   return PostService.getAllPosts();
 
   }
   
   @RequestMapping(value="/posts/{id}")
   public Post getPost(@PathVariable String id) {
	   return PostService.getPost(id);
	   
   }
   
   @RequestMapping(value="/posts", method=RequestMethod.POST)
   public void addPost(@RequestBody Post post) {
	   PostService.addPost(post);
	   
   }
}
	
 