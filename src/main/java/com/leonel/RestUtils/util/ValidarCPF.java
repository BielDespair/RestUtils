package com.leonel.RestUtils.util;

import java.util.List;

public class ValidarCPF {


    public static boolean cpfValido(String cpf) {
        cpf = limparCPF(cpf);
        if (cpf.length() != 11) { return false;}
        List<Integer> digitos = cpf.chars().mapToObj(Character::getNumericValue).toList();
        List<Integer> verificadores = digitos.subList(9, 11);
        digitos = digitos.subList(0, 9);

        int verificador1 = 0;
        int verificador2 = 0;
        int i = 10;
        for (Integer digito : digitos) {
            verificador1 += digito*i;
            verificador2 += digito*(i+1);
            i--;
        }

        verificador1 = (verificador1*10) % 11 == 10 ? 0 : (verificador1*10) % 11;
        verificador2 += verificador1*(i+1);
        verificador2 = (verificador2*10) % 11 == 10 ? 0 : (verificador2*10) % 11;

        List<Integer> calculo = List.of(verificador1, verificador2);

        return verificadores.equals(calculo);
    }

    private static String limparCPF(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }
}
