package com.emse.spring.faircorp.model;

public class LightDto {

    private Long id;
    private Integer level;
    private Status status;
    private Long roomid;

    public LightDto() {
    }

    public LightDto(Light light) {
        this.id = light.getId();
        this.level = light.getLevel();
        this.status = light.getStatus();
        this.roomid = light.getRoom().getId();
    }

    public Long getId() {
        return id;
    }

    public Integer getLevel() {
        return level;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }
}
