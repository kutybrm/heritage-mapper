package com.kutybrm.heritagemapper.repository;

import com.kutybrm.heritagemapper.entity.HistoricalEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricalEventRepository extends JpaRepository<HistoricalEvent, Long> {
    List<HistoricalEvent> findByLocationId(Long locationId);
    List<HistoricalEvent> findByEraId(Long eraId);
}