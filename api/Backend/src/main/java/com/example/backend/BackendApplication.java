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

import java.util.ArrayList;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    CommandLineRunner run(UserService userService){
//        return args -> {
//            userService.saveRole(new UserRole(null,"ROLE_USER"));
//            userService.saveRole(new UserRole(null,"ROLE_MANAGER"));
//            userService.saveRole(new UserRole(null,"ROLE_ADMIN"));
//            userService.saveRole(new UserRole(null,"ROLE_SUPER_ADMIN"));
//
//            userService.saveUser(new AppUser(null,"Yohan Nayanajith","Yohan","1234","yohan@gmail.com","EMP0001","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Minura Rathnayake","Minura","1234","minura@gmail.com","EMP0002","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Suwasana Dammithu","Suwasana","1234","suwa@gmail.com","EMP0003","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Punsisi Perera","Punsisi","1234","punsisi@gmail.com","EMP0004","0758657450",new ArrayList<>()));
//            userService.saveUser(new AppUser(null,"Tara Peries","Tara","1234","tara@gmail.com","EMP0005","0758657450",new ArrayList<>()));
//
//            userService.addRoleToUser("Yohan","ROLE_SUPER_ADMIN");
//            userService.addRoleToUser("Yohan","ROLE_MANAGER");
//            userService.addRoleToUser("Minura","ROLE_MANAGER");
//            userService.addRoleToUser("Suwasana","ROLE_USER");
//            userService.addRoleToUser("Suwasana","ROLE_ADMIN");
//            userService.addRoleToUser("Punsisi","ROLE_USER");
//            userService.addRoleToUser("Tara","ROLE_ADMIN");
//        };
//    }

}
