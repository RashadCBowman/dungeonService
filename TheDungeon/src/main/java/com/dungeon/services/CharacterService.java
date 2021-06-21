package com.dungeon.services;

import reactor.core.publisher.Mono;

public interface CharacterService {
	
	
	Mono<Character> addCharacter(Character character);
	Mono<Void> deleteCharacter(Character character);
	Mono<Character> findCharacterByTwitch(String twitchName);
	Mono<Character> updateCharacter(Character character);
}
