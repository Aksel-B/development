class PlusPetitNombre extends Program {
    void algorithm() {
        // Demander à l'utilisateur d'entrer deux nombres
        println("Entrez deux nombres :");
        int nbr1 = readInt(); // Lire le premier nombre
        int nbr2 = readInt(); // Lire le deuxième nombre

        // Comparer les deux nombres pour déterminer le plus petit
        if (nbr1 < nbr2) {
            println("Le plus petit est " + nbr1); // nbr1 est le plus petit
        } else if (nbr1 > nbr2) {
            println("Le plus petit est " + nbr2); // nbr2 est le plus petit
        } else {
            println("Les deux nombres sont égaux : " + nbr1); // Les nombres sont égaux
        }
    }
}
