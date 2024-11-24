class Demineur extends Program {
    
    // Affiche l'état actuel du jeu avec les coordonnées
    void afficher(boolean[][] champ, boolean[][] carte) {
        // Afficher les lettres des colonnes
        print("  "); // Espace pour aligner avec les numéros de ligne
        for (int j = 0; j < length(champ[0]); j++) {
            print((char)('A' + j));
        }
        println();
        
        // Afficher le contenu du jeu avec les numéros de ligne
        for (int i = 0; i < length(champ); i++) {
            print((i + 1) + " "); // Numéro de ligne
            
            for (int j = 0; j < length(champ[0]); j++) {
                if (!carte[i][j]) {
                    print('?');
                } else {
                    if (champ[i][j]) {
                        print('@');
                    } else {
                        print('.');
                    }
                }
            }
            println();
        }
    }

    // Crée une carte complètement révélée
    boolean[][] revelerTout(int lignes, int colonnes) {
        boolean[][] carteComplete = new boolean[lignes][colonnes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                carteComplete[i][j] = true;
            }
        }
        return carteComplete;
    }

    // Initialise le champ avec des mines selon une probabilité donnée
    void initialiserChamp(boolean[][] champ, double proba) {
        for (int i = 0; i < length(champ); i++) {
            for (int j = 0; j < length(champ[0]); j++) {
                double valeur = random();
                if (valeur < proba) {
                    champ[i][j] = true; // Place une mine
                } else {
                    champ[i][j] = false; // Case vide
                }
            }
        }
    }

    // Vérifie si une chaîne est un nombre valide
    boolean estNombreValide(String input) {
        boolean vadide = true;
        if (length(input) == 0) {
            vadide = false;
        }
        for (int i = 0; i < length(input); i++) {
            if (charAt(input, i) < '0' || charAt(input, i) > '9') {
                vadide = false;
            }
        }
        return vadide;
    }

    // Demande et vérifie la saisie d'un numéro de ligne valide
    int saisirLigne(int nombreLignes) {
        String input;
        int ligne = 0;
        boolean saisieValide = false;
        
        while (!saisieValide) {
            println("Saisir le numéro de ligne (1-" + nombreLignes + "): ");
            input = readString();
            
            if (!estNombreValide(input)) {
                println("Erreur : veuillez entrer un nombre !");
            } else {
                ligne = stringToInt(input);
                if (ligne >= 1 && ligne <= nombreLignes) {
                    saisieValide = true;
                } else {
                    println("Ligne invalide ! Veuillez choisir entre 1 et " + nombreLignes);
                }
            }
        }
        
        return ligne - 1;
    }

    // Demande et vérifie la saisie d'une lettre de colonne valide
    int saisirColonne(int nombreColonnes) {
        char colonne;
        int colonneIndex;
        char dernierColonne = (char)('A' + nombreColonnes - 1);
        
        do {
            println("Saisir la lettre de la colonne (A-" + dernierColonne + "): ");
            colonne = readChar();
            
            // Convertir en majuscule si c'est une minuscule
            if (colonne >= 'a' && colonne <= 'z') {
                colonne = (char)(colonne - 'a' + 'A');
            }
            
            colonneIndex = colonne - 'A';
            
            if (colonneIndex < 0 || colonneIndex >= nombreColonnes) {
                println("Colonne invalide ! Veuillez choisir entre A et " + dernierColonne);
            }
        } while (colonneIndex < 0 || colonneIndex >= nombreColonnes);
        
        return colonneIndex;
    }

    // Algorithme principal du jeu
    void algorithm() {
        // Initialisation du jeu
        boolean[][] champ = new boolean[5][7];
        boolean[][] carte = new boolean[5][7];
        boolean perdu = false;
        int score = 0;
        
        // Placement des mines
        initialiserChamp(champ, 0.8);
        
        // Boucle principale du jeu
        while (!perdu) {
            println("Score actuel : " + score);
            afficher(champ, carte);
            println("Où voulez-vous tenter votre chance ?");
            
            int ligne = saisirLigne(length(champ));
            int colonne = saisirColonne(length(champ[0]));
            
            if (!carte[ligne][colonne]) {
                carte[ligne][colonne] = true;
                
                if (champ[ligne][colonne]) {
                    perdu = true;
                } else {
                    score = score + 1;
                    println("Case sans danger ! Continuez...");
                }
            } else {
                println("Cette case a déjà été explorée ! Choisissez-en une autre.");
            }
        }
        
        // Fin de partie
        println("");
        println("=== GAME OVER ===");
        println("BOUM ! Vous avez touché une mine !");
        // Utiliser une carte complètement révélée pour l'affichage final
        boolean[][] carteComplete = revelerTout(length(champ), length(champ[0]));
        afficher(champ, carteComplete);
        println("Votre score final est : " + score);
    }
}
