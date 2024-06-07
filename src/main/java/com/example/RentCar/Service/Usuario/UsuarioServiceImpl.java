package com.example.RentCar.Service.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentCar.Entities.Usuario;
import com.example.RentCar.Repositories.UsuarioRepository;
import com.example.RentCar.dto.Usuario.UsuarioDTO;
import com.example.RentCar.dto.Usuario.UsuarioMapper;

import lombok.extern.slf4j.Slf4j;
// crear
@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDTO CreateUsuario(UsuarioDTO usuarioDTO) {
        try {
            if (usuarioDTO.getId_usuario() != null) {
                throw new IllegalArgumentException("La identificación es generada por la base de datos");
            }
            Usuario usuario = UsuarioMapper.INSTANCE.usuarioDTOToUsuario(usuarioDTO);
            if (usuario == null) {
                throw new IllegalArgumentException("El usuario no puede ser NULL");
            }
            Usuario usuarioSave = usuarioRepository.save(usuario);
            return UsuarioMapper.INSTANCE.usuarioToUsuarioDTO(usuarioSave);
        } catch (Exception e) {
            log.error("ERROR creando el usuario", e);
        }
        return null;
    }
    
}
