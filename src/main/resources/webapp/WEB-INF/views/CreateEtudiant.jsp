<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter un étudiant</title>
</head>
<body>
    <h1>Ajouter un étudiant</h1>
    <form action="saveEtudiant" method="post">
        <label for="nomEtudiant">Nom : </label>
        <input type="text" id="nomEtudiant" name="nom" required><br>

        <label for="prenomEtudiant">Prénom : </label>
        <input type="text" id="prenomEtudiant" name="prenom" required><br>

        <label for="niveauEtudiant">Niveau : </label>
        <input type="text" id="niveauEtudiant" name="niveau" required><br>

        <label for="filiereEtudiant">Filière : </label>
        <input type="text" id="filiereEtudiant" name="filiere" required><br>

        <input type="submit" value="Save">

        <a href = "EtudiantsList">Liste des étudiants</a>
    </form>
</body>
</html>
