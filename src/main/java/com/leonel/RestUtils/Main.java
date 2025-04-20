package com.leonel.RestUtils;

import com.leonel.RestUtils.user.Role;
import com.leonel.RestUtils.user.RoleRepository;
import com.leonel.RestUtils.user.User;
import com.leonel.RestUtils.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;


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
        // Usa roleRepository normalmente aqui

/*        Role role = new Role();
        role.setName("ROLE_ADMIN");

        User user = new User();
        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("admin"));
        roleRepository.save(role);

        user.setRoles(Set.of(role));

        userRepository.save(user);*/

        System.out.println("userRepository.findAll() = " + userRepository.findAll());


    }
}
