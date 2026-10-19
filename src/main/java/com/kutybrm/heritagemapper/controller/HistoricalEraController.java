package com.kutybrm.heritagemapper.controller;

import com.kutybrm.heritagemapper.entity.HistoricalEra;
import com.kutybrm.heritagemapper.service.HistoricalEraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eras")
@RequiredArgsConstructor
public class HistoricalEraController {

    private final HistoricalEraService historicalEraService;

    @GetMapping
    public List<HistoricalEra> getAllEras() {
        return historicalEraService.getAllEras();
    }

    @PostMapping
    public HistoricalEra createEra(@RequestBody HistoricalEra era) {
        return historicalEraService.saveEra(era);
    }
}