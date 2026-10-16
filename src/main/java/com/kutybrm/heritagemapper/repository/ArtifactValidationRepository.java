package com.kutybrm.heritagemapper.repository;

import com.kutybrm.heritagemapper.entity.ArtifactValidation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtifactValidationRepository extends JpaRepository<ArtifactValidation, Long> {
}