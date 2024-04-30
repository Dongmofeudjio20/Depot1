package com.teamSpringBoot.services;

import com.teamSpringBoot.models.Etudiant;
import com.teamSpringBoot.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImplementation1 implements EtudiantService{

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant findEtudiantByIdEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleEtudiantById(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public void deleteAllEtudiants() {
        etudiantRepository.deleteAll();
    }
}
