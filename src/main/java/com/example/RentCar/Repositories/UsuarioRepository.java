package com.example.RentCar.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.RentCar.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.cedula = ?1")
    public Optional<Usuario> findByCedula(Long cedula);
}
