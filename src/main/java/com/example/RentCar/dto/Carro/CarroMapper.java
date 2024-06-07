package com.example.RentCar.dto.Carro;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.RentCar.Entities.Carro;

@Mapper
public interface CarroMapper {
    CarroMapper INSTANCE = Mappers.getMapper(CarroMapper.class);

    public CarroDTO carroToCarroDTO(Carro carro);

    public Carro carroDTOToCarro(CarroDTO carroDTO);
}
