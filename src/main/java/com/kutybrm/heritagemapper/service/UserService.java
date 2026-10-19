package com.kutybrm.heritagemapper.service;

import com.kutybrm.heritagemapper.entity.User;
import com.kutybrm.heritagemapper.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    // Final tanımladığımız için Lombok (@RequiredArgsConstructor) bizim yerimize bağlantıyı (injection) kuruyor.
    private final UserRepository userRepository;

    // Tüm kullanıcıları getiren metod
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Yeni kullanıcı kaydeden metod
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}