package com.example.vyaparpe.repository;


import com.example.vyaparpe.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface profileRepository extends JpaRepository<Profile,Long> {
}
