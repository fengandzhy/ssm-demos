package org.zhouhy.online.education.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhouhy.online.education.domains.Video;
import org.zhouhy.online.education.mapper.VideoMapper;
import org.zhouhy.online.education.services.VideoService;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    
    private final VideoMapper videoMapper;

    public VideoServiceImpl(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    @Override
    public List<Video> listVideos() {
        return videoMapper.listVideos();
    }
}
