package com.leonel.RestUtils;


import com.leonel.RestUtils.user.RoleRepository;
import com.leonel.RestUtils.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class Main implements CommandLineRunner {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Main(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        List<Double> valores = new ArrayList<>();
        // Usa roleRepository normalmente aqui
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            scanner.nextDouble();
        }
        for (Double valor : valores) {}
/*        Role role = new Role();
        role.setName("ROLE_ADMIN")


        Role role = roleRepository.findAll().getFirst();
        User user = new User();
        user.setUsername("Jheniffer");
        user.setPassword(passwordEncoder.encode("cheirosa"));
        roleRepository.save(role);

        user.setRoles(Set.of(role));

        userRepository.save(user);
*/
        System.out.println("userRepository.findAll() = " + userRepository.findAll());


    }
}
