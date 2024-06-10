package com.example.RentCar.Service.Carro;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentCar.Entities.Carro;
import com.example.RentCar.Repositories.CarroRepository;
import com.example.RentCar.dto.Carro.CarroDTO;
import com.example.RentCar.dto.Carro.CarroMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CarroServiceImpl implements CarroService {
    @Autowired
    private CarroRepository carroRepository;

    @Override
    public CarroDTO createCarro(CarroDTO carroDTO) {
        try {
            if (carroDTO.getId_carro() != null) {
                throw new IllegalArgumentException("La identificación es generada por la base de datos");
            }
            Carro carro = CarroMapper.INSTANCE.carroDTOToCarro(carroDTO);
            if (carro == null) {
                throw new IllegalArgumentException("El carro no puede ser NULL");
            }
            Carro carroSave = carroRepository.save(carro);
            return CarroMapper.INSTANCE.carroToCarroDTO(carroSave);
        } catch (Exception e) {
            log.error("ERROR creando el carro", e);
        }
        return null;
    }


    @Override
    public CarroDTO getCarroById(Long id) {
        try {
            if (id == null) {
                throw new IllegalArgumentException("Id NO puede ser NULL");
            }
            Carro carro = carroRepository.findById(id).orElse(null);
            return CarroMapper.INSTANCE.carroToCarroDTO(carro);
        } catch (Exception e) {
            log.error("ERROR obteniendo el carro por el ID", e);
        }
        return null;
    }

    @Override
    public List<CarroDTO> getAllCarros() {
        try {
            List<Carro> carros = carroRepository.findAll();
            return carros.stream().map(CarroMapper.INSTANCE::carroToCarroDTO).toList();
        } catch (Exception e) {
            log.error("ERROR obteniendo los carros", e);
        }
        return List.of();
    }
}
