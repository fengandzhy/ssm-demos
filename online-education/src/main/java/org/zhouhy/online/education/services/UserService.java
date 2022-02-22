package org.zhouhy.online.education.services;


import org.zhouhy.online.education.domains.User;

import java.util.List;

public interface UserService {

    String login(String username, String pwd);


    List<User> listUser();

}
