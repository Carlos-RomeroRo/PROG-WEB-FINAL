package com.example.RentCar.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RentCar.Service.Prestamo.PrestamoServiceImpl;
import com.example.RentCar.dto.Prestamo.PrestamoDTO;

@RestController
@RequestMapping("/api/v1/prestamos")

public class PrestamoController {

    @Autowired
    private PrestamoServiceImpl prestamoServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<HashMap<String, Object>> getPrestamoById(@PathVariable("id") Long id) {
        HashMap<String, Object> response = new HashMap<>();

        PrestamoDTO prestamos = prestamoServiceImpl.getPrestamoById(id);
        if (prestamos == null) {
            response.put("error", "There was an error getting the prestamo");
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        response.put("prestamo", prestamos);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<HashMap<String, Object>> CreatePrestamo(@RequestBody PrestamoDTO newPrestamo) {

        HashMap<String, Object> response = new HashMap<>();

        PrestamoDTO prestamos = prestamoServiceImpl.CreatePrestamo(newPrestamo);

        if (prestamos == null) {
            response.put("error", "There was an error creating the prestamo");
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        response.put("success", prestamos);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
