package com.hieutran.shoppingpage.service;

import com.hieutran.shoppingpage.dto.ColorDto;
import com.hieutran.shoppingpage.entity.Color;
import com.hieutran.shoppingpage.mapper.ColorMapper;
import com.hieutran.shoppingpage.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {
    private ColorRepository colorRepository;
    private ColorMapper colorMapper;

    @Autowired
    public ColorService(ColorRepository colorRepository, ColorMapper colorMapper) {
        this.colorRepository = colorRepository;
        this.colorMapper = colorMapper;
    }

    public List<ColorDto> getColors() {
        List<Color> colors = colorRepository.findAll();
        return colors.stream().map(colorMapper::toDto).toList();
    }
}
