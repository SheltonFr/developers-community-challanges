package dev.sheltonfrancisco.challange_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/hello")
public class Challange01Application {

	public static void main(String[] args) {
		SpringApplication.run(Challange01Application.class, args);
	}

	@GetMapping
	public ResponseEntity<HelloResponse> sayHello() {
		return ResponseEntity.ok(new HelloResponse("Olá, Mundo!"));
	}

}
