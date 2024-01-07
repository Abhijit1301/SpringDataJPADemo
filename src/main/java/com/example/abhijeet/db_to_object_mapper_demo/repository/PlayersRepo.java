package com.example.abhijeet.db_to_object_mapper_demo.repository;

import com.example.abhijeet.db_to_object_mapper_demo.model.Players;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayersRepo extends CrudRepository<Players, UUID> {
}
