package com.example.vyaparpe.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Profile;

@Entity
@Data
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email_address")
    private String emailId;

    @OneToOne
    @JoinColumn(name="profile_id")
        private Profile profile;
}
