class AffichageTableau extends Program {

    // Convertit un tableau d'entiers en une chaîne de caractères avec des espaces entre les éléments
    String toString(int[] tab) {
        String s = "";  // Chaîne vide pour accumuler les valeurs
        for (int i = 0; i < length(tab); i++) {
            s = s + tab[i] + " ";  // Ajoute chaque élément du tableau suivi d'un espace
        }
        return s;  // Retourne la chaîne construite
    }

    // Convertit un tableau de chaînes de caractères en une chaîne de caractères avec des espaces entre les éléments
    String toString(String[] tab) {
        String s = "";  // Chaîne vide pour accumuler les valeurs
        for (int i = 0; i < length(tab); i++) {
            s = s + tab[i] + " ";  // Ajoute chaque élément du tableau suivi d'un espace
        }
        return s;  // Retourne la chaîne construite
    }

    // Teste la méthode toString pour les tableaux d'entiers
    void _testToString_tabInt() {
        assertEquals("1 2 3 ", toString(new int[]{1,2,3}));  // Vérifie le cas d'un tableau d'entiers
        assertEquals("", toString(new int[0]));  // Vérifie le cas d'un tableau vide d'entiers
    }

    // Teste la méthode toString pour les tableaux de chaînes de caractères
    void _testToString_tabString() {
        assertEquals("un deux trois ", toString(new String[]{"un", "deux", "trois"}));  // Vérifie le cas d'un tableau de String
        assertEquals("", toString(new String[0]));  // Vérifie le cas d'un tableau vide de String
    }

    // Affiche les résultats des méthodes toString pour les tableaux d'entiers et de String
    void algorithm() {
        int[] tabInt = new int[]{20, 30, 50};  // Exemple de tableau d'entiers
        String[] tabStr = new String[]{"Alan", "Turing"};  // Exemple de tableau de chaînes
        println(toString(tabInt));  // Affiche le tableau d'entiers sous forme de chaîne
        println(toString(tabStr));  // Affiche le tableau de chaînes sous forme de chaîne
    }
}
