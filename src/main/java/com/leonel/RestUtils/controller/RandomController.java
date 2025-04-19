package com.leonel.RestUtils.controller;


import com.leonel.RestUtils.service.RandomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/random")
public class RandomController {
    private final RandomService randomService;

    public RandomController(RandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("/sorte")
    private String getSorte() {
        return randomService.getSorte();
    }

    @GetMapping("/moeda")
    private String getMoeda() {
        return randomService.getMoeda();
    }

    @GetMapping("/dado")
    private String getDado(@RequestParam(defaultValue = "6") int faces, @RequestParam(defaultValue = "1") int lancamentos) {
        return "<h1> Resultados </h1> <ul>" + randomService.getDado(faces, lancamentos)
                .stream()
                .map(r -> "<li>" + r.toString() + "</li>")
                .collect(Collectors.joining("\n")) +
                "</ul>";
    }
}
