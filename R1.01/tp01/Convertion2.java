// Déclaration de la classe Convertion2 qui hérite de Program
class Convertion2 extends Program {
    
    // Constantes pour les messages
    final String MESSAGE_TAUX = "Taux de la monnaie : ";
    final String MESSAGE_SOMME = "Somme : ";
    final String MESSAGE_RESULTAT = "Résultat : ";

    // Méthode principale algorithm() pour effectuer une conversion de monnaie
    void algorithm() {
        // Demande à l'utilisateur d'entrer le taux de conversion
        print(MESSAGE_TAUX);
        double cours = readDouble(); // Lecture du taux de conversion

        // Demande à l'utilisateur d'entrer la somme à convertir
        print(MESSAGE_SOMME);
        double somme = readDouble(); // Lecture de la somme à convertir

        // Validation des entrées
        if (cours <= 0 || somme < 0) {
            println("Erreur : le taux de conversion doit être positif et la somme doit être non négative.");
            return; // Sortir de la méthode si les valeurs sont invalides
        }

        // Calcul de la valeur convertie
        double bourse = somme * cours;

        // Affichage du résultat de la conversion
        println(MESSAGE_RESULTAT + bourse);
    }
}
