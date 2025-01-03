package com.webserverlanguages.carManager.dtos.garageDTOs;


import java.time.LocalDateTime;

public class UpdateGarageDTO {

    private String name;

    private String location;

    private LocalDateTime city;

    private Integer capacity;

    public UpdateGarageDTO(String name, String location, LocalDateTime city, Integer capacity) {
        this.name = name;
        this.location = location;
        this.city = city;
        this.capacity = capacity;
    }

    public UpdateGarageDTO() {
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
