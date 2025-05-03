package com.leonel.RestUtils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptTests {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String senha = "123";  // Senha que você deseja criptografar

        // Gerar o hash
        String senhaCriptografada = encoder.encode(senha);

        System.out.println("Senha criptografada: " + senhaCriptografada);
    }
}
