package com.example.boot.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NewsController {
	  @Autowired
	  NewsService service;
	  @GetMapping("/api/news/topstories")
		public  News getNews() throws Exception{
		return service.getTopStories();
		}
		
	}