package org.zhouhy.online.education.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhouhy.online.education.services.VideoService;



@RestController
@RequestMapping("/api/vi/videos")
public class VideoController {
    
    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/list")
    public Object listVideos(){
        return videoService.listVideos();
    }
}
