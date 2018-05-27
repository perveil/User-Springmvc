package org.User.mapper;

import org.User.model.User;

import java.util.List;

public interface UserMapper {

    int insert(User record);
    List<User> selectAll();
}