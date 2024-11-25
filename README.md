# GSB GestUtilisateurs

## Description
Une application Java pour la gestion des utilisateurs du GSB, avec des interfaces Swing (Java Form). Le projet comprend :
- Gestion des utilisateurs
- Connexion à une base de données (fichier SQL inclus)
- Diagrammes UML pour la documentation

## Structure du projet
- `src/GSB_GestUtilisateurs` : Contient les fichiers source Java et Swing GUI.
- `gsb_frais.sql` : Script SQL pour initialiser la base de données.
- `DiagrammUML.puml` : Diagramme UML généré avec PlantUML.
- `gsblogo.png` : Logo utilisé dans l'application.

## Prérequis
- **Java Development Kit (JDK)** : Version 8 ou plus récente.
- **NetBeans IDE** : Recommandé pour utiliser les fichiers `.form` Swing.

## Installation
1. Clonez le dépôt :
   ```bash
   git clone https://github.com/<votre-utilisateur>/<votre-dépôt>.git

---

## **Étape 2 : Tester les chemins et ressources**
Vérifiez que les ressources comme `gsblogo.png` ou le fichier SQL sont accessibles dans votre application. Voici comment gérer certains cas :

1. **Accès aux images :**
   Si votre logo est dans le dossier `src/GSB_GestUtilisateurs`, utilisez ce code pour le charger :
   ```java
   ImageIcon logo = new ImageIcon(getClass().getResource("/GSB_GestUtilisateurs/gsblogo.png"));
