package com.kutybrm.heritagemapper.service;

import com.kutybrm.heritagemapper.entity.ArtifactValidation;
import com.kutybrm.heritagemapper.repository.ArtifactValidationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtifactValidationService {

    private final ArtifactValidationRepository validationRepository;

    public List<ArtifactValidation> getAllValidations() {
        return validationRepository.findAll();
    }

    public ArtifactValidation saveValidation(ArtifactValidation validation) {
        return validationRepository.save(validation);
    }
}