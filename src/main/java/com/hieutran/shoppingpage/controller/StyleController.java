package com.hieutran.shoppingpage.controller;

import com.hieutran.shoppingpage.dto.StyleDto;
import com.hieutran.shoppingpage.service.StyleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/styles")
public class StyleController {
    private StyleService styleService;

    public StyleController(StyleService styleService) {
        this.styleService = styleService;
    }

    @GetMapping
    public ResponseEntity<List<StyleDto>> getStyles() {
        return ResponseEntity.ok(styleService.getStyles());
    }
}
