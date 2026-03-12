package com.example.vyaparpe.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_profile")
@Data
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bio")
    private String bio;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
