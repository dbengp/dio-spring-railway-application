package org.sample.railwayapplication.service;

import org.sample.railwayapplication.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User user);

    List<User> findAll();
}
