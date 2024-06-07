package com.example.RentCar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RentCar.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
