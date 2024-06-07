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
    public PrestamoDTO updatePrestamo(Long id, PrestamoDTO prestamoDTO) {
        try {
            if (prestamoDTO.getId_prestamo() == null) {
                throw new IllegalArgumentException("La identificación es generada por la base de datos");
            }

            Prestamo prestamoFromBD = prestamoRepository.findById(id).orElseThrow(
                    () -> new IllegalArgumentException("Prestamo no existente"));

            if (prestamoFromBD.getFechaFin() != prestamoDTO.getFechaFin() && prestamoDTO.getFechaFin() != null) {
                prestamoFromBD.setFechaFin(prestamoDTO.getFechaFin());
            }
            if (prestamoFromBD.getFechaInicio() != prestamoDTO.getFechaInicio()
                    && prestamoDTO.getFechaInicio() != null) {
                prestamoFromBD.setFechaInicio(prestamoDTO.getFechaInicio());
            }
            Prestamo prestamoSave = prestamoRepository.save(prestamoFromBD);
            return PrestamoMapper.INSTANCE.prestamoToPrestamoDTO(prestamoSave);

        } catch (Exception e) {
            log.error("ERROR actualizando el prestamo", e);
        }

        return null;
    }

    @Override
    public Boolean deletePrestamo(Long id) {
        try {
            if (id == null) {
                throw new IllegalArgumentException("Id cannot be null");
            }
            prestamoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            log.error("ERROR borrando el prestamo por el ID", e);
        }
        return false;
    }

    @Override
    public PrestamoDTO getPrestamoById(Long id) {
        try{

        }catch(Exception e){
            log.error("ERROR buscando el prestamo por el ID", e);
        }
        return null;
    }

    @Override
    public List<PrestamoDTO> getAllPrestamos() {
        return null;
    }

}
