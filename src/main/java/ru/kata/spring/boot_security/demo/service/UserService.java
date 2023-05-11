package ru.kata.spring.boot_security.demo.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    @Transactional
    void updateUser(User user, Long id);

    User findByUsername(String username);

    User findByEmail(String email);

    @Transactional
    User saveUser(User user);

    @Transactional
    void deleteById(Long id);

    List<User> findAll();

    User findById(Long id);
}
