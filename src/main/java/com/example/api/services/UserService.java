package com.example.api.services;

import com.example.api.persistence.entities.User;
import com.example.api.persistence.repository.UserRepository;
import com.example.api.services.exception.ObjectNotFoundException;
import com.example.api.web.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id){

        User user = repository.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Object Not Found!");
        }
        return user;
    }

    public User insert(User user) {
        return repository.insert(user);
    }


    public void delete(String id) {
        repository.deleteById(id);
    }

    public User update(User user){
        User newUser = repository.findById(user.getId()).orElse(null);
        updateData(newUser, user);
        return repository.save(newUser);
    }

    private void updateData(User newUser, User user){
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
    }

    public User fromDTO(UserDTO userDto) {
        return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
    }
}
