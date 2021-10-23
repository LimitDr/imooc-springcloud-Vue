package com.Lyle.business.controller.admin;

import com.Lyle.server.domain.Chapter;
import com.Lyle.server.dto.ChapterDto;
import com.Lyle.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/chapter")
    public List<ChapterDto> chapter(){
        return chapterService.list();
    }
}