package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@SpringBootApplication
@RestController
@RequestMapping("plot")
public class ReceberWebHook {

	public static void main(String[] args) {
		SpringApplication.run(ReceberWebHook.class, args);
	}

	@PostMapping("/webhook")
	public ResponseEntity<String> handleWebhook(@RequestBody Map<String, Object> payload) {
		System.out.println("Payload recebido: " + payload);
		// processamento necessário com o payload recebido
		return ResponseEntity.ok("Webhook recebido com sucesso");
	}

}
