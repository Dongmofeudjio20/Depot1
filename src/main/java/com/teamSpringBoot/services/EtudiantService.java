package com.teamSpringBoot.services;

import com.teamSpringBoot.models.Etudiant;

import java.util.List;

public interface EtudiantService {

    public Etudiant saveEtudiant(Etudiant etudiant);

    public Etudiant updateEtudiant(Etudiant etudiant);

    public Etudiant findEtudiantByIdEtudiant(Long id);

    public List<Etudiant> findAllEtudiants();

    public void deleEtudiantById(Long id);

    public void deleteAllEtudiants();



}
