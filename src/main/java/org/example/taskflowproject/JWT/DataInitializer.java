package org.example.taskflowproject.JWT;

import org.example.taskflowproject.Models.Admin;
import org.example.taskflowproject.Models.Enum.Role;
import org.example.taskflowproject.Repositories.AdminRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initAdmin(AdminRepository adminRepository, PasswordEncoder encoder) {
        return args -> {
            String email = "superadmin@superadmin.com";
            if (adminRepository.findByEmail(email).isEmpty()) {
                Admin superAdmin = new Admin();
                superAdmin.setNom("Super");
                superAdmin.setPrenom("Admin");
                superAdmin.setEmail(email);
                superAdmin.setMotDePasse(encoder.encode("superadmin123"));
                superAdmin.setRole(Role.ADMIN);
                adminRepository.save(superAdmin);
                System.out.println("✅ SuperAdmin initialized.");
            }
        };
    }
}
