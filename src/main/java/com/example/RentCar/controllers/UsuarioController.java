package com.example.RentCar.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RentCar.Service.Usuario.UsuarioServiceImpl;
import com.example.RentCar.dto.Usuario.UsuarioDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/users")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("")
    public ResponseEntity<HashMap<String, Object>> CreateUser(@RequestBody UsuarioDTO newUser) {

        HashMap<String, Object> response = new HashMap<>();

        UsuarioDTO userCreated = usuarioServiceImpl.CreateUsuario(newUser);

        if (userCreated == null) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }

        response.put("success", userCreated);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HashMap<String, Object>> getuserById(@PathVariable("id") Long id) {
        HashMap<String, Object> response = new HashMap<>();
        UsuarioDTO user = usuarioServiceImpl.GetUsuarioById(id);
        if (user == null) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}