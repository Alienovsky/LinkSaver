package com.gtw.LinkSaver.service;

import com.gtw.LinkSaver.dto.LinkDto;
import com.gtw.LinkSaver.model.Link;

public interface LinkService {
    Link saveLink(LinkDto dto);
}
