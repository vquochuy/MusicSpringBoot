package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Music;
import com.example.repository.MusicRepo;

@RestController
public class MusicController {
	
	@Autowired
	MusicRepo repo;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String home (){
		Music music= new Music();
		music.setName("Nhan");
		repo.save(music);
		return "thanh cong";
	}
}
