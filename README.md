# LAB 7 - Galerie de Stars – RecyclerView, Animations et Filtrage

## Objectif

Ce projet Android a pour objectif de créer une application mobile complète permettant d’afficher une galerie de stars sous forme de liste dynamique.

L’application utilise un `RecyclerView` pour afficher les personnalités célèbres avec leurs images, noms et notes. Elle intègre aussi un écran de démarrage animé, une recherche par nom, un système de filtrage, un menu de partage et un popup permettant de modifier la note d’une star.
<img width="498" height="896" alt="Screenshot 2026-04-27 192953" src="https://github.com/user-attachments/assets/762a4dad-f28a-4c5d-b983-535bca72544c" />

## Fonctionnalités principales

- Écran de démarrage animé avec `SplashActivity`
- Affichage d’une liste de stars avec `RecyclerView`
- Utilisation du pattern `ViewHolder`
- Images circulaires avec `CircleImageView`
- Chargement des images distantes avec `Glide`
- Filtrage dynamique avec `SearchView`
- Architecture simple avec DAO générique
- Couche service avec `StarService`
- Menu de partage de l’application
- Popup pour modifier la note d’un acteur ou d’une actrice
- Interface simple et intuitive

## Technologies utilisées

- Java
- Android Studio
- RecyclerView
- Glide
- CircleImageView
- SearchView
- XML Layouts
- Animations Android

## Dépendances

À ajouter dans le fichier `build.gradle` du module `app` :

```gradle
dependencies {
    implementation 'androidx.recyclerview:recyclerview:1.3.1'
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'com.github.bumptech.glide:glide:4.15.1'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.15.1'
}
Structure du projet
app/
├── java/
│   └── com.example.galeriedestars/
│       ├── SplashActivity.java
│       ├── ListActivity.java
│       ├── adapter/
│       │   └── StarAdapter.java
│       ├── beans/
│       │   └── Star.java
│       ├── dao/
│       │   └── IDao.java
│       └── service/
│           └── StarService.java
│
└── res/
    ├── drawable/
    ├── layout/
    │   ├── activity_splash.xml
    │   ├── activity_list.xml
    │   ├── item_star.xml
    │   └── dialog_update_note.xml
    ├── menu/
    │   └── menu_main.xml
    └── anim/
        └── splash_animation.xml
Description des composants
SplashActivity

SplashActivity représente l’écran de démarrage de l’application.
Elle affiche une animation pendant quelques secondes avant de rediriger l’utilisateur vers l’activité principale.

Classe Star

La classe Star représente le modèle de données de l’application.

Elle contient généralement :

id
nom
description
image
note

Exemple :

public class Star {
    private int id;
    private String nom;
    private String description;
    private String img;
    private float star;

    public Star(int id, String nom, String description, String img, float star) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.img = img;
        this.star = star;
    }

    // Getters et setters
}
Interface DAO Générique

L’interface IDao permet de définir les méthodes CRUD principales.

public interface IDao<T> {
    boolean create(T o);
    boolean update(T o);
    boolean delete(T o);
    T findById(int id);
    List<T> findAll();
}
StarService

StarService est une couche service qui implémente IDao<Star>.
Elle permet de gérer les données des stars : ajout, modification, suppression, recherche et récupération de la liste complète.

StarAdapter

StarAdapter permet de connecter les données des stars avec le RecyclerView.

Il est responsable de :

l’affichage du nom
l’affichage de l’image avec Glide
l’affichage de la note
la gestion du clic sur un élément
le filtrage des résultats
ListActivity

ListActivity est l’activité principale de l’application.

Elle contient :

le RecyclerView
le SearchView
le menu de partage
la gestion du popup de modification de note
Fonctionnement de l’application

Au lancement, l’application affiche un écran de démarrage animé. Après l’animation, l’utilisateur est redirigé vers la liste des stars.

La liste est affichée à l’aide d’un RecyclerView. Chaque élément contient une image circulaire, le nom de la star et sa note.

L’utilisateur peut rechercher une star par son nom grâce à la barre de recherche. La liste se met à jour automatiquement selon le texte saisi.

L’utilisateur peut aussi ouvrir un popup pour modifier la note d’une star. Après validation, la note est mise à jour dans la liste.

Un menu permet également de partager l’application avec d’autres utilisateurs.

Résultat attendu

L’application finale doit permettre :

d’afficher une galerie de stars
de voir les images sous forme circulaire
de rechercher une star par son nom
de filtrer la liste dynamiquement
de modifier la note d’une star
de partager l’application
d’avoir une animation au démarrage
Commandes Git

Pour envoyer le projet vers GitHub :

git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/youness-lahdiri01/Galerie-de-Stars-RecyclerView-Animations-et-Filtrage.git
git push -u origin main

Si le dépôt contient déjà des fichiers :

git pull origin main --allow-unrelated-histories
git push origin main

En cas de blocage :

git push -u origin main --force
Auteur

Projet réalisé dans le cadre du cours :

Programmation Mobile : Android avec Java
LAB 7 - Galerie de Stars – RecyclerView, Animations et Filtrage

Licence

Projet académique destiné à l’apprentissage du développement Android avec Java.
