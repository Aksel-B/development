// Déclaration de la classe Convertion qui hérite de Program
class Convertion extends Program {

    // Constantes pour les valeurs utilisées
    final double COURS_LIVRE = 1.09; // Taux de conversion de la livre
    final double MONTANT_DEPART = 59; // Montant de départ
    final double SOMME_SUPPLEMENTAIRE = 42; // Somme supplémentaire

    // Méthode principale algorithm() pour effectuer des calculs de conversion de monnaie
    void algorithm() {
        // Calcul du montant total en utilisant le taux de conversion
        double bourse = MONTANT_DEPART * COURS_LIVRE;

        // Ajout d'une somme supplémentaire
        bourse = bourse + SOMME_SUPPLEMENTAIRE;

        // Calcul de la part que chaque personne reçoit
        double share = bourse / 2;

        // Affichage du résultat total et de la part de chaque personne
        println("Résultat total : " + bourse + " euros, chaque reçoit : " + share + " euros");
    }
}
