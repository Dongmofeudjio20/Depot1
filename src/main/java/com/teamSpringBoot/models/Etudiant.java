package com.teamSpringBoot.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long etudiantId;

    @Column(name = "Matricule", nullable = false, length = 50)
    private String etudiantMatricule;

    @Column(name = "Nom", nullable = false, length = 15)
    private String etudiantName;

    @Column(name = "Prénom", nullable = false, length = 10)
    private String etudiantFirstname;

    @Column(name = "Niveau", nullable = false, length = 10)
    private int niveauEtudiant;

    @Column(name = "Filiere", nullable = false, length = 20)
    private String etudiantSpeciality;

    public Long getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(Long etudiantId) {
        this.etudiantId = etudiantId;
    }

    public String getEtudiantMatricule() {
        return etudiantMatricule;
    }

    public void setEtudiantMatricule(String etudiantMatricule) {
        this.etudiantMatricule = etudiantMatricule;
    }

    public String getEtudiantName() {
        return etudiantName;
    }

    public void setEtudiantName(String etudiantName) {
        this.etudiantName = etudiantName;
    }

    public String getEtudiantFirstname() {
        return etudiantFirstname;
    }

    public void setEtudiantFirstname(String etudiantFirstname) {
        this.etudiantFirstname = etudiantFirstname;
    }

    public int getNiveauEtudiant() {
        return niveauEtudiant;
    }

    public void setNiveauEtudiant(int niveauEtudiant) {
        this.niveauEtudiant = niveauEtudiant;
    }

    public String getEtudiantSpeciality() {
        return etudiantSpeciality;
    }

    public void setEtudiantSpeciality(String etudiantSpeciality) {
        this.etudiantSpeciality = etudiantSpeciality;
    }

}
