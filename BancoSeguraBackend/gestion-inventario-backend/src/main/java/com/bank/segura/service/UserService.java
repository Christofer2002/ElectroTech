package com.bank.segura.service;

import com.bank.segura.exception.ResourceNotFoundException;
import com.bank.segura.modelo.User;
import com.bank.segura.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> usersList() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User userListById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el user con el id: " + id));
    }

    public void eliminateUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el usuario con el id: " + id));

        userRepository.delete(user);
    }
}
