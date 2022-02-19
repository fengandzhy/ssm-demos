package org.zhouhy.online.education.domains;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private long id;
    private String username;
    private String password;
    
    public User(){}
    
    public User(long id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
