package com.example.abhijeet.db_to_object_mapper_demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@Entity(name = "players")
@Inheritance(strategy = InheritanceType.JOINED)
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;
    private String name;
    private int age;
}
