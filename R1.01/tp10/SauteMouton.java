class SauteMouton extends Program {
    // Constantes pour représenter les moutons et l'espace vide
    final char G = '<';  // mouton qui va vers la gauche
    final char D = '>';  // mouton qui va vers la droite
    final char V = '_';  // l'espace vide de la prairie

    // Convertit la prairie en String pour l'affichage
    String toString(char[] prairie) {
        String resultat = "";
        for (int i = 0; i < length(prairie); i++) {
            resultat = resultat + prairie[i];
        }
        return resultat;
    }

    // Initialise la prairie dans sa configuration de départ
    void initialiser(char[] prairie) {
        int taille = length(prairie);
        int nbMoutons = (taille - 1) / 2;

        for (int i = 0; i < nbMoutons; i++) {
            prairie[i] = '>';  // Moutons allant vers la droite
        }

        prairie[nbMoutons] = '_';  // Case vide au centre

        for (int i = nbMoutons + 1; i < taille; i++) {
            prairie[i] = '<';  // Moutons allant vers la gauche
        }
    }


    // Teste la fonction effectuerDeplacement
    void testEffectuerDeplacement() {
        char[] prairie;
        // de la prairie >>>_<<< en déplaçant le mouton 2, on doit passer à la prairie >>_><<<
        prairie = new char[]{D,D,D,V,G,G,G};
        effectuerDeplacement(2, prairie);
        assertArrayEquals(new char[]{D,D,V,D,G,G,G}, prairie);
        
        // de la prairie >>_><<< en déplaçant le mouton 4, on doit passer à la prairie >><>_<<
        prairie = new char[]{D,D,V,D,G,G,G};
        effectuerDeplacement(4, prairie);
        assertArrayEquals(new char[]{D,D,G,D,V,G,G}, prairie);
        
        // de la prairie >><>_<< en déplaçant le mouton 3, on doit passer à la prairie >>_><<<
        prairie = new char[]{D,D,G,D,V,G,G};
        effectuerDeplacement(3, prairie);
        assertArrayEquals(new char[]{D,D,V,G,D,G,G}, prairie);
    }

    // Retourne l'indice de la case vide
    int indiceCaseVide(char[] prairie) {
        for (int i = 0; i < length(prairie); i++) {
            if (prairie[i] == V) return i;
        }
        return -1;  // ne devrait jamais arriver
    }

    // Test de la fonction indiceCaseVide
    void testIndiceCaseVide() {
        char[] prairie;
        prairie = new char[]{D,D,D,V,G,G,G};
        assertEquals(3, indiceCaseVide(prairie));
        
        prairie = new char[]{D,D,V,D,G,G,G};
        assertEquals(2, indiceCaseVide(prairie));
        
        prairie = new char[]{D,D,G,D,V,G,G};
        assertEquals(4, indiceCaseVide(prairie));
    }

    // Effectue le déplacement d'un mouton vers la case vide
    void effectuerDeplacement(int positionMouton, char[] prairie) {
        int posVide = indiceCaseVide(prairie);
        char temp = prairie[positionMouton];
        prairie[positionMouton] = prairie[posVide];
        prairie[posVide] = temp;
    }

    // Teste si une position correspond à un mouton qui peut être déplacé
    void testEstPositionValide() {
        char[] prairie;
        // un indice en dehors des indices du tableau n'est jamais valide
        prairie = new char[7];
        assertFalse(estPositionValide(-1, prairie));
        assertFalse(estPositionValide(7, prairie));
        
        prairie = new char[]{D,D,D,V,G,G,G};
        assertTrue(estPositionValide(2, prairie));
        assertTrue(estPositionValide(1, prairie));
        assertTrue(estPositionValide(4, prairie));
        assertTrue(estPositionValide(5, prairie));
        assertFalse(estPositionValide(0, prairie));
        assertFalse(estPositionValide(3, prairie));
        assertFalse(estPositionValide(6, prairie));
        
        prairie = new char[]{D,V,D,G,D,G,G};
        assertTrue(estPositionValide(0, prairie));
        assertFalse(estPositionValide(1, prairie));
        assertTrue(estPositionValide(2, prairie));
        assertTrue(estPositionValide(3, prairie));
        assertFalse(estPositionValide(4, prairie));
        assertTrue(estPositionValide(5, prairie));
        assertFalse(estPositionValide(6, prairie));
    }

    // Vérifie si une position donnée correspond à un mouton qui peut être déplacé
    boolean estPositionValide(int positionMouton, char[] prairie) {
        if (positionMouton < 0 || positionMouton >= length(prairie)) return false;
        
        int posVide = indiceCaseVide(prairie);
        
        if (prairie[positionMouton] == D) {
            // Peut avancer d'une case vers la droite
            if (posVide == positionMouton + 1) return true;
            // Peut sauter par-dessus un mouton vers la droite
            if (posVide == positionMouton + 2 && prairie[positionMouton + 1] != V) return true;
        }
        if (prairie[positionMouton] == G) {
            // Peut avancer d'une case vers la gauche
            if (posVide == positionMouton - 1) return true;
            // Peut sauter par-dessus un mouton vers la gauche
            if (posVide == positionMouton - 2 && prairie[positionMouton - 1] != V) return true;
        }
        return false;
    }

    // Saisit un coup valide du joueur
    int saisirCoup(char[] prairie) {
        int position;
        do {
            println("Entrez la position du mouton à déplacer (0-6) :");
            position = readInt();
            if (!estPositionValide(position, prairie)) {
                println("Position invalide, réessayez.");
            }
        } while (!estPositionValide(position, prairie));
        return position;
    }

    // Test de la fonction configFinaleAtteinte
    void testConfigFinaleAtteinte() {
        char[] prairie = new char[]{G,G,G,V,D,D,D};
        assertTrue(configFinaleAtteinte(prairie));
        
        prairie = new char[]{G,G,V,G,D,D,D};
        assertFalse(configFinaleAtteinte(prairie));
    }

    // Vérifie si la configuration finale est atteinte
    boolean configFinaleAtteinte(char[] prairie) {
        int posVide = indiceCaseVide(prairie);
        for (int i = 0; i < posVide; i++) {
            if (prairie[i] != G) return false;
        }
        for (int i = posVide + 1; i < length(prairie); i++) {
            if (prairie[i] != D) return false;
        }
        return true;
    }

    // Test de la fonction blocage
    void testBlocage() {
        char[] prairie = new char[]{D,D,G,D,G,G,V};
        assertTrue(blocage(prairie));
        
        prairie = new char[]{G,G,G,V,D,D,D};
        assertTrue(blocage(prairie));
        
        prairie = new char[]{D,D,D,V,G,G,G};
        assertFalse(blocage(prairie));
        
        prairie = new char[]{V,G,G,G,D,D,D};
        assertFalse(blocage(prairie));
    }

    // Vérifie s'il y a une situation de blocage
    boolean blocage(char[] prairie) {
        for (int i = 0; i < length(prairie); i++) {
            if (estPositionValide(i, prairie)) return false;
        }
        return true;
    }

    // Algorithme principal
    void algorithm() {
        int taille;
        do {
            println("Entrez la taille de la prairie (nombre impair >= 3) :");
            taille = readInt();
            if (taille < 3 || taille % 2 == 0) {
                println("La taille doit être un nombre impair supérieur ou égal à 3.");
            }
        } while (taille < 3 || taille % 2 == 0);

        char[] prairie = new char[taille];
        initialiser(prairie);
        
        while (!configFinaleAtteinte(prairie) && !blocage(prairie)) {
            println(toString(prairie));
            int positionMouton = saisirCoup(prairie);
            effectuerDeplacement(positionMouton, prairie);
        }
        
        println(toString(prairie));
        if (configFinaleAtteinte(prairie)) {
            println("Réussite");
        } else {
            println("Blocage");
        }
    }
}
