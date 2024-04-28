package com.teamSpringBoot.controllers;

import com.teamSpringBoot.models.Etudiant;
import com.teamSpringBoot.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EtudiantController {

    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/createEtudiant")
    public Etudiant createEtudiant(String nomEtudiant, String prenomEtudiant, int niveauEtudiant, String filiereEtudiant) {
        return etudiantService.createEtudiant(nomEtudiant, prenomEtudiant, niveauEtudiant, filiereEtudiant);
    }

    @GetMapping("/deleteEtudiant")
    public void deleteEtudiant(Long id) {
        etudiantService.deleteEtudiant(id);
    }

    @GetMapping("/updateEtudiant")
    public Etudiant updateEtudiant(Long id, String nom, String prenom, int niveau, String filiere) {
        return etudiantService.updateEtudiant(id, nom, prenom, niveau, filiere);
    }

    @GetMapping("/findEtudiant{id}")
    public Etudiant findEtudiantById(Long id) {
        return etudiantService.findEtudiantByIdEtudiant(id);
    }

}
