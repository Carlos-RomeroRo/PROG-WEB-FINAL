package com.example.RentCar.dto.Prestamo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.RentCar.Entities.Prestamo;
import com.example.RentCar.Repositories.CarroRepository;
import com.example.RentCar.Repositories.UsuarioRepository;

@Mapper
public interface PrestamoMapper {
    PrestamoMapper INSTANCE = Mappers.getMapper(PrestamoMapper.class);

    @Mapping(source = "usuario_id.id_usuario", target = "usuario_id")
    @Mapping(source = "carro_id.id_carro", target = "carro_id")
    public PrestamoDTO prestamoToPrestamoDTO(Prestamo prestamo);

    default Prestamo prestamoDTOToPrestamo(PrestamoDTO prestamoDTO,
            UsuarioRepository usuarioRepository,
            CarroRepository carroRepository) {
        if (prestamoDTO == null) {
            return null;
        }
        Prestamo prestamo = new Prestamo();
        Long id = prestamoDTO.getUsuario_id();
        prestamo.setUsuario_id(usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró el usuario con esa ID")));
        prestamo.setId_prestamo(prestamoDTO.getId_prestamo());
        id = prestamoDTO.getCarro_id();
        prestamo.setCarro_id(carroRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró el carro con esa ID")));
        prestamo.setFechaInicio(prestamoDTO.getFechaInicio());
        prestamo.setFechaFin(prestamoDTO.getFechaFin());
        return prestamo;
    }
}
