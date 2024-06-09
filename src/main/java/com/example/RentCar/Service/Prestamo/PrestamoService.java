package com.example.RentCar.Service.Prestamo;

import java.util.List;

import com.example.RentCar.dto.Prestamo.PrestamoDTO;

public interface PrestamoService {
    // CRUD
    public PrestamoDTO CreatePrestamo(PrestamoDTO prestamoDTO);
    public PrestamoDTO getPrestamoById(Long id);
    public List<PrestamoDTO> getAllPrestamos();
}
