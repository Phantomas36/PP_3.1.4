package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;
import java.util.List;

public interface UserService {

    void updateUser(User user, Long id);
    User findByUsername(String username);
    User findByEmail(String email);
    User saveUser(User user);
    void deleteById(Long id);
    List<User> findAll();
    User findById(Long id);
}
