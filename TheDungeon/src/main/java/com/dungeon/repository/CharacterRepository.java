package com.dungeon.repository;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import reactor.core.publisher.Mono;

public interface CharacterRepository extends ReactiveCassandraRepository<Character, String> {
	Mono<Character> findByOwner(String owner);
}
