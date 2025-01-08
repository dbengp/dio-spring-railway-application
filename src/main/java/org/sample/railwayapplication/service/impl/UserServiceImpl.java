package org.sample.railwayapplication.service.impl;

import org.sample.railwayapplication.domain.model.User;
import org.sample.railwayapplication.domain.repository.UserRepository;
import org.sample.railwayapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        if(user.getId() != null && userRepository.existsById(user.getId()))
            throw new IllegalArgumentException("Usuario já existe na base!");
        return userRepository.save(user);
    }

}
