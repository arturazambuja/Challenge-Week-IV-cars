package com.example.cars.service;

import com.example.cars.dto.CarRequestDTO;
import com.example.cars.entity.Car;
import com.example.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public void saveCar(CarRequestDTO carRequestDTO) {
        System.out.println(validBrand(carRequestDTO.getBrand()));
        if (!validBrand(carRequestDTO.getBrand())) {
            throw new IllegalArgumentException("This car brand is invalid");
        }

        Car car = new Car();
        car.setName(carRequestDTO.getName());
        car.setBrand(carRequestDTO.getBrand());
        car.setColor(carRequestDTO.getColor());
        car.setFabricationYear(carRequestDTO.getFabricationYear());

        carRepository.save(car);

    }
    public boolean validBrand(String brand){
        System.out.println(brand);
        List<String> validBrands = Arrays.asList("Ford", "Chevrolet", "BMW", "Volvo");
        return validBrands.contains(brand);
    }

    public Car getCarById(long idChassi) {

         return carRepository.findById(idChassi)
                .orElseThrow(() -> new IllegalArgumentException("No car with this chassis id"));
    }
}
