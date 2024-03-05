package com.bank.segura.controller;

import com.bank.segura.modelo.User;
import com.bank.segura.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/gestion-inventario")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> usersList() {
        return userService.usersList();
    }

    @PostMapping("/productos")
    public User agregarProducto(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id) {
        User user = userService.userListById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Void> eliminateUser(@PathVariable String id) {
        long idUser = Long.parseLong(id);
        userService.eliminateUser(idUser);
        return ResponseEntity.ok().build();
    }
}
