package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserDao {

    User getUserByUsername(String username);

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
