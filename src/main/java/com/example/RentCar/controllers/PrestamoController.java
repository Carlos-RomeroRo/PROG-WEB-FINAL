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
import java.util.List;

import com.example.RentCar.Service.Carro.CarroServiceImpl;
import com.example.RentCar.Service.Prestamo.PrestamoServiceImpl;
import com.example.RentCar.Service.Usuario.UsuarioServiceImpl;
import com.example.RentCar.dto.Carro.CarroDTO;
import com.example.RentCar.dto.Prestamo.PrestamoDTO;
import com.example.RentCar.dto.Usuario.UsuarioDTO;

@RestController
@RequestMapping("/api/v1/prestamos")

public class PrestamoController {

    @Autowired
    private PrestamoServiceImpl prestamoServiceImpl;
    @Autowired
    private CarroServiceImpl carroServiceImpl;
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @GetMapping("")
    public ResponseEntity<HashMap<String, Object>> getAllPrestamos() {
        HashMap<String, Object> response = new HashMap<>();

        List<PrestamoDTO> prestamos = prestamoServiceImpl.getAllPrestamos();
        if (prestamos.isEmpty()) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        response.put("prestamos", prestamos);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HashMap<String, Object>> getPrestamoById(@PathVariable("id") Long id) {
        HashMap<String, Object> response = new HashMap<>();

        PrestamoDTO prestamos = prestamoServiceImpl.getPrestamoById(id);
        if (prestamos == null) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        UsuarioDTO usuario = usuarioServiceImpl.GetUsuarioById(prestamos.getUsuario_id());
        if (usuario == null) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        CarroDTO carro = carroServiceImpl.getCarroById(prestamos.getCarro_id());
        if (carro == null) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        response.put("prestamo", prestamos);
        response.put("usuario", usuario);
        response.put("carro", carro);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<HashMap<String, Object>> CreatePrestamo(@RequestBody PrestamoDTO newPrestamo) {

        HashMap<String, Object> response = new HashMap<>();

        PrestamoDTO prestamos = prestamoServiceImpl.CreatePrestamo(newPrestamo);

        if (prestamos == null) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        response.put("success", prestamos);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
