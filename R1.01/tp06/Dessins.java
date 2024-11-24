class Dessins extends Program {

    // Génère un triangle plein de taille 'Taille' avec le caractère 'c'
    String trianglePlein(int Taille, char c) {
        String chaine = "";
        for (int i = 0; i < Taille; i++) {
            for (int j = 0; j <= i; j++) {  // Le nombre de caractères à afficher sur chaque ligne augmente
                chaine = chaine + c;
            }
            chaine = chaine + "\n";  // Nouvelle ligne après chaque ligne du triangle
        }
        return chaine;  // Retourne la chaîne générée
    }

    // Génère un triangle creux de taille 'Taille' avec le caractère 'c'
    String triangleCreux(int Taille, char c) {
        String chaine = "";
        for (int i = 0; i < Taille; i++) {
            for (int j = 0; j <= i; j++) {  // Le nombre de caractères à afficher sur chaque ligne augmente
                if (j == 0 || j == i) {
                    chaine = chaine + c;  // Ajoute le caractère c aux bords du triangle
                } else {
                    chaine = chaine + " ";  // Espace pour les autres positions
                }
            }
            chaine = chaine + "\n";  // Nouvelle ligne après chaque ligne du triangle
        }
        return chaine;  // Retourne la chaîne générée
    }

    // Génère un triangle en forme de croix avec la taille 'Taille' et le caractère 'c'
    String triangleCroix(int Taille, char c) {
        String chaine = "";
        for (int i = 0; i < Taille; i++) {
            for (int j = 0; j < Taille; j++) {
                // Le caractère 'c' est affiché sur les bords de la croix
                if (i == j || i + j == Taille - 1) {
                    chaine = chaine + c;
                } else {
                    chaine = chaine + " ";  // Espace pour les autres positions
                }
            }
            chaine = chaine + "\n";  // Nouvelle ligne après chaque ligne du triangle
        }
        return chaine;  // Retourne la chaîne générée
    }

    // Fonction pour afficher les figures demandées par l'exemple
    void algorithm() {
        // Demande à l'utilisateur de choisir la figure
        println("Figure : ");
        print("1 pour Triangle plein, 2 pour Triangle creux, 3 pour Triangle croix : ");
        int figure = readInt();  // Lecture du choix de l'utilisateur

        // Demande la taille et le caractère de la figure choisie
        print("Taille : ");
        int taille = readInt();  // Lecture de la taille de la figure
        print("Caractere : ");
        char carac = readChar();  // Lecture du caractère à utiliser pour dessiner la figure

        // Affiche la figure en fonction du choix de l'utilisateur
        if (figure == 1) {
            println("Figure : 1");
            println(trianglePlein(taille, carac));
        } else if (figure == 2) {
            println("Figure : 2");
            println(triangleCreux(taille, carac));
        } else if (figure == 3) {
            println("Figure : 3");
            println(triangleCroix(taille, carac));
        } else {
            println("Choix invalide.");
        }
    }

    // Fonction pour tester les dessins
    void test() {
        assertEquals("+\n++\n+++\n++++\n+++++\n", trianglePlein(5, '+'));
        assertEquals("O\nOO\nO O\nOOOO\n", triangleCreux(4, 'O'));
        assertEquals("X...X\n.X.X.\n..X..\n.X.X.\nX...X\n", triangleCroix(5, 'X'));
    }
}
