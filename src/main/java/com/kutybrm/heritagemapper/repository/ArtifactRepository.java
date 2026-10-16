package com.kutybrm.heritagemapper.repository;

import com.kutybrm.heritagemapper.entity.Artifact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtifactRepository extends JpaRepository<Artifact, Long> {
    List<Artifact> findByLocationId(Long locationId);
    List<Artifact> findByVerifiedTrue(); // Sadece onaylanmış (verified = true) eserleri getirir
}