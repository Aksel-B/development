class HTversTTC1 extends Program {
    void algorithm() {
        final double TVA = 1.196; // Taux de TVA constant
        print("Nombre de lignes : "); // Demander à l'utilisateur le nombre de lignes
        int nbr = readInt(); // Lire le nombre de lignes
        int un = 0; // Initialiser le compteur

        // Boucle pour afficher les montants HT et TTC
        for (int i = 0; i < nbr; i++) { // Correction pour utiliser i < nbr
            // Calculer le montant TTC
            double montantHT = un + 1; // Montant HT
            double montantTTC = montantHT * TVA; // Calculer le montant TTC
            
            // Afficher le résultat avec formatage à deux décimales
            println(montantHT + " euros HT = " + (int)(montantTTC * 100) / 100.0 + " euros TTC.");
            un++; // Incrémenter le compteur
        }
    }
}
