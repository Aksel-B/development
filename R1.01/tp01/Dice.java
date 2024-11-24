// Déclaration de la classe Dice qui hérite de Program
class Dice extends Program {

    // Méthode principale algorithm() pour simuler le lancer d'un dé
    void algorithm() {
        // Demande à l'utilisateur d'entrer le nombre de faces du dé
        print("Nombre de faces : ");
        int face = readInt(); // Lecture de l'entrée utilisateur

        // Vérification que le nombre de faces est valide
        if (face <= 0) {
            println("Impossible : le nombre de faces doit être positif.");
            return; // Sortie de la méthode si le nombre de faces est invalide
        }

        // Génération d'un nombre aléatoire entre 1 et le nombre de faces
        int dés = (int)(random() * face) + 1;

        // Affichage du résultat du lancer de dé
        println("Résultat du lancer : " + dés);
    }
}
