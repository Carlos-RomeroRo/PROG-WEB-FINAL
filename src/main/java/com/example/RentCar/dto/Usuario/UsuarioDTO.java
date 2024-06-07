package com.example.RentCar.dto.Usuario;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id_usuario;
    private String nombre;
    private String apellido;
    private Long cedula;
    private String direccion;
    private Long telefono;
}
