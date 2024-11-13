class Demineur2 extends Program {
    
    void afficher(boolean[][] champ, boolean[][] carte, int posJL, int posJC) {
        println("=== CHAMP DE MINES ===");
        // Ligne supérieure
        print("  ");
        for (int j = 0; j < length(champ[0]); j++) {
            print("-");
        }
        println();
        
        for (int i = 0; i < length(champ); i++) {
            print("| "); // Bord gauche
            for (int j = 0; j < length(champ[0]); j++) {
                if (i == posJL && j == posJC) {
                    print('&');
                } else if (!carte[i][j]) {
                    print('?');
                } else if (carte[i][j] && champ[i][j]) {
                    print('@');
                } else {
                    print(' ');
                }
            }
            println(" |"); // Bord droit
        }
        
        // Ligne inférieure
        print("  ");
        for (int j = 0; j < length(champ[0]); j++) {
            print("-");
        }
        println();
    }
    
    boolean commandeEstValide(char commande, int posJL, int posJC, int nbLignes, int nbColonnes) {
        if (commande != 'H' && commande != 'B' && commande != 'A') {
            return false;
        }
        
        boolean result = false;
        if (commande == 'A') {
            result = posJC < nbColonnes - 1;
        } else if (commande == 'H') {
            result = posJL > 0;
        } else if (commande == 'B') {
            result = posJL < nbLignes - 1;
        }
        return result;
    }
    
    char saisirCommande(int posJL, int posJC, int nbLignes, int nbColonnes) {
        char commande;
        do {
            println("Que souhaitez-vous faire ?");
            println("H: Monter");
            println("B: Descendre");
            println("A: Avancer");
            print("Votre choix : ");
            commande = readChar();
            println("");
            // Convertir en majuscule si nécessaire
            if (commande >= 'a' && commande <= 'z') {
                commande = (char)(commande - 'a' + 'A');
            }
            if (!commandeEstValide(commande, posJL, posJC, nbLignes, nbColonnes)) {
                println("Déplacement impossible dans cette direction !");
            }
        } while (!commandeEstValide(commande, posJL, posJC, nbLignes, nbColonnes));
        return commande;
    }
    
    int[] nouvellePosition(int posJL, int posJC, char commande) {
        int[] nouvellePos = new int[]{posJL, posJC};
        
        if (commande == 'H') {
            nouvellePos[0] = posJL - 1;
        } else if (commande == 'B') {
            nouvellePos[0] = posJL + 1;
        } else if (commande == 'A') {
            nouvellePos[1] = posJC + 1;
        }
        
        return nouvellePos;
    }
    
    void initialiserChamp(boolean[][] champ, double proba) {
        for (int i = 0; i < length(champ); i++) {
            for (int j = 0; j < length(champ[0]); j++) {
                champ[i][j] = random() < proba;
            }
        }
    }
    
    void afficherDefaite(boolean[][] champ, boolean[][] carte, int posJL, int posJC) {
        println("💥 BOUM ! 💥");
        println("Vous avez marché sur une mine !");
        
        // Révéler toutes les mines
        for (int i = 0; i < length(champ); i++) {
            for (int j = 0; j < length(champ[0]); j++) {
                if (champ[i][j]) {
                    carte[i][j] = true;
                }
            }
        }
        
        // Afficher l'état final
        afficher(champ, carte, posJL, posJC);
        println("=== GAME OVER ===");
    }
    
    void afficherVictoire(boolean[][] champ, boolean[][] carte, int posJL, int posJC) {
        println("🌟 FÉLICITATIONS ! 🌟");
        println("Vous avez traversé le champ de mines avec succès !");
        afficher(champ, carte, posJL, posJC);
        println("=== VICTOIRE ===");
    }
    
    void algorithm() {
        boolean[][] champ = new boolean[5][7];
        boolean[][] carte = new boolean[5][7];
        boolean perdu = false;
        
        // Joueuse sur la ligne du milieu de la première colonne
        int posJL = length(champ) / 2;
        int posJC = 0;
        
        initialiserChamp(champ, 0.1);
        // S'il y a une mine sur la position initiale, on l'enlève
        champ[posJL][posJC] = false;
        // La position initiale est explorée
        carte[posJL][posJC] = true;
        
        println("Bienvenue dans le jeu du champ de mines !");
        println("Votre but est d'atteindre l'autre côté sans toucher de mine.");
        
        // On continue tant qu'on n'a pas gagné ou perdu
        while (!perdu && posJC < length(champ[0]) - 1) {
            afficher(champ, carte, posJL, posJC);
            
            // Saisir la commande
            char commande = saisirCommande(posJL, posJC, length(champ), length(champ[0]));
            
            // Mettre à jour la position
            int[] nouvellePos = nouvellePosition(posJL, posJC, commande);
            posJL = nouvellePos[0];
            posJC = nouvellePos[1];
            
            // Explorer la nouvelle case
            carte[posJL][posJC] = true;
            
            // Vérifier si on a touché une mine
            if (champ[posJL][posJC]) {
                perdu = true;
                carte[posJL][posJC] = true; 
            }
        }
        
        // Affichage final
        if (perdu) {
            afficherDefaite(champ, carte, posJL, posJC);
        } else {
            afficherVictoire(champ, carte, posJL, posJC);
        }
    }
    
    void testCommandeEstValide() {
        assertEquals(true, commandeEstValide('A', 2, 3, 5, 5));
        assertEquals(false, commandeEstValide('A', 2, 4, 5, 5));
        assertEquals(true, commandeEstValide('H', 1, 2, 5, 5));
        assertEquals(false, commandeEstValide('H', 0, 2, 5, 5));
        assertEquals(true, commandeEstValide('B', 3, 2, 5, 5));
        assertEquals(false, commandeEstValide('B', 4, 2, 5, 5));
    }
}
