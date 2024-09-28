package com.hieutran.shoppingpage.service;

import com.hieutran.shoppingpage.dto.StyleDto;
import com.hieutran.shoppingpage.mapper.StyleMapper;
import com.hieutran.shoppingpage.repository.StyleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleService {
    private StyleRepository styleRepository;
    private StyleMapper styleMapper;

    public StyleService(StyleRepository styleRepository, StyleMapper styleMapper) {
        this.styleRepository = styleRepository;
        this.styleMapper = styleMapper;
    }

    public List<StyleDto> getStyles() {
        return styleRepository.findAll().stream().map(styleMapper::toDto).toList();
    }
}
