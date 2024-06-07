package com.example.RentCar.Service.Usuario;

import java.util.List;

import com.example.RentCar.dto.Usuario.UsuarioDTO;

public interface UsuarioService {
    // CRUD
    public UsuarioDTO CreateUsuario(UsuarioDTO usuarioDTO);

    public UsuarioDTO updateUsuario(UsuarioDTO usuario);

    public boolean deleteUsuario(Long id);

    public UsuarioDTO getUsuarioById(Long id);

    public List<UsuarioDTO> getAllUsuarios();
}
