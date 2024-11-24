// Déclaration de la classe ChiffreAuHazard qui hérite de Program
class ChiffreAuHazard extends Program {
    
    // Constante pour définir la plage de chiffres
    final int PLAGE_MAX = 10; // Plage maximale pour le chiffre aléatoire (0 à 9)

    // Méthode principale algorithm() pour générer un chiffre aléatoire
    void algorithm() {
        // Génération d'un chiffre aléatoire entre 0 et 9
        int chiffre = (int) (random() * PLAGE_MAX);

        // Affichage du chiffre généré
        println("Chiffre aléatoire généré : " + chiffre);
    }
}
