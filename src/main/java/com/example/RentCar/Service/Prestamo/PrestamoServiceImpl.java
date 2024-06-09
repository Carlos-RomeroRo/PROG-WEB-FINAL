package com.example.RentCar.Service.Prestamo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentCar.Entities.Prestamo;
import com.example.RentCar.Repositories.CarroRepository;
import com.example.RentCar.Repositories.PrestamoRepository;
import com.example.RentCar.Repositories.UsuarioRepository;
import com.example.RentCar.dto.Prestamo.PrestamoDTO;
import com.example.RentCar.dto.Prestamo.PrestamoMapper;

import lombok.extern.slf4j.Slf4j;

// obtener prestamo por su id
// relacione un usuario con un carro
@Service
@Slf4j
public class PrestamoServiceImpl implements PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CarroRepository carroRepository;

    @Override
    public PrestamoDTO CreatePrestamo(PrestamoDTO prestamoDTO) {
        try {
            if (prestamoDTO.getId_prestamo() != null) {
                throw new IllegalArgumentException("La identificación es generada por la base de datos");
            }
            Prestamo prestamo = PrestamoMapper.INSTANCE.prestamoDTOToPrestamo(prestamoDTO, usuarioRepository,
                    carroRepository);
            if (prestamo == null) {
                throw new IllegalArgumentException("El prestamo no puede ser NULL");
            }
            Prestamo prestamoSave = prestamoRepository.save(prestamo);
            return PrestamoMapper.INSTANCE.prestamoToPrestamoDTO(prestamoSave);
        } catch (Exception e) {
            log.error("ERROR creando el prestamo", e);
        }
        return null;
    }

    @Override
    public PrestamoDTO getPrestamoById(Long id) {
        try {
            if (id == null) {
                throw new IllegalArgumentException("Id cannot be null");
            }
            Prestamo prestamo = prestamoRepository.findById(id).orElseThrow(
                    () -> new IllegalArgumentException("Prestamo no existente"));
            return PrestamoMapper.INSTANCE.prestamoToPrestamoDTO(prestamo);
        } catch (Exception e) {
            log.error("ERROR buscando el prestamo por el ID", e);
        }
        return null;
    }

    @Override
    public List<PrestamoDTO> getAllPrestamos() {
        try {
            List<Prestamo> prestamos = prestamoRepository.findAll();
            return prestamos.stream().map(PrestamoMapper.INSTANCE::prestamoToPrestamoDTO).toList();
        } catch (Exception e) {
            log.error("ERROR buscando todos los prestamos", e);
        }
        return List.of();
    }
}
