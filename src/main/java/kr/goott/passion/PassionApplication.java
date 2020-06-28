package kr.goott.passion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PassionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassionApplication.class, args);
		System.out.println("hello boot");
	}
}
