package com.example.vyaparpe.repository;

import com.example.vyaparpe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
}
