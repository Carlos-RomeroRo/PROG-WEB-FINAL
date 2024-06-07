package com.example.RentCar.dto.Prestamo;

import java.util.Date;

import lombok.Data;

@Data
public class PrestamoDTO {
    private Long id_prestamo;
    private Long usuario_id;
    private Long carro_id;
    private Date fechaInicio;
    private Date fechaFin;
}
