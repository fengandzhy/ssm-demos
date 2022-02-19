package org.zhouhy.spring.boot.beginning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/vi/videos")
public class VideoController {
    
    @RequestMapping(value = "/map",method = RequestMethod.GET)
    public Object getMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java 视频");
        map.put(2,"HTML 视频");
        return map;
    }
}
