package com.example.RentCar.Service.Carro;

import java.util.List;

import com.example.RentCar.dto.Carro.CarroDTO;

public interface CarroService {
    // CRUD
    public CarroDTO createCarro(CarroDTO carroDTO);

    public CarroDTO getCarroById(Long id);

    public List<CarroDTO> getAllCarros();
}
