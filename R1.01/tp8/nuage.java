class nuage extends Program {
    // ! Exercice 1 
    int nbFois(String[] tab, String mot){
        int n = 0;
        // Parcourt chaque élément du tableau pour vérifier si c'est le mot recherché
        for (int i = 0; i < length(tab); i++){
            if(equals(tab[i], mot)){
                n++;
            }
        }
        return n;
    }

    void testNbFois () {
        String[] tab = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        assertEquals(3, nbFois(tab, "je"));
        assertEquals(2, nbFois(tab, "tu"));
        assertEquals(0, nbFois(tab, "il"));
    }

    // ! Exercice 2
    int[] frequences (String[] motsCles, String[] mots) {
        int l = length(motsCles);
        int[] freq = new int[l];
        // Pour chaque mot clé, on compte combien de fois il apparaît dans le tableau mots
        for(int i = 0; i < l; i++){
            freq[i] = nbFois(mots, motsCles[i]);
        }
        return freq;
    }

    void testFrequences () {
        String[] motsCles = new String[]{"je", "tu", "elle"};
        int[] freq = new int[]{3, 2, 1};
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        assertArrayEquals(freq, frequences(motsCles, mots));
    }

    // ! Exercice 3
    String[] motsDifferents(String[] mots) {
        // Crée un tableau temporaire pour contenir tous les mots
        String[] motsDiff = new String[length(mots)];
        for (int i = 0; i < length(motsDiff); i++) {
            motsDiff[i] = ""; // Initialisation avec des chaînes vides
        }

        int index = 0; // Compteur pour ajouter des mots différents
        for (int i = 0; i < length(mots); i++) {
            if (nbFois(motsDiff, mots[i]) == 0) { // Si le mot n'est pas déjà dans motsDiff
                motsDiff[index] = mots[i]; // Ajoute le mot
                index++;
            }
        }

        // Retourne un sous-tableau contenant les mots différents
        return sousTableau(motsDiff, index);
    }

    void testMotsDifferents () {
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        String[] motsDiff = motsDifferents(mots);
        for (int idx = 0; idx < length(mots); idx = idx+1){
            assertEquals(1, nbFois(motsDiff,mots[idx]));
            // On s'assure que chaque mot apparaît une seule fois dans motsDiff
        }
        // On vérifie que les mots sont bien à la bonne place
        assertEquals("je", motsDiff[0]);
        assertEquals("tu", motsDiff[1]);
        assertEquals("elle", motsDiff[2]);
        // Les éléments suivants du tableau doivent être vides
        for (int idx = 3; idx < length(motsDiff); idx = idx+1){
            assertEquals("", motsDiff[idx]);
        }
    }

    // ! Exercice 4
    // Teste la fonction sousTableau qui extrait un sous-ensemble du tableau.
    void testSousTableau () {
        // Test avec un sous-tableau de taille 3
        assertArrayEquals(new String[]{"a", "b", "c"}, sousTableau(new String[]{"a", "b", "c", "d", "e"}, 3));
        // Test avec une taille de sous-tableau plus grande que la longueur du tableau
        assertArrayEquals(new String[]{"a", "b"}, sousTableau(new String[]{"a", "b"}, 5));
        // Test avec une taille de sous-tableau de 0
        assertArrayEquals(new String[]{}, sousTableau(new String[]{"a", "b", "c"}, 0));
        // Test avec une taille de sous-tableau négative
        assertArrayEquals(new String[]{"a", "b"}, sousTableau(new String[]{"a", "b"}, -5));
        // Test pour s'assurer que le tableau passé en paramètre n'est pas modifié
        String[] tab = new String[]{"a", "b"};
        assertNotEquals(tab, sousTableau(tab, 2));
        assertNotEquals(tab, sousTableau(tab, 3));
        assertNotEquals(tab, sousTableau(tab, -1));
    }

    // ! Exercice 5
    // Vérifie si le caractère est une lettre (A-Z ou a-z)
    boolean estLettre(char c){
        boolean lettre = false;
        // Vérifie si le caractère est compris entre A-Z ou a-z
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            lettre = true;
        }
        return lettre;
    }

    // Extrait les mots d'une chaîne en ignorant la ponctuation
    String[] lesMots(String s) {
        String[] mots = new String[10]; // Taille initiale arbitraire
        String mot = "";
        int index = 0;

        // Parcourt chaque caractère de la chaîne
        for (int i = 0; i < length(s); i++) {
            char c = charAt(s, i);
            if (estLettre(c)) {
                mot += c; // Accumule le mot
            } else if (length(mot) > 0) {
                // Si un mot est terminé, ajoutez-le au tableau
                if (index == length(mots)) {
                    mots = sousTableau(mots, index + 10); // Augmenter la taille du tableau
                }
                mots[index++] = toLowerCase(mot); // Ajoute le mot en minuscules
                mot = ""; // Réinitialiser le mot
            }
        }

        // Ajouter le dernier mot si nécessaire
        if (length(mot) > 0) {
            if (index == length(mots)) {
                mots = sousTableau(mots, index + 10);
            }
            mots[index++] = toLowerCase(mot);
        }

        // Retourne un sous-tableau des mots valides
        return sousTableau(mots, index);
    }

    void testLesMots () {
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, lesMots("je tu elle je tu"));
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, lesMots(" je tu, elle . je tu ! "));
    }

    // ! Exercice 6
    void algorithm() {
        // Exemple de texte à analyser
        String texte = "Patience, patience,\n" + "Patience dans l'azur !\n" +
                    "Chaque atome de silence\n" + "Est la chance d'un fruit mur !";
        println(texte);
        println();

        // Extraction des mots du texte
        String[] mots = lesMots(texte);

        // Extraction des mots différents
        String[] motsDifferents = motsDifferents(mots);

        // Fréquences des mots
        int[] frequences = frequences(motsDifferents, mots);

        // Tri des mots par fréquence
        triSimultane(frequences, motsDifferents);

        // Affichage des mots avec leurs fréquences
        for (int i = 0; i < length(motsDifferents); i++) {
            println(motsDifferents[i] + " : " + frequences[i]);
        }
    }

    // ! Exercice 7
    // Teste la fonction lesMots qui sépare une chaîne de caractères en mots.
    void testLesMotsV2(){
        // Test avec des mots séparés par des espaces et des signes de ponctuation
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, lesMots(" jE tu,   Elle je tu  "));
    }

    // ! Exercice 8
    // Tri simultané pour trier deux tableaux en fonction de l'un des critères.
    void triSimultane(int[] critereTri, String[] tab) {
        for (int i = 0; i < length(critereTri); i++) {
            for (int j = i + 1; j < length(critereTri); j++) {
                if (critereTri[i] < critereTri[j]) {
                    // Échanger les critères de tri
                    int temp = critereTri[i];
                    critereTri[i] = critereTri[j];
                    critereTri[j] = temp;

                    // Échanger les mots correspondants
                    String tempMot = tab[i];
                    tab[i] = tab[j];
                    tab[j] = tempMot;
                }
            }
        }
    }

    void testTriSimultane(){
        int[] critere = new int[]{1,5,3,2,4};
        String[] tab = new String[]{"un", "cinq", "trois", "deux", "quatre"};
        testTriSimultane(critere, tab);
        assertArrayEquals(new int[]{5,4,3,2,1}, critere);
        assertArrayEquals(new String[]{"cinq", "quatre", "trois", "deux", "un"}, tab);
    }
}
