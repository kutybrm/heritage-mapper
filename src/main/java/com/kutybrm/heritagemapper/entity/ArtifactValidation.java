package com.kutybrm.heritagemapper.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "artifact_validations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtifactValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artifact_id")
    private Artifact artifact;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "is_valid", nullable = false)
    private Boolean isValid;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;
}