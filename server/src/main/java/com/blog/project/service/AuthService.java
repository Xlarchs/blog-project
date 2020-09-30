package com.blog.project.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    /**
     * @return Current User
     * AKTİF KULLANICIYI ALIYORUZ
     */
    public Optional<org.springframework.security.core.userdetails.User> getCurrentUser() {
        User principal = (org.springframework.security.core.userdetails.User) SecurityContextHolder.
                getContext().
                getAuthentication().
                getPrincipal();
        return Optional.of(principal);
    }
}
