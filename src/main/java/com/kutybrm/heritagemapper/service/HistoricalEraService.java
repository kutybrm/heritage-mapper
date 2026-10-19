package com.kutybrm.heritagemapper.service;

import com.kutybrm.heritagemapper.entity.HistoricalEra;
import com.kutybrm.heritagemapper.repository.HistoricalEraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoricalEraService {

    private final HistoricalEraRepository historicalEraRepository;

    public List<HistoricalEra> getAllEras() {
        return historicalEraRepository.findAll();
    }

    public HistoricalEra saveEra(HistoricalEra era) {
        return historicalEraRepository.save(era);
    }
}