package com.leonel.RestUtils.controller;


import com.leonel.RestUtils.endereco.Endereco;
import com.leonel.RestUtils.service.CepService;
import com.leonel.RestUtils.util.ValidarCPF;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utils")
public class RestUtilsController {

    private final CepService cepService;

    public RestUtilsController(CepService cepService) {
        this.cepService = cepService;
    }

    @PostMapping("/cep")
    private ResponseEntity<String> getCep(@RequestParam String cep) {
        Endereco endereco = cepService.getEndereco(cep);
        return ResponseEntity.ok(endereco.toString());
    }

    @PostMapping("/cpfValido")
    private ResponseEntity<Boolean> validarCpf(@RequestParam String cpf) {
        return ResponseEntity.ok(ValidarCPF.cpfValido(cpf));
    }
}
