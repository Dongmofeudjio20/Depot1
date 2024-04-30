package com.teamSpringBoot.controllers;

import com.teamSpringBoot.models.Etudiant;
import com.teamSpringBoot.services.EtudiantServiceImplementation1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class EtudiantController {

    EtudiantServiceImplementation1 etudiantServiceImplementation1;

    @RequestMapping("/createEtudiant")
    public String createEtudiant(){

        return "CreateEtudiant";

    }

    @RequestMapping("/saveEtudiant")
    public String saveEtudiant(@RequestParam String nomEtudiant, @RequestParam String prenomEtudiant, @RequestParam int niveauEtudiant, @RequestParam String filiereEtudiant){

        Etudiant etudiant = new Etudiant(nomEtudiant, prenomEtudiant,niveauEtudiant, filiereEtudiant);
        etudiantServiceImplementation1.saveEtudiant(etudiant);
        return "CreateEtudiant";

    }

    @RequestMapping("/etudiantsList")
    public String etudiantsList(ModelMap modelMap){

        List<Etudiant> etudiantsController = etudiantServiceImplementation1.findAllEtudiants();
        modelMap.addAttribute("etudiantJsp","etudiantsController");
        return "EtudiantsList";
    }

    @RequestMapping("/deleteEtudiant")
    public String deleteEtudiant(@RequestParam("id") Long id, ModelMap modelMap){

        etudiantServiceImplementation1.deleEtudiantById(id);
        List<Etudiant> etudiantsController = etudiantServiceImplementation1.findAllEtudiants();
        modelMap.addAttribute("etudiantJsp","etudiantsController");
        return "EtudiantsList";

    }

    @RequestMapping("/showEtudiant")
    public String showEtudiant(@RequestParam("id") Long id, ModelMap modelMap){

        Etudiant etudiantController = etudiantServiceImplementation1.findEtudiantByIdEtudiant(id);
        modelMap.addAttribute("etudiantJsp", etudiantController);
        return "EditEtudiant";

    }

    @RequestMapping("/updateEtudiant")
    public String updateEtudiant(@RequestParam String nomEtudiant, @RequestParam String prenomEtudiant, @RequestParam int niveauEtudiant, @RequestParam String filiereEtudiant){

        Etudiant etudiant = new Etudiant(nomEtudiant, prenomEtudiant,niveauEtudiant, filiereEtudiant);
        etudiantServiceImplementation1.saveEtudiant(etudiant);
        return "EditEtudiant";

    }

}
