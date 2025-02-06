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

import com.senaidev.hospital.entities.Paciente;
import com.senaidev.hospital.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPacientePorId(@PathVariable Long id) {
    	Paciente paciente = pacienteService.buscarPacientesPorId(id);
    	
    	if (paciente != null) {
    		return ResponseEntity.ok(paciente);
    	}
    	else {
    		return ResponseEntity.status(404).body("Paciente com Id " + id + " não foi encontrado");
    	}
    }
    
    @GetMapping("/rg/{rg}")
    public Paciente buscarPorRg(@PathVariable String rg) {
    	return pacienteService.buscarPacientesPorRg(rg);
    }
    
    @PostMapping
    public Paciente criarPaciente(@RequestBody Paciente paciente) {
        return pacienteService.criarPaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void excluirPaciente(@PathVariable Long id) {
       pacienteService.excluirPaciente(id);
    }
}
