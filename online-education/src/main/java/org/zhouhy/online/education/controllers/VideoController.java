package org.zhouhy.online.education.controllers;

import org.springframework.web.bind.annotation.*;
import org.zhouhy.online.education.domains.Video;
import org.zhouhy.online.education.services.VideoService;
import org.zhouhy.online.education.utils.JsonData;

import java.util.List;

/**
 * 视频控制器
 */


@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {


    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    //@RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    public JsonData list() {
        List<Video> list =  videoService.listVideo();
        return JsonData.buildSuccess(list);
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){
        System.out.println(video.toString());
        return JsonData.buildSuccess(video);
    }





}
