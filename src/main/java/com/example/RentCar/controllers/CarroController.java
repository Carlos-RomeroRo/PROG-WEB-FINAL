package com.example.RentCar.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RentCar.Service.Carro.CarroServiceImpl;
import com.example.RentCar.dto.Carro.CarroDTO;

@RestController
@RequestMapping("/api/v1/cars")
public class CarroController {

    @Autowired
    private CarroServiceImpl carroServiceImpl;

    @GetMapping("")
    public ResponseEntity<HashMap<String, Object>> getAllCarros() {

        HashMap<String, Object> response = new HashMap<>();
        List<CarroDTO> carros = carroServiceImpl.getAllCarros();

        if (carros.size() == 0) {
            response.put("error", "There are not cars");
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }

        response.put("carros", carros);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}