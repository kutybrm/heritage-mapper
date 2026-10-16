package com.kutybrm.heritagemapper.repository;

import com.kutybrm.heritagemapper.entity.HistoricalEra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricalEraRepository extends JpaRepository<HistoricalEra, Long> {
    // Tüm standart CRUD (Create, Read, Update, Delete) işlemleri JpaRepository'den gelir.
}