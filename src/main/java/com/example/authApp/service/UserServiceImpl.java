package com.example.authApp.service;

import com.example.authApp.model.User;
import com.example.authApp.repository.UserRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);

    }

    @Override
    public User getUserByNameAndPassword(String name, String password) throws ObjectNotFoundException {
        User user = userRepository.findByUserNameAndPassword(name, password);
        if (user == null) {
            throw new ObjectNotFoundException("Invalid id and password " + user.getUserName(), user.getPassword());
        }
        return user;
    }
}
