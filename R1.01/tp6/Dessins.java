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

    // Teste la méthode trianglePlein
    void testTrianglePlein() {
        assertEquals("*\n", trianglePlein(1, '*'));
        assertEquals("o\noo\n", trianglePlein(2, 'o'));
        assertEquals("+\n++\n+++\n", trianglePlein(3, '+'));
    }
}
