package org.zhouhy.online.education.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.zhouhy.online.education.domains.Video;
import org.zhouhy.online.education.mapper.VideoMapper;
import org.zhouhy.online.education.services.VideoService;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {


    @Autowired
    private VideoMapper videoMapper;


    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
