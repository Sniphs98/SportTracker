package com.example.SportTracker.repository;

import com.example.SportTracker.entity.SportsSchedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DataRepository extends CrudRepository<UUID, SportsSchedule> {
}
