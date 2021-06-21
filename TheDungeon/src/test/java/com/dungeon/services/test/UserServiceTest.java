package com.dungeon.services.test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dungeon.repository.UserRepository;

@ExtendWith(SpringExtension.class)
class UserServiceTest {
	@TestConfiguration
	static class Configuration {


//		public UserHandler getUserHandler(UserService userService, FirebaseUtil firebaseUtil) {
//			UserHandler userHandler = new UserHandler();
//			userHandler.setUserService(userService);
//			userHandler.setFirebaseUtil(firebaseUtil);
//			return userHandler;
//		}

		@Bean
		public UserRepository getUserRepository() {
			return Mockito.mock(UserRepository.class);
		}

	}

	@Autowired
	UserRepository userRepo;

}
