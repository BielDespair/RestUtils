package com.leonel.RestUtils.service;

import com.leonel.RestUtils.handler.BusinessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class RandomService {

    private final Random random;

    public RandomService(Random random) {
        this.random = random;
    }

    public String getSorte() {
        double luck = Math.random();
        if (luck == 0.0) {return "Azar infinito";}
        else if (luck < 0.25) {return "Muito azar";}
        else if (luck < 0.5) {return "Azar";}
        else if (luck > 0.99) {return "Sorte infinita";}
        else if (luck > 0.75) {return "Muita sorte";}
        else if (luck > 0.5) {return "Sorte";}
        return "Os espíritos do universo ficaram confusos e não conseguiram te dar uma resposta...";
    }

    public String getMoeda() {
        double rng = Math.random();
        if (rng <= 0.5) {return "Cara";}
        return "Coroa";
    }

    public Collection<Integer> getDado(int faces, int lancamentos) {
        if (faces <= 0) {
            throw new BusinessException("Faces devem ser maior que zero");
        }
        List<Integer> resultados = new ArrayList<>();
        for (int i = 0; i < lancamentos; i++) {
            resultados.add(random.nextInt(faces)+1);
        }
        return resultados;
    }
}
