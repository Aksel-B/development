// Déclaration de la classe JeuxDeType qui hérite de Program 
class JeuxDeType extends Program {

    // Déclaration de la méthode principale algorithm() qui exécute le programme
    void algorithm(){
        // Initialisation de la variable 'prenom' avec le prénom "Ada"
        String prenom = "Ada";
        
        // Initialisation de la variable 'nom' avec le nom de famille "Lovelace"
        String nom = "Lovelace";
        
        // Initialisation de l'année de naissance de la personne
        int naissance = 1815;
        
        // Initialisation de l'année actuelle
        int annee = 2022;
        
        // Calcul de l'âge estimé en soustrayant l'année de naissance à l'année actuelle
        int age = annee - naissance;
        
        // Récupération de la première lettre du prénom
        char initiale = charAt(prenom, 0); // Utilisation de charAt() pour obtenir le premier caractère du prénom
        
        // Affichage de la phrase finale dans la console
        println(initiale + ". " + nom + " aurait eu " + age + " ans en " + annee);
    }
}
