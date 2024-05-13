package com.example.SpringProject;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(int id) {
        Optional<User> foundedUser = userRepository.findById(id);
        return foundedUser;
    }
}
