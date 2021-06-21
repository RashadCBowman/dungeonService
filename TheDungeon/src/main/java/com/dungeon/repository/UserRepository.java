package com.dungeon.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import com.dungeon.beans.*;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCassandraRepository<User, Integer> {
	Mono<User> findByFirstName(String name);
	Mono<User> findByTwitchName(String twitch);
}
