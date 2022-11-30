package com.example.authApp.service;

import com.example.authApp.model.User;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public void saveUser(User user);
    public User getUserByNameAndPassword(String name, String password) throws ObjectNotFoundException;

}
