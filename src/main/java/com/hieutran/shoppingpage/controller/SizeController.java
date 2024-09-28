package com.hieutran.shoppingpage.controller;

import com.hieutran.shoppingpage.dto.SizeDto;
import com.hieutran.shoppingpage.service.SizeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sizes")
public class SizeController {
    private SizeService sizeService;

    public SizeController(SizeService sizeService) {
        this.sizeService = sizeService;
    }

    @GetMapping
    public ResponseEntity<List<SizeDto>> getSizes() {
        return ResponseEntity.ok(sizeService.getSizes());
    }
}
