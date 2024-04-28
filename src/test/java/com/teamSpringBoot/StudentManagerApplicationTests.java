package com.teamSpringBoot;

import com.teamSpringBoot.models.Etudiant;
import com.teamSpringBoot.repositories.EtudiantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentManagerApplicationTests {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Test
    public void TestCreateEtudiant(){
        Etudiant etudiant = new Etudiant( "virlence", "manga bell",3,"info");
        etudiantRepository.save(etudiant);
    }

    @Test
    public void TestUpdateEtudiant(){
        Etudiant etudiant = etudiantRepository.findById(1L).get();
        etudiant.setNomEtudiant("Feudjio");
        etudiantRepository.save(etudiant);
    }

    @Test
    public void TestFindEtudiantById(){
        Etudiant etudiant = etudiantRepository.findById(1L).get();
        System.out.println(etudiant);
    }

    @Test
    public void TestFindAllEtudiants(){
        List<Etudiant> etudiants = etudiantRepository.findAll();
        for (Etudiant etudiant : etudiants){
            System.out.println(etudiant);
        }
    }

    @Test
    public void TestDeleteEtudiantById(){
        etudiantRepository.deleteById(1L);
    }

}
