package com.kutybrm.heritagemapper.controller;

import com.kutybrm.heritagemapper.entity.HistoricalEvent;
import com.kutybrm.heritagemapper.service.HistoricalEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class HistoricalEventController {

    private final HistoricalEventService historicalEventService;

    @GetMapping
    public List<HistoricalEvent> getAllEvents() {
        return historicalEventService.getAllEvents();
    }

    @PostMapping
    public HistoricalEvent createEvent(@RequestBody HistoricalEvent event) {
        return historicalEventService.saveEvent(event);
    }
}