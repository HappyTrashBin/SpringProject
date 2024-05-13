package com.example.SpringProject;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public User getUser(int id) {
        return userRepository.findById(id).get();
    }
}
