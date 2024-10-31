// Déclaration de la classe CaractereAuHasard qui hérite de Program
class CaractereAuHasard extends Program {
    
    // Méthode principale algorithm() pour générer un caractère aléatoire entre deux caractères donnés
    void algorithm() {
        // Demande à l'utilisateur d'entrer le premier caractère
        print("Caractère 1 : ");
        int premier = (int)readChar(); // Lecture et conversion du premier caractère en entier (valeur ASCII)

        // Demande à l'utilisateur d'entrer le deuxième caractère
        print("Caractère 2 : ");
        int deuxieme = (int)readChar(); // Lecture et conversion du deuxième caractère en entier (valeur ASCII)

        // Vérification que les caractères sont différents
        if (premier == deuxieme) {
            println("Erreur : Les caractères doivent être différents."); // Message d'erreur
            return; // Sortie de la méthode si les caractères sont identiques
        }

        // Déclaration d'une variable pour le caractère aléatoire
        char randomChar;

        // Vérification de l'ordre des caractères
        if (premier < deuxieme) {
            // Génération d'un caractère aléatoire entre premier et deuxieme
            randomChar = (char)(random() * (deuxieme - premier) + premier); 
        } else {
            // Génération d'un caractère aléatoire entre deuxieme et premier
            randomChar = (char)(random() * (premier - deuxieme) + deuxieme);
        }

        // Affichage du caractère aléatoire généré
        println("Résultat : " + randomChar);
    }
}
