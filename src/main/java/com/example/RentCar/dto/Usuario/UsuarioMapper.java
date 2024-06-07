package com.example.RentCar.dto.Usuario;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.RentCar.Entities.Usuario;

@Mapper
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);

    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}
