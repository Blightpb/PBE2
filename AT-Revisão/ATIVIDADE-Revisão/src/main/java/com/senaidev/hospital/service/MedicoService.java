package com.senaidev.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.hospital.entities.Medico;
import com.senaidev.hospital.repositories.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    // Listar todos os medicos
    public List<Medico> buscarMedicos() {
        return medicoRepository.findAll();
   }

    // Buscar medicos por ID
    public Medico buscarMedicosPorId(Long id) {
        return medicoRepository.findById(id).orElse(null);
    }
    //busca cliente por crm
    public Medico buscarMedicosPorCrm(String crm) {
    	return medicoRepository.findByCrm(crm);
    }

    // Salvar medico
    public Medico criarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    // Deletar medico
    public void excluirMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
