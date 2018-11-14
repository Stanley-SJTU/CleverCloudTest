package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 255)
    private Integer floor;

    @Column(nullable = false, length = 255)
    private String name;

    @OneToMany(mappedBy = "room")
    private Set<Light> light;

    public Room() {
    }

    public Room(Integer floor, String name) {
        this.floor = floor;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

