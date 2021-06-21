package com.dungeon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dungeon.repository.CharacterRepository;

import reactor.core.publisher.Mono;

@Service
public class CharacterServiceImpl implements CharacterService{
	@Autowired
	private CharacterRepository characterRepo;
	
	public void setCharacterRepo(CharacterRepository characterRepo) {
		this.characterRepo = characterRepo;
	}
	
	
	
	
	
	@Override
	public Mono<Character> addCharacter(Character character) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteCharacter(Character character) {
		characterRepo.
		return Mono.empty();
	}

	@Override
	public Mono<Character> findCharacterByTwitch(String twitchName) {
		
		return characterRepo.findByOwner(twitchName);
	}

	@Override
	public Mono<Character> updateCharacter(Character character) {
		// TODO Auto-generated method stub
		return null;
	}

}
