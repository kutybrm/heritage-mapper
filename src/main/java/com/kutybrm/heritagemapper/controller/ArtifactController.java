package com.kutybrm.heritagemapper.controller;

import com.kutybrm.heritagemapper.entity.Artifact;
import com.kutybrm.heritagemapper.service.ArtifactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artifacts")
@RequiredArgsConstructor
public class ArtifactController {

    private final ArtifactService artifactService;

    @GetMapping
    public List<Artifact> getAllArtifacts() {
        return artifactService.getAllArtifacts();
    }

    @GetMapping("/verified")
    public List<Artifact> getVerifiedArtifacts() {
        return artifactService.getVerifiedArtifacts();
    }

    @PostMapping
    public Artifact createArtifact(@RequestBody Artifact artifact) {
        return artifactService.saveArtifact(artifact);
    }
}