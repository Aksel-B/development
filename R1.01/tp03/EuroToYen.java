class EuroToYen extends Program {
    void algorithm () {
        // Demander à l'utilisateur combien de lignes il souhaite afficher
        print("Combien de lignes souhaitez-vous ? ");
        int n = readInt(); // Lire le nombre de lignes souhaitées

        double yen = 135.90; // Taux de conversion de l'euro au yen
        int variable = 0; // Initialiser une variable pour le montant en euros

        // Boucle pour afficher les conversions d'euros en yens
        for (int i = 0; n > i; i = i + 1) {     
            // Afficher la conversion d'euros en yens
            println(variable + 1 + " euros = " + yen * (variable + 1) + " yens.");
            variable++; // Incrémenter la variable pour la prochaine ligne
        }
    }
}
