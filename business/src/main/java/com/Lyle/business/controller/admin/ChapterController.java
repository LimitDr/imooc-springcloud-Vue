package com.Lyle.business.controller.admin;

import com.Lyle.server.domain.Chapter;
import com.Lyle.server.dto.ChapterDto;
import com.Lyle.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public List<ChapterDto> list(){
        return chapterService.list();
    }
}
