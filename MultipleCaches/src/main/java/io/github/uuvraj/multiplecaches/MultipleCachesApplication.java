package io.github.uuvraj.multiplecaches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MultipleCachesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleCachesApplication.class, args);
	}

}
