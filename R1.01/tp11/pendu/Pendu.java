class Pendu extends Program {
    
    // Fonction qui crée une nouvelle lettre non découverte
    Lettre newLettre(char car) {
        Lettre l = new Lettre();
        l.car = car;
        l.decouverte = false;
        return l;
    }

    // Test de la fonction newLettre
    void testNewLettre() {
        Lettre l1 = newLettre('a');
        assertEquals('a', l1.car);
        assertEquals(false, l1.decouverte);
        
        Lettre l2 = newLettre('z');
        assertEquals('z', l2.car);
        assertEquals(false, l2.decouverte);
    }

    // Fonction qui crée un tableau de lettres à partir d'un mot
    Lettre[] creerMot(String mot) {
        Lettre[] resultat = new Lettre[length(mot)];
        for (int i = 0; i < length(mot); i++) {
            resultat[i] = newLettre(charAt(mot, i));
        }
        return resultat;
    }

    // Test de la fonction creerMot
    void testCreerMot() {
        Lettre[] mot = creerMot("unix");
        assertEquals(4, length(mot));
        assertEquals('u', mot[0].car);
        assertEquals('i', mot[2].car);
    }

    // Fonction qui convertit une lettre en chaîne
    String toString(Lettre lettre) {
        String result = "*";
        if (lettre.decouverte) {
            result += lettre.car;
        }
        return result;
    }

    // Test de la fonction toString pour une lettre
    void testToStringLettre() {
        Lettre l1 = newLettre('a');
        assertEquals("*", toString(l1));
        
        Lettre l2 = newLettre('b');
        l2.decouverte = true;
        assertEquals("b", toString(l2));
    }

    // Fonction qui convertit un mot en chaîne
    String toString(Lettre[] mot) {
        String resultat = "";
        for (int i = 0; i < length(mot); i++) {
            resultat += toString(mot[i]);
        }
        return resultat;
    }

    // Test de la fonction toString pour un mot
    void testToStringMot() {
        Lettre[] mot = creerMot("test");
        assertEquals("****", toString(mot));
        mot[0].decouverte = true;
        assertEquals("t***", toString(mot));
    }

    // Fonction qui vérifie si un mot est entièrement découvert
    boolean estDecouvert(Lettre[] mot) {
        boolean resultat = true;
        if (length(mot) == 0) {
            resultat = true;
        }
        for (int i = 0; i < length(mot); i++) {
            if (!mot[i].decouverte) {
                resultat = false;
            }
        }
        return resultat;
    }

    // Test de la fonction estDecouvert
    void testEstDecouvert() {
        Lettre[] motVide = new Lettre[0];
        assertTrue(estDecouvert(motVide));
        
        Lettre[] motCache = creerMot("test");
        assertFalse(estDecouvert(motCache));
        
        Lettre[] motDecouvert = creerMot("test");
        for (int i = 0; i < length(motDecouvert); i++) {
            motDecouvert[i].decouverte = true;
        }
        assertTrue(estDecouvert(motDecouvert));
    }

    // Fonction qui découvre une lettre dans un mot
    boolean decouvrir(Lettre[] mot, char car) {
        boolean trouve = false;
        for (int i = 0; i < length(mot); i++) {
            if (mot[i].car == car) {
                mot[i].decouverte = true;
                trouve = true;
            }
        }
        return trouve;
    }

    // Test de la fonction decouvrir
    void testDecouvrir() {
        Lettre[] mot = creerMot("hello");
        assertTrue(decouvrir(mot, 'l'));
        assertFalse(decouvrir(mot, 'z'));
        assertEquals("**ll*", toString(mot));
    }

    // Algorithme principal
    void algorithm() {
        String motSecret = "informatique";
        Lettre[] mot = creerMot(motSecret);
        int essaisRestants = 5;
        
        println("Bienvenue dans le jeu du pendu!");
        
        while (essaisRestants > 0 && !estDecouvert(mot)) {
            println("\nMot actuel : " + toString(mot));
            println("Il vous reste " + essaisRestants + " essais");
            println("Proposez une lettre : ");
            
            String input = readString();
            if (length(input) > 0) {
                char lettre = charAt(input, 0);
                if (!decouvrir(mot, lettre)) {
                    essaisRestants--;
                    println("Cette lettre n'est pas dans le mot !");
                }
            }
        }
        
        if (estDecouvert(mot)) {
            println("\nBravo ! Vous avez gagné ! Le mot était : " + motSecret);
        } else {
            println("\nDommage... Le mot était : " + motSecret);
        }
    }
}
