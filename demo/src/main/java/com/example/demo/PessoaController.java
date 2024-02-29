package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api")
public class PessoaController {

    @PostMapping("/pessoa")
    public ResponseEntity<String> receberPessoa(@RequestBody Pessoa pessoa){
        System.out.println("Id Pessoa : " + pessoa.getId());
        System.out.println("Texto : " + pessoa.getTexto());

        try {
            System.out.println(Main.searchGpt(pessoa));
            ResponseEntity.ok("Pessoa recebida");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok("Pessoa recebida com sucesso");
    }
}
