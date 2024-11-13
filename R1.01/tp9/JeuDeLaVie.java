class JeuDeLaVie extends Program {

    // Affiche le tableau monde en utilisant '@' pour les cellules vivantes et '.' pour les cellules mortes.
    void afficher(boolean[][] monde) {
        for (int ligne = 1; ligne < length(monde) - 1; ligne++) {
            for (int colonne = 1; colonne < length(monde[0]) - 1; colonne++) {
                if (monde[ligne][colonne]) {
                    print('@'); // Cellule vivante
                } else {
                    print('.'); // Cellule morte
                }
            }
            println(); // Nouvelle ligne après chaque rangée
        }
    }

    void init(boolean[][] monde, double proba) {
        // On parcourt chaque cellule sauf les bordures
        for (int ligne = 1; ligne < length(monde) - 1; ligne++) {
            for (int colonne = 1; colonne < length(monde[0]) - 1; colonne++) {
                // On tire un nombre aléatoire entre 0 et 1
                double nombreAleatoire = random();
                
                // Si ce nombre est plus petit que proba, la cellule vit
                if (nombreAleatoire < proba) {
                    monde[ligne][colonne] = true;  // La cellule est vivante
                } else {
                    monde[ligne][colonne] = false; // La cellule est morte
                }
            }
        }
    }

    // Compte les voisins vivants autour de la cellule [lig][col].
    int nombreDeVoisins(boolean[][] monde, int lig, int col) {
        int voisins = 0;
        for (int i = lig - 1; i <= lig + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if ((i != lig || j != col) && monde[i][j]) voisins++;
            }
        }
        return voisins;
    }

    // Détermine si une cellule est vivante dans la génération suivante.
    boolean evolution(int nombreDeVoisins, boolean etatCellule) {
        boolean prochainEtat = true;
        
        // Si la cellule est vivante
        if (etatCellule) {
            // Survie : la cellule reste vivante si elle a 2 ou 3 voisins
            // Sinon elle meurt de solitude (<2) ou de surpopulation (>3)
            prochainEtat = (nombreDeVoisins == 2 || nombreDeVoisins == 3);
        }
        // Si la cellule est morte
        else {
            // Naissance : une cellule naît si elle a exactement 3 voisins
            prochainEtat = (nombreDeVoisins == 3);
        }
        
        return prochainEtat;
    }

    // Fonction pour ajouter un carré de 2x2
    void ajouterCarre(boolean[][] monde, int lig, int col) {
        monde[lig][col] = true;
        monde[lig + 1][col] = true;
        monde[lig][col + 1] = true;
        monde[lig + 1][col + 1] = true;
    }

    // Fonction pour ajouter un glisseur
    void ajouterGlisseur(boolean[][] monde, int lig, int col) {
        monde[lig][col + 1] = true;
        monde[lig + 1][col + 2] = true;
        monde[lig + 2][col] = true;
        monde[lig + 2][col + 1] = true;
        monde[lig + 2][col + 2] = true;
    }

    // Fonction pour ajouter une barre de 3 cellules
    void ajouterBarre(boolean[][] monde, int lig, int col) {
        monde[lig][col] = true;
        monde[lig][col + 1] = true;
        monde[lig][col + 2] = true;
    }

    // Algorithme principal du Jeu de la Vie.
    void algorithm() {
        boolean[][] monde = new boolean[20][20];
        boolean[][] mondeN;
        int generation = 0;
        boolean stop = false;
        String reponse;
        
        init(monde, 0.1);
        ajouterCarre(monde, 5, 5);
        ajouterGlisseur(monde, 10, 10);
        ajouterBarre(monde, 15, 8);
                
        while(!stop) {
            generation = generation + 1;
            mondeN = new boolean[length(monde,1)][length(monde,2)];
            
            // Double boucle pour calculer la génération suivante
            for (int i = 1; i < length(monde) - 1; i++) {
                for (int j = 1; j < length(monde[0]) - 1; j++) {
                    int voisins = nombreDeVoisins(monde, i, j);
                    mondeN[i][j] = evolution(voisins, monde[i][j]);
                }
            }
            
            monde = mondeN;
            println("Generation " + generation);
            afficher(monde);
            println("Entrez 'stop' pour arreter, ou appuyez sur Entree pour continuer");
            reponse = readString();
            stop = equals(reponse, "stop");
        }
    }
}
