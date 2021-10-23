package com.Lyle.business.controller;

import com.Lyle.server.domain.Chapter;
import com.Lyle.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BusinessController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/chapter")
    public List<Chapter> chapter(){
        return chapterService.list();
    }
}
