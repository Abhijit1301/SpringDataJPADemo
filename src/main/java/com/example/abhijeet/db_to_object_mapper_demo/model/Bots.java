package com.example.abhijeet.db_to_object_mapper_demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@Entity(name = "bots")
@PrimaryKeyJoinColumn(name = "player_id")
public class Bots extends Players{
    private int bot_rank;
}
