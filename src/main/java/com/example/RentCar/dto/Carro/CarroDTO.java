
package com.example.RentCar.dto.Carro;

import java.util.Date;

import lombok.Data;

@Data
public class CarroDTO {
    private Long id_carro;
    private String marca;
    private String modelo;
    private String color;
    private String ciudad;
    private String imagen;
    private Double precio;
}
