package com.webserverlanguages.carManager.dtos.garageDTOs;


import java.time.LocalDateTime;

public class ResponseGarageDTO {

    private Long garageId;

    private String name;

    private String location;

    private String city;

    private Integer capacity;

    public ResponseGarageDTO(Long garageId, String name, String location, String city, Integer capacity) {
        this.garageId = garageId;
        this.name = name;
        this.location = location;
        this.city = city;
        this.capacity = capacity;
    }

    public ResponseGarageDTO() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
