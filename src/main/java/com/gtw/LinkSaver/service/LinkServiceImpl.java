package com.gtw.LinkSaver.service;

import com.gtw.LinkSaver.dto.LinkDto;
import com.gtw.LinkSaver.model.Link;
import com.gtw.LinkSaver.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LinkServiceImpl implements LinkService {
    @Autowired
    LinkRepository linkRepository;

    @Transactional
    public Link saveLink(LinkDto dto){
        Link link = new Link();
        link.setId(dto.getId());
        link.setAddress(dto.getAddress());
        Link link2 = linkRepository.save(link);
        return link2;
    }
}
