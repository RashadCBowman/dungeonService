package com.dungeon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datastax.oss.driver.shaded.guava.common.base.Objects;
import com.dungeon.beans.User;
import com.dungeon.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	
	public Mono<User> addUser(User user){
		if (Objects.equal(user, null)) {
			return Mono.empty();
		}
		//if (this.userRepo.findAllById(null))
		
		
		return this.userRepo.insert(user);
	}
	
	public Mono<User> getUserByPassword(String name, String pass){
		return this.userRepo.findByTwitchName(name).filter(user -> user.getPassword().equals(pass));
	}
	
	
	public Flux<User> getUsers(){
		return this.userRepo.findAll();
	}
	
	public Mono<User> getUserById(User user){
		return this.userRepo.findById(user.getId());
	}
	
	public Mono<User> updateUser(User user){
		return this.userRepo.save(user);
	}
	
	public Mono<Void> deleteUser(User user){
		return this.userRepo.delete(user);
	}



}
