package org.zhouhy.online.education.mapper;

import org.zhouhy.online.education.domains.User;
import java.util.HashMap;
import java.util.Map;

public class UserMapper {
    private static final Map<String, User> userMap = new HashMap<>();
    static {
        userMap.put("张三",new User(1L,"张三","123"));
        userMap.put("李四",new User(2L,"李四","456"));
    }
}
