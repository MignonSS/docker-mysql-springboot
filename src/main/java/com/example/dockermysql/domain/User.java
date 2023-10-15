package com.example.dockermysql.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 회원 식별자, 기본키

    @Column
    private String name;
}
