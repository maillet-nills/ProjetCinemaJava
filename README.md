# 🎬 Projet Cinéma Java

Mini-projet en **Java** qui modélise un complexe de cinémas : cinémas, salles, films, séances et **réservation de places**.

Projet d'entraînement à la **programmation orientée objet** (classes, encapsulation, composition entre objets, surcharge de méthodes).

---

## Présentation

| | |
|---|---|
| **Langage** | Java (JDK 25) |
| **Type** | Application console, sans dépendance externe |
| **Point d'entrée** | `src/Main.java` |

## Contexte

Un complexe de cinémas possède deux cinémas, à **Toulouse** et à **Muret**. Chaque cinéma a deux salles de 20 places, et chaque salle projette un film au travers d'une séance.

Le programme construit ce complexe, affiche la programmation de chaque cinéma, puis simule des réservations, dont certaines sont refusées faute de places.

## Fonctionnalités

- Affichage de la **programmation** par cinéma
- **Réservation** d'une ou de plusieurs places, avec contrôle des places restantes
- Calcul du **taux de complétion** d'une salle
- Calcul de l'**horaire de fin** d'une séance à partir de la durée du film

## Structure

```text
CinemaComplex → Cinema → Room → Session → Movie
```

| Classe | Rôle |
|---|---|
| `Movie` | Un film : titre, réalisateur, durée |
| `Room` | Une salle : numéro, capacité, séances |
| `Session` | Une séance : un film dans une salle, places restantes, réservations |
| `Cinema` | Un cinéma d'une ville, avec ses salles |
| `CinemaComplex` | L'ensemble des cinémas |
| `Main` | Données de démonstration et scénario de réservation |

## Lancer le projet

**Prérequis : JDK 25.** `Main.java` utilise une classe implicite avec `void main()`, standard depuis Java 25.

Avec **IntelliJ IDEA** : ouvrir le dossier, choisir le JDK 25, lancer `Main`.

En ligne de commande :

```bash
git clone https://github.com/maillet-nills/ProjetCinemaJava.git
cd ProjetCinemaJava/src
java Main.java
```

## Auteurs

Projet réalisé à deux :

- **Nills Maillet** : [@maillet-nills](https://github.com/maillet-nills)
- **Benjamin Bastide** : [@spooltie](https://github.com/spooltie)
