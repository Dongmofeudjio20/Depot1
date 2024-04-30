<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>


<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Products Edition</title>
</head>
<body>
    <h1>Products Edition</h1>
    <main>
       <form action="updateEtudiant" method="post">
        <div>
            <label hidden for="idEtudiant">Id Etudiant :</label>
            <input hidden type="text" id="idEtudiant" name="idEtudiant" value = "${etudiantJsp.idEtudiant}">
        </div>
        <div>
            <label hidden for="matriculeEtudiant">Matricule Etudiant :</label>
            <input hidden type="text" id="matriculeEtudiant" name="matriculeEtudiant" value = "${etudiantJsp.matriculeEtudiant}">
        </div>
        <div>
            <label for="nomEtudiant">Nom Etudiant :</label>
            <input type="text" id="nomEtudiant" name="nomEtudiant" value = "${etudiantJsp.nomEtudiant}">
        </div>
        <div>
            <label for="prenomEtudiant">Prenom Etudiant :</label>
            <input type="text" id="prenomEtudiant" name="prenomEtudiant" value = "${etudiantJsp.prenomEtudiant}">
        </div>
        <div>
            <label for="niveauEtudiant">Niveau Etudiant :</label>
            <input type="text" id="niveauEtudiant" name="niveauEtudiant" value = "${etudiantJsp.niveauEtudiant}">
        </div>
        <div>
             <label for="filiereEtudiant">Filière Etudiant :</label>
             <input type="text" id="filiereEtudiant" name="filiereEtudiant" value = "${etudiantJsp.filiereEtudiant}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
       </form>
    </main>
    <footer>
        <a href = "etudiantsList">Products List</a>
    </footer>
</body>
</html>