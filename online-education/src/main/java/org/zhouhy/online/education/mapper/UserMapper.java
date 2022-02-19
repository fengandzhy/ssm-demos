package org.zhouhy.online.education.mapper;

import org.zhouhy.online.education.domains.User;
import java.util.HashMap;
import java.util.Map;

public class UserMapper {
    private static final Map<Long, User> userMap = new HashMap<>();
    static {
        userMap.put(1L,new User(1L,"张三","123"));
        userMap.put(2L,new User(2L,"李四","456"));
    }
}
