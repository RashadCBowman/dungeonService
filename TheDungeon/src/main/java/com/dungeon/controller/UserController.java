package com.dungeon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dungeon.beans.User;
import com.dungeon.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="users")
public class UserController {

	private UserService userService;

	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	@PostMapping("/register")
	public Mono<ResponseEntity<User>> registerUser(@RequestBody User user){
		User u = new User();
		System.out.println(u);
		return userService.addUser(u).map(userVar -> ResponseEntity.status(201).body(userVar)).onErrorStop();
	}
	
	@PutMapping("/login")
	public Mono<ResponseEntity<User>> login(@RequestBody User user){
		
		return userService.getUserByNameAndPass(user.getTwitchName(), user.getPassword()).doOnNext(u -> {
			try {
				exchange.getResponse()
				.addCookie(ResponseCookie
						.from("token", tokenService.makeToken(u))
						.httpOnly(true).path("/").build());
			} catch (JsonProcessingException e) {
				exchange.getResponse().setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		});
		
		return null;
		
	}
	
	

	
}
