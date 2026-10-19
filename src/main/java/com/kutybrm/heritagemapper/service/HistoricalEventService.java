package com.kutybrm.heritagemapper.service;

import com.kutybrm.heritagemapper.entity.HistoricalEvent;
import com.kutybrm.heritagemapper.repository.HistoricalEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoricalEventService {

    private final HistoricalEventRepository historicalEventRepository;

    public List<HistoricalEvent> getAllEvents() {
        return historicalEventRepository.findAll();
    }

    public HistoricalEvent saveEvent(HistoricalEvent event) {
        return historicalEventRepository.save(event);
    }
}