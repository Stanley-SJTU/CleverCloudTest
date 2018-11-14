package com.emse.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface LightDao extends JpaRepository<Light, Long>, LightDaoCustom {
    List<Light> findByRoomId(String roomId); // (1)


}
