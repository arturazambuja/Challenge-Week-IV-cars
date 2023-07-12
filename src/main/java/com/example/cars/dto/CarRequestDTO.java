package com.example.cars.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.*;

import javax.validation.constraints.NotBlank;

public class CarRequestDTO {

    public CarRequestDTO(){

    }
    public CarRequestDTO(Long idChassi, String name, String brand, String color, String fabricationYear) {
        this.idChassi = idChassi;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }
    private Long idChassi;

    @NotBlank(message = "Name cannot be empty")
    @JsonProperty("name")
    private String name;
    @NotBlank(message = "Brand cannot be empty")
    @JsonProperty("brand")
    private String brand;
    @NotBlank(message = "Color cannot be empty")
    @JsonProperty("color")
    private String color;
    @NotBlank(message = "Fabrication year cannot be empty")
    @JsonProperty("fabrication_year")
    private String fabricationYear;


    public Long getIdChassi() {
        return idChassi;
    }

    public void setIdChassi(Long idChassi) {
        this.idChassi = idChassi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "CarRequestDTO{" +
                "idChassi=" + idChassi +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}
