package com.teamSpringBoot.services;

import com.teamSpringBoot.controllers.MatriculeGenerator;
import com.teamSpringBoot.models.Etudiant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.teamSpringBoot.models.Etudiant.etudiants;

@Service
public class EtudiantService {

    String matriculeEtudiant = MatriculeGenerator.generateNextMatricule();

    public Etudiant createEtudiant(String nomEtudiant, String prenomEtudiant, int niveauEtudiant, String filiereEtudiant) {

        Etudiant etudiant = new Etudiant("","",0,"");
        try {
            etudiant.setMatriculeEtudiant(matriculeEtudiant);
        }catch (NullPointerException e){
            System.out.println("Erreur");
        }
        etudiant.setNomEtudiant(nomEtudiant);
        etudiant.setPrenomEtudiant(prenomEtudiant);
        etudiant.setNiveauEtudiant(niveauEtudiant);
        etudiant.setFiliereEtudiant(filiereEtudiant);

        return etudiant;
    }

    public Etudiant updateEtudiant(Long idEtudiant, String nomEtudiant, String prenomEtudiant, int niveauEtudiant, String filiereEtudiant) {

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants = findAllEtudiants();
        Etudiant etudiant = null;
        int i;
        for (i = 0; i < etudiants.size();i++){
            etudiant = etudiants.get(i);
            if (Objects.equals(etudiant.getIdEtudiant(), idEtudiant)){
                try{
                    etudiant.setNomEtudiant(nomEtudiant);
                    etudiant.setPrenomEtudiant(prenomEtudiant);
                    etudiant.setNiveauEtudiant(niveauEtudiant);
                    etudiant.setFiliereEtudiant(filiereEtudiant);

                    System.out.println("L'étudiant a été mis à jour");

                }catch (RuntimeException e){
                    System.out.println("L' étudiant dont l' id est : " + idEtudiant + "n' a pas été trouvé.");
                }
            }
        }
        return etudiant;
    }

    public Etudiant findEtudiantByIdEtudiant(Long id) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants = findAllEtudiants();
        Etudiant etudiant = null;
        int i;
        for (i = 0; i < etudiants.size(); i++){
            etudiant = etudiants.get(i);
            if (Objects.equals(etudiant.getIdEtudiant(), id)){
                System.out.println("Voici l'étudiant recherché : " + etudiant.toString());
            }
        }
        return etudiant;
    }

    public List<Etudiant> findAllEtudiants() {

        return etudiants;

    }

    public void deleteEtudiant(Long id) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants = findAllEtudiants();
        Etudiant etudiant = null;
        int i;
        for (i = 0; i < etudiants.size(); i++){
            etudiant = etudiants.get(i);
            if (Objects.equals(etudiant.getIdEtudiant(), id)){
                etudiants.remove(i);
            }
        }
    }

}
