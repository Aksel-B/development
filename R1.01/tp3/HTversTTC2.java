class HTversTTC2 extends Program {
    void algorithm() {
        final double TVA = 1.196; // Taux de TVA constant
        print("Nombre de lignes : ");
        int nbr = readInt(); // Lire le nombre de lignes

        print("A partir de ? (doit être un nombre positif) ");
        double n = readInt(); // Lire le montant de départ

        // Vérification simple pour s'assurer que le montant de départ est positif
        if (n < 0) {
            println("Erreur : Veuillez entrer un nombre positif."); // Message d'erreur si le montant est négatif
            return; // Quitter la fonction si l'entrée est invalide
        }

        // Affichage des résultats
        for (int i = 0; i < nbr; i++) {
            double montantTTC = (n + 0.5) * TVA; // Calcul du montant TTC
            // Arrondi à deux décimales pour un affichage clair
            println((n + 0.5) + " euros HT = " + (int)(montantTTC * 100) / 100.0 + " euros TTC.");
            n = n + 0.5; // Incrémentation de 0.5 pour le montant HT
        }
    }
}
