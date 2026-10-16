package com.kutybrm.heritagemapper.repository;

import com.kutybrm.heritagemapper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Özel sorgu metodları: Spring Boot ismine bakarak SQL'i kendisi yazar!
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}