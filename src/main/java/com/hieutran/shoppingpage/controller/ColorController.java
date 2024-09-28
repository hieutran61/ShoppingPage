package com.hieutran.shoppingpage.controller;

import com.hieutran.shoppingpage.dto.ColorDto;
import com.hieutran.shoppingpage.service.ColorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorController {
    private ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping
    public ResponseEntity<List<ColorDto>> getColors() {
        return ResponseEntity.ok(colorService.getColors());
    }
}
