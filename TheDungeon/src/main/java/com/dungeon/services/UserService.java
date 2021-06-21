package com.dungeon.services;

import com.dungeon.beans.User;

import reactor.core.publisher.Mono;

public interface UserService {
	
	
	Mono<User> addUser(User user);
	Mono<User> updateUser(User user);
	Mono<Void> deleteUser(User user);
	
	
	
}
