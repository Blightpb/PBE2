package com.senaidev.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.hospital.entities.Paciente;
import com.senaidev.hospital.repositories.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    // Listar todos os pacientes
    public List<Paciente> buscarPacientes() {
        return pacienteRepository.findAll();
   }

    // Buscar paciente por ID
    public Paciente buscarPacientesPorId(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }
    //busca cliente por rg
    public Paciente buscarPacientesPorRg(String rg) {
    	return pacienteRepository.findByRg(rg);
    }

    // Salvar paciente
    public Paciente criarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    // Deletar paciente
    public void excluirPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
}
