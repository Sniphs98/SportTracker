package com.example.SportTracker.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Map;
import java.util.UUID;

@Entity
public class Exercise {

    @Id
    @GeneratedValue
    public UUID id;

    public String name;

    public Map<Integer,Integer> exerciseSet;

}
