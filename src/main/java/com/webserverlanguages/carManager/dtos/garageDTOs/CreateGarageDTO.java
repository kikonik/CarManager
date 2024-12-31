package com.webserverlanguages.carManager.dtos.garageDTOs;


import java.time.LocalDateTime;


public class CreateGarageDTO {
    private Long garageId;

    private String name;

    private String location;

    private LocalDateTime city;

    private Integer capacity;

    public CreateGarageDTO(Long garageId, String name, String location, LocalDateTime city, Integer capacity) {
        this.garageId = garageId;
        this.name = name;
        this.location = location;
        this.city = city;
        this.capacity = capacity;
    }

    public CreateGarageDTO() {
    }

    public Long getGarageId() {
        return garageId;
    }

    public void setGarageId(Long garageId) {
        this.garageId = garageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCity() {
        return city;
    }

    public void setCity(LocalDateTime city) {
        this.city = city;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
