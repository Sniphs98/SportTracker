package com.example.SportTracker.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.UUID;

@Entity
public class SportsSchedule {

    @Id
    @GeneratedValue
    public UUID id;

    public String name;

    public List<SportsSchedule> sportsScheduleList;
}
