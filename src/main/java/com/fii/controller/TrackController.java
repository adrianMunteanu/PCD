package com.fii.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fii.model.UserTable;
import com.fii.service.CacheService;

@RestController
public class TrackController {
	@Autowired
	CacheService cacheService;

	@RequestMapping("/loggedInUsers")
	public Map<String, UserTable> getUsers(){
		return cacheService.getLoggedInUsers();
	}
}
