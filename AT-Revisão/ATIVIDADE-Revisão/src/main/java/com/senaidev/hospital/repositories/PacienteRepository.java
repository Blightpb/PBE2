package com.senaidev.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.hospital.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	Paciente findByRg(String rg);
}
