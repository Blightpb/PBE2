package com.senaidev.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.hospital.entities.Medico;
import com.senaidev.hospital.service.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarMedicoPorId(@PathVariable Long id) {
    	Medico medico = medicoService.buscarMedicosPorId(id);
    	
    	if (medico != null) {
    		return ResponseEntity.ok(medico);
    	}
    	else {
    		return ResponseEntity.status(404).body("Médico com Id " + id + " não foi encontrado");
    	}
    }
    
    @GetMapping("/crm/{crm}")
    public Medico buscarPorCrm(@PathVariable String crm) {
    	return medicoService.buscarMedicosPorCrm(crm);
    }
    
    @PostMapping
    public Medico criarMedico(@RequestBody Medico medico) {
        return medicoService.criarMedico(medico);
    }

    @DeleteMapping("/{id}")
    public void excluirMedico(@PathVariable Long id) {
        medicoService.excluirMedico(id);
    }
}
