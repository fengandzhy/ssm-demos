package org.zhouhy.online.education.mapper;

import org.zhouhy.online.education.domains.Video;

import java.util.HashMap;
import java.util.Map;

public class VideoMapper {
    private static final Map<Long, Video> videoMap = new HashMap<>();
    static {
        videoMap.put(1L,new Video(1L,"Java 基础"));
        videoMap.put(2L,new Video(2L,"Spring 基础"));
        videoMap.put(3L,new Video(3L,"Hibernate 基础"));
        videoMap.put(4L,new Video(4L,"Spring Boot 基础"));
        videoMap.put(5L,new Video(5L,"Spring Cloud 基础"));
    }
}
