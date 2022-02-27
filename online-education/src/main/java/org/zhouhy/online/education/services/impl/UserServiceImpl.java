package org.zhouhy.online.education.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhouhy.online.education.domains.User;
import org.zhouhy.online.education.mapper.UserMapper;
import org.zhouhy.online.education.services.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private static Map<String,User> sessionMap = new HashMap<>();


    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String login(String username, String pwd) {
        LOGGER.info("In the login method!");
        User user = userMapper.login(username,pwd);

        if(user==null){
            return null;
        }else {

            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }

    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
