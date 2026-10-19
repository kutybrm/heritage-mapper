package com.kutybrm.heritagemapper.service;

import com.kutybrm.heritagemapper.entity.Artifact;
import com.kutybrm.heritagemapper.repository.ArtifactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtifactService {

    private final ArtifactRepository artifactRepository;

    public List<Artifact> getAllArtifacts() {
        return artifactRepository.findAll();
    }

    public Artifact saveArtifact(Artifact artifact) {
        return artifactRepository.save(artifact);
    }

    // Sadece topluluk tarafından onaylanmış eserleri getiren özel servis metodu
    public List<Artifact> getVerifiedArtifacts() {
        return artifactRepository.findByVerifiedTrue();
    }
}