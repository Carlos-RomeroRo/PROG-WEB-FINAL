package com.example.RentCar.Service.Usuario;


import com.example.RentCar.dto.Usuario.UsuarioDTO;

public interface UsuarioService {
    // CRUD
    public UsuarioDTO CreateUsuario(UsuarioDTO usuarioDTO);
    public UsuarioDTO GetUsuarioByCedula(Long document);
    public UsuarioDTO GetUsuarioById(Long id);
}
