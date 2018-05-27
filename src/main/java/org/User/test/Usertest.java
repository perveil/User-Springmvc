package org.User.test;

import org.User.service.Impl.UserServiceImpl;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:/spring/spring-mybatis.xml"})
public class Usertest {
    public static void main(String[] args) {
        UserServiceImpl Impl=new UserServiceImpl();
        Impl.getUserList();
    }
}
