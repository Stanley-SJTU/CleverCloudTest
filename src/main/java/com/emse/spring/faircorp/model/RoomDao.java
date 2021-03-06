package com.emse.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomDao extends JpaRepository<Room, Long> {
    @Query("select c from Room c where c.name=:name")  // (2)
    Room findByName(@Param("name") String name);

    @Modifying
    @Query("delete from Room c where c.name = ?1")
    void deleteByName(String name);
}
