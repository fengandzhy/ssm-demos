package org.zhouhy.online.education.domains;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Video implements Serializable {
    private long id;
    private String title;
    private String summary;
    private BigDecimal price;
    private String coverImg;
    private Date createTime;  
    
    public Video(){}
    
    public Video(long id, String title){
        this.id = id;
        this.title = title;
        this.createTime = new Date();
    }
}
