package com.example.backend.service;

import com.example.backend.model.AppUser;
import com.example.backend.model.UserRole;
import com.example.backend.repository.UserRepository;
import com.example.backend.repository.UserRoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepository userRepo;
    private final UserRoleRepository userRoleRepository;

    @Override
    public AppUser saveUser(AppUser appUser) {
        log.info("Saving ne user {} to the database",appUser.getUsername());
        return userRepo.save(appUser);
    }

    @Override
    public UserRole saveRole(UserRole userRole) {
        log.info("Saving ne role {} to the database",userRole.getName());
        return userRoleRepository.save(userRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}",roleName,username);
        AppUser appUser = userRepo.findByUsername(username);
        UserRole userRole = userRoleRepository.findByName(roleName);
        appUser.getRoles().add(userRole);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching user {}",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUser() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
