package com.kutybrm.heritagemapper.controller;

import com.kutybrm.heritagemapper.entity.ArtifactValidation;
import com.kutybrm.heritagemapper.service.ArtifactValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/validations")
@RequiredArgsConstructor
public class ArtifactValidationController {

    private final ArtifactValidationService validationService;

    @GetMapping
    public List<ArtifactValidation> getAllValidations() {
        return validationService.getAllValidations();
    }

    @PostMapping
    public ArtifactValidation createValidation(@RequestBody ArtifactValidation validation) {
        return validationService.saveValidation(validation);
    }
}