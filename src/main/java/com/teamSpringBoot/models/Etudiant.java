package com.teamSpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String matriculeEtudiant;

    private String nomEtudiant;

    private String prenomEtudiant;

    private int niveauEtudiant;

    private String filiereEtudiant;

    public static List<Etudiant> etudiants = new ArrayList<>();

    public Etudiant(String nomEtudiant, String prenomEtudiant, int niveauEtudiant, String filiereEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.niveauEtudiant = niveauEtudiant;
        this.filiereEtudiant = filiereEtudiant;

        etudiants.add(this);
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getMatriculeEtudiant() {
        return matriculeEtudiant;
    }

    public void setMatriculeEtudiant(String matriculeEtudiant) {
        this.matriculeEtudiant = matriculeEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public int getNiveauEtudiant() {
        return niveauEtudiant;
    }

    public void setNiveauEtudiant(int niveauEtudiant) {
        this.niveauEtudiant = niveauEtudiant;
    }

    public String getFiliereEtudiant() {
        return filiereEtudiant;
    }

    public void setFiliereEtudiant(String filiereEtudiant) {
        this.filiereEtudiant = filiereEtudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", matriculeEtudiant='" + matriculeEtudiant + '\'' +
                ", nomEtudiant='" + nomEtudiant + '\'' +
                ", prenomEtudiant='" + prenomEtudiant + '\'' +
                ", niveauEtudiant=" + niveauEtudiant +
                ", filiereEtudiant='" + filiereEtudiant + '\'' +
                '}';
    }

    public static List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public static void setEtudiants(List<Etudiant> etudiants) {
        Etudiant.etudiants = etudiants;
    }

}
