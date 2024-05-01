package com.teamSpringBoot.controllers;

import com.teamSpringBoot.models.Etudiant;
import com.teamSpringBoot.services.EtudiantService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/etudiant")
@CrossOrigin("*")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/createEtudiant")
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiantDTO) {
        return new ResponseEntity<>(etudiantService.saveEtudiant(etudiantDTO), HttpStatus.CREATED);

    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Etudiant>> getAllEtudiant() {
        return new ResponseEntity<>(etudiantService.findAllEtudiants(), HttpStatus.OK);
    }

    @GetMapping("/getOneEtudiant/{etudiantId}")
    public ResponseEntity<Etudiant> getOneEtudiant(@PathVariable Long etudiantId) {
        return new ResponseEntity<>(etudiantService.findEtudiantByIdEtudiant(etudiantId), HttpStatus.OK);
    }

    @GetMapping("/get-by-id")
    public ResponseEntity<Etudiant> getEtudiant(@RequestParam Long etudiantId) {
        return new ResponseEntity<>(etudiantService.findEtudiantByIdEtudiant(etudiantId), HttpStatus.OK);

    }

}
