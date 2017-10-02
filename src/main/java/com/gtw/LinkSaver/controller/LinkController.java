package com.gtw.LinkSaver.controller;

import com.gtw.LinkSaver.dto.LinkDto;
import com.gtw.LinkSaver.model.Link;
import com.gtw.LinkSaver.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/link")
public class LinkController {
    @Autowired
    LinkService linkService;


    @RequestMapping(method = RequestMethod.POST)
    public Link saveLink(@RequestBody LinkDto linkDto){
        return linkService.saveLink(linkDto);
    }
}
