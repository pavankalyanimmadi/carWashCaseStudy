package com.washer.MainWasherService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.washer.MainWasherService.pojo.Washer;
import com.washer.MainWasherService.service.WasherService;


@RestController
@CrossOrigin("*")
public class WasherController {
	
	@Autowired
	private WasherService washerService;
	
	
	
	@PostMapping("/login")
	public Washer login(@RequestBody Washer washer) {
		return washerService.login(washer);
		
	}
	
	@PostMapping("/signup")
	public Washer signup(@RequestBody Washer washer) {
		return washerService.signup(washer);
		
	}
	
	@PostMapping("/updateprofile")
	public Washer updateProfile(@RequestBody Washer washer)
	{
		return washerService.updateProfile(washer);
	}
	
	@GetMapping("/getallwashers")
	public List<Washer> getALlWashers()
	{
		return washerService.getAllWashers();
	}
	
	@PostMapping("/deletewasher")
	public Washer deleteWsher(@RequestBody Washer washer)
	{
		return washerService.deleteWasher(washer);
		
	}
	
	
	

}
