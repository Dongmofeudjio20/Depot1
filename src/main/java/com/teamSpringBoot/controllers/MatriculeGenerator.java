package com.teamSpringBoot.controllers;

public class MatriculeGenerator {

    private static long nextId = 1L;

    static {
        try {
            // charge le dernier numéro de matricule généré à partir d'un fichier ou d'une base de données
            // et met à jour la variable nextId en conséquence
        } catch (Exception e) {
            // en cas d'erreur, utilise 1 comme prochain numéro de matricule
            nextId = 1L;
        }
    }

    public static synchronized String generateNextMatricule() {
        String prefix = "IS-ETUD-";
        String matricule = prefix + String.format("%03d", nextId);
        nextId++;
        return matricule;
    }

}

