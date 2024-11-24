// Déclaration de la classe RenduMonnaie qui hérite de Program
class RenduMonnaie extends Program {
    // Constantes pour les valeurs des billets et pièces
    final int BILLET_20 = 20;
    final int BILLET_10 = 10;
    final int BILLET_5 = 5;
    final int PIECE_2 = 2;
    final int PIECE_1 = 1;

    // Méthode principale algorithm() pour calculer le rendu de monnaie
    void algorithm() {
        // Déclaration des variables pour stocker le montant et le nombre de billets/pièces
        int somme, nb20, nb10, nb5, nb2, nb1, reste;

        // Demande à l'utilisateur d'entrer le montant à rendre
        print("Quel est le montant que vous souhaitez rendre en monnaie ? ");
        somme = readInt(); // Lecture de l'entrée utilisateur

        // Vérification que le montant est positif
        if (somme < 0) {
            println("Erreur : le montant doit être positif.");
            return; // Sortie de la méthode si le montant est négatif
        }

        // Calcul du nombre de billets de 20
        nb20 = somme / BILLET_20;
        reste = somme % BILLET_20; // Reste après extraction des billets de 20

        // Calcul du nombre de billets de 10
        nb10 = reste / BILLET_10;
        reste = reste % BILLET_10; // Reste après extraction des billets de 10

        // Calcul du nombre de billets de 5
        nb5 = reste / BILLET_5;
        reste = reste % BILLET_5; // Reste après extraction des billets de 5

        // Calcul du nombre de pièces de 2
        nb2 = reste / PIECE_2;
        reste = reste % PIECE_2; // Reste après extraction des pièces de 2

        // Calcul du nombre de pièces de 1
        nb1 = reste / PIECE_1; // Ici, reste est déjà le nombre de pièces de 1

        // Affichage des résultats
        println("Nombre de billets de 20 : " + nb20);
        println("Nombre de billets de 10 : " + nb10);
        println("Nombre de billets de 5 : " + nb5);
        println("Nombre de pièces de 2 : " + nb2);
        println("Nombre de pièces de 1 : " + nb1);
    }
}
