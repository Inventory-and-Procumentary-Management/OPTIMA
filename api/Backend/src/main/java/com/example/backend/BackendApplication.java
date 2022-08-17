package com.example.backend;

import com.example.backend.model.AppUser;
import com.example.backend.model.UserRole;
import com.example.backend.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/login").allowedOrigins("http://localhost:3000");
                registry.addMapping("/api/user/**").allowedOrigins("http://localhost:3000");
                registry.addMapping("/api/product/**").allowedOrigins("http://localhost:3000");
            }
        };
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    CommandLineRunner run(UserService userService){
//        return args -> {
//            userService.saveRole(new UserRole(null,"ROLE_ADMINISTRATOR"));
//            userService.saveRole(new UserRole(null,"ROLE_PURCHASING_MANAGER"));
//            userService.saveRole(new UserRole(null,"ROLE_PURCHASING_STAFF"));
//            userService.saveRole(new UserRole(null,"ROLE_SITE_MANAGER"));
//            userService.saveRole(new UserRole(null,"ROLE_WAREHOUSE_MANAGER"));
//            userService.saveRole(new UserRole(null,"ROLE_SUPPLIER"));
//            userService.saveRole(new UserRole(null,"ROLE_PROJECT_MANAGER"));
//
//            userService.saveUser(new AppUser(null,"Yohan Nayanajith","Yohan","1234","yohan@gmail.com","EMP0001","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Minura Rathnayake","Minura","1234","minura@gmail.com","EMP0002","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Suwasana Dammithu","Suwasana","1234","suwa@gmail.com","EMP0003","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Punsisi Perera","Punsisi","1234","punsisi@gmail.com","EMP0004","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Tara Peries","Tara","1234","tara@gmail.com","EMP0005","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Navod Kamilka","Kamilka","1234","navod@gmail.com","EMP0006","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Roneki Bakka","Roneki","1234","roneki@gmail.com","EMP0007","0758657450",new ArrayList<>()));
//
//            userService.addRoleToUser("Yohan","ROLE_ADMINISTRATOR");
//            userService.addRoleToUser("Minura","ROLE_PURCHASING_MANAGER");
//            userService.addRoleToUser("Suwasana","ROLE_PURCHASING_STAFF");
//            userService.addRoleToUser("Punsisi","ROLE_SITE_MANAGER");
//            userService.addRoleToUser("Tara","ROLE_WAREHOUSE_MANAGER");
//            userService.addRoleToUser("Kamilka","ROLE_SUPPLIER");
//            userService.addRoleToUser("Roneki","ROLE_PROJECT_MANAGER");
//        };
//    }

}
