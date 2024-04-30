<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<%@ import java.sql.* %>
<%@ import javax.sql.* %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Liste Etudiants</title>
</head>
<body>
    <h1>Liste Etudiants</h1>
    <main>
        <table>
            <tr>
                <th>Id</th>
                <th>Matricule</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Niveau</th>
                <th>Filière</th>
            </tr>

            // jstl
            <c:forEach items = "${etudiantsJsp}" var = "etudiant">
                <tr>
                    <td>${etudiant.idEtudiant}</td>
                    <td>${etudiant.matriculeEtudiant}</td>
                    <td>${etudiant.nomEtudiant}</td>
                    <td>${etudiant.prenomEtudiant}</td>
                    <td>${etudiant.niveauEtudiant}</td>
                    <td>${etudiant.filiereEtudiant}</td>
                    <td><a onClick = "return confirm('Confirmez-vous la suppression de cette étudiant ?')" href = "deleteEtudiant?id=${etudiant.idEtudiant}">Supprimer</a></td>
                    <td><a href = "showEtudiant?id=${etudiant.idEtudiant}">Editer</a></td>
                </tr>
            </c:forEach>

        </table>
    </main>
    <footer>
        <a href = "createEtudiant">Création Etudiant</a>
    </footer>
</body>
</html>