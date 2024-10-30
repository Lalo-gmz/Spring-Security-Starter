package com.agdev.social_network;

import com.agdev.social_network.role.Role;
import com.agdev.social_network.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class SocialNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialNetworkApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepository){
		return args -> {
			if(roleRepository.findByName("USER").isEmpty()){
				roleRepository.save(
					Role.builder().name("USER").build()

				);
			}
		};
	}
}
