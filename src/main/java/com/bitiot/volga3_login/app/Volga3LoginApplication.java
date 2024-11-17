package com.bitiot.volga3_login.app;

import com.bitiot.volga3_login.app.models.ERole;
import com.bitiot.volga3_login.app.models.RoleEntity;
import com.bitiot.volga3_login.app.models.UserEntity;
import com.bitiot.volga3_login.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
public class Volga3LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(Volga3LoginApplication.class, args);
	}

//	@Autowired
//	PasswordEncoder passwordEncoder;
//
//	@Autowired
//	UserRepository userRepository;
//
//	@Bean
//	CommandLineRunner init(){
//		return args -> {
//			UserEntity userEntitySuper = UserEntity.builder()
//					.email("supercesar@mail.com")
//					.username("supercesar")
//					.password(passwordEncoder.encode("1234"))
//					.roles(Set.of(RoleEntity.builder()
//							.name(ERole.valueOf(ERole.SUPERADMIN.name()))
//							.build()))
//					.build();
//
//			UserEntity userEntity = UserEntity.builder()
//					.email("cesar@mail.com")
//					.username("cesar")
//					.password(passwordEncoder.encode("1234"))
//					.roles(Set.of(RoleEntity.builder()
//							.name(ERole.valueOf(ERole.ADMIN.name()))
//							.build()))
//					.build();
//
//			UserEntity userEntity2 = UserEntity.builder()
//					.email("bitiot@mail.com")
//					.username("bitiot")
//					.password(passwordEncoder.encode("1234"))
//					.roles(Set.of(RoleEntity.builder()
//							.name(ERole.valueOf(ERole.USER.name()))
//							.build()))
//					.build();
//
//			UserEntity userEntity3 = UserEntity.builder()
//					.email("prueba@mail.com")
//					.username("prueba")
//					.password(passwordEncoder.encode("1234"))
//					.roles(Set.of(RoleEntity.builder()
//							.name(ERole.valueOf(ERole.MONITOR.name()))
//							.build()))
//					.build();
//
//			userRepository.save(userEntity);
//			userRepository.save(userEntity2);
//			userRepository.save(userEntity3);
//			userRepository.save(userEntitySuper);
//		};
//	}

}
