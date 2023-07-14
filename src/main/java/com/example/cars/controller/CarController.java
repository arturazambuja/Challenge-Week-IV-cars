package com.example.cars.controller;

import com.example.cars.dto.CarRequestDTO;
import com.example.cars.entity.Car;
import com.example.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {
    public CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping("/post")
    public ResponseEntity<String> postCar(@RequestBody @Valid CarRequestDTO carDTO){
        try {
            System.out.println(carDTO);
            carService.saveCar(carDTO);
            return ResponseEntity.ok("Car saved successfully." + toString());
        }catch(IllegalArgumentException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @GetMapping("/get/{idChassi}")
    public Car getCarById(@PathVariable("idChassi") Long idChassi){
        return carService.getCarById(idChassi);
    }
}
