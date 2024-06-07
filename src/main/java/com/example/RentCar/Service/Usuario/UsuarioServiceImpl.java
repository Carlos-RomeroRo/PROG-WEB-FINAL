package com.example.RentCar.Service.Usuario;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RentCar.dto.Usuario.UsuarioDTO;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public UsuarioDTO CreateUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public UsuarioDTO updateUsuario(UsuarioDTO usuario) {
        return null;
    }

    @Override
    public boolean deleteUsuario(Long id) {
        return false;
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id) {
        return null;
    }

    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        return null;
    }
}
