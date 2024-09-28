package com.hieutran.shoppingpage.service;

import com.hieutran.shoppingpage.dto.SizeDto;
import com.hieutran.shoppingpage.mapper.SizeMapper;
import com.hieutran.shoppingpage.repository.SizeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    private SizeRepository sizeRepository;
    private SizeMapper sizeMapper;

    public SizeService(SizeRepository sizeRepository, SizeMapper sizeMapper) {
        this.sizeRepository = sizeRepository;
        this.sizeMapper = sizeMapper;
    }

    public List<SizeDto> getSizes() {
        return sizeRepository.findAll().stream().map(sizeMapper::toDto).toList();
    }
}
