package org.User.service.Impl;

import org.User.mapper.UserMapper;
import org.User.model.User;
import org.User.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Component
public class UserServiceImpl implements UserService {
   @Resource
   private UserMapper userMapper;
    @Override
    public List<User> getUserList(){
        return  this.userMapper.selectAll();
    }
}
