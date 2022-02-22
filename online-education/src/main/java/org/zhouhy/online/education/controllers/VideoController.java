package org.zhouhy.online.education.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private VideoService videoService;

    //@RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    public JsonData list() throws JsonProcessingException {

        List<Video> list =  videoService.listVideo();



        return JsonData.buildSuccess(list);
    }



    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){

        System.out.println(video.toString());

        return JsonData.buildSuccess(video);

    }





}
