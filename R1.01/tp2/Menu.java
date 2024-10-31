class Menu extends Program {
    void algorithm() {
        // Afficher le titre du logiciel
        println("Bienvenue dans le SuperLogicielDeLanTroisMille");
        
        // Afficher les options du menu
        println("1. Ouvrir un document existant.");
        println("2. Créer un nouveau document.");
        println("3. Enregistrer le document courant.");
        println("4. Quitter ce magnifique logiciel.");

        // Demander à l'utilisateur de faire un choix
        print("Veuillez entrer votre choix: ");
        int choix = readInt(); // Lire le choix de l'utilisateur

        // Traiter le choix de l'utilisateur
        if (choix == 1) {
            println("Vous avez choisi: Ouvrir un document existant.");
        } else if (choix == 2) {
            println("Vous avez choisi: Créer un nouveau document.");
        } else if (choix == 3) {
            println("Vous avez choisi: Enregistrer le document courant.");
        } else if (choix == 4) {
            println("Vous avez choisi: Quitter ce magnifique logiciel.");
        } else {
            // Message d'erreur pour un choix invalide
            println("Erreur : choix invalide. Veuillez entrer un nombre entre 1 et 4.");
        }
    }
}
