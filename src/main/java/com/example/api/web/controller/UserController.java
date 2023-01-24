package com.example.api.web.controller;

import com.example.api.persistence.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User julio = new User("1", "Julio Grey", "julioflex@gmail.com");
        User julia = new User("2", "Julia Afonso", "afonsinha@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(julio, julia));
        return ResponseEntity.ok().body(list);
    }
}
