package com.example.RentCar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentCar.Entities.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
