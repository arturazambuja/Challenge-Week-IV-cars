package com.example.cars.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chassi", unique = true, nullable = false)
    private long idChassi;
    @NotBlank(message = "Name cannot be empty")
    @Column(name = "name", nullable = false)
    private String name;
    @NotBlank(message = "Brand cannot be empty")
    @Column(name = "brand", nullable = false)
    private String brand;
    @NotBlank(message = "Color cannot be empty")
    @Column(name = "color", nullable = false)
    private String color;
    @NotBlank(message = "Fabrication Year cannot be empty")
    @Column(name = "fabrication_year", nullable = false)
    private String fabricationYear;

    public long getIdChassi() {
        return idChassi;
    }

    public void setIdChassi(long idChassi) {
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
    public Car(){

    }
    public Car(long idChassi, String name, String brand, String color, String fabricationYear) {
        this.idChassi = idChassi;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idChassi=" + idChassi +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}
