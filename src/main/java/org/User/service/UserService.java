package org.User.service;

import org.User.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserService {
    public List<User> getUserList();
}
