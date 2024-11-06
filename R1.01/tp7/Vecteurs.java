class Vecteurs extends Program {

    // Fonction qui lit un vecteur de 3 éléments depuis l'utilisateur
    int[] readVector() {
        int[] vecteur = new int[3];  // Crée un vecteur de taille 3
        // Demande à l'utilisateur d'entrer 3 entiers
        for (int i = 0; i < 3; i++) {
            vecteur[i] = readInt();  // Lire chaque entier et l'ajouter dans le vecteur
        }
        return vecteur;  // Retourne le vecteur
    }
    /** La fonction readVector doit saisir les trois éléments du vecteur auprès de l'utilisateur. */
    void testReadVector() {
        // Test : Supposons que l'utilisateur saisit 1, 2, 3 successivement
        assertArrayEquals(new int[]{1, 2, 3}, readVector());  // Vérifie que le vecteur retourné est correct
    }

    // Fonction qui compare l'égalité de deux vecteurs de taille 3
    boolean equals(int[] vecteur, int[] vecteur2) {
        boolean valeur = true;  // On initialise la valeur à true
        for (int i = 0; i < 3; i++) {  // On compare les éléments un à un
            if (vecteur[i] != vecteur2[i]) {  // Si une différence est trouvée
                valeur = false;  // Les vecteurs ne sont pas égaux
                break;  // On arrête la boucle
            }
        }
        return valeur;  // Retourne true si les vecteurs sont égaux, false sinon
    }
    /** La fonction equals retourne vrai si les deux vecteurs donnés en paramètre contiennent les mêmes valeurs, et retourne faux sinon. */
    void testEquals() {
        // Test d'égalité entre deux vecteurs identiques
        assertTrue(equals(new int[]{1, 1, 1}, new int[]{1, 1, 1}));
        // Test d'inégalité entre deux vecteurs différents
        assertFalse(equals(new int[]{1, 1, 2}, new int[]{1, 1, 1}));
    }

    // Fonction qui retourne la représentation sous forme de chaîne de caractères d'un vecteur
    String toString(int[] vecteur) {
        String result = "[";  // Commence la chaîne avec un crochet ouvrant
        for (int i = 0; i < 3; i++) {
            result += vecteur[i];  // Ajoute chaque élément du vecteur
            if (i < 2) {
                result += ", ";  // Ajoute une virgule après chaque élément sauf le dernier
            }
        }
        result += "]";  // Termine la chaîne avec un crochet fermant
        return result;  // Retourne la chaîne
    }

    /** La fonction toString retourne la représentation d'un vecteur sous forme de chaine de caractères. */
    void testToString() {
        int[] v = new int[]{1, 2, 3};
        // Vérifie que la méthode toString génère correctement la chaîne attendue
        assertEquals("[1, 2, 3]", toString(v));
    }

    // Fonction pour ajouter deux vecteurs de taille 3
    int[] add(int[] v1, int[] v2) {
        int[] result = new int[3];  // Crée un tableau pour stocker le résultat
        for (int i = 0; i < 3; i++) {
            result[i] = v1[i] + v2[i];  // Additionne les éléments correspondants
        }
        return result;  // Retourne le vecteur résultant
    }

    /** La fonction add calcule la somme de deux vecteurs. */
    void testAdd() {
        int[] v1 = new int[]{1, 2, 3};
        int[] v2 = new int[]{-1, -2, -3};
        // Vérifie que l'addition des deux vecteurs retourne [0, 0, 0]
        assertArrayEquals(new int[]{0, 0, 0}, add(v1, v2));
    }

    // Fonction qui calcule le produit scalaire de deux vecteurs de taille 3
    int scalarProduct(int[] v1, int[] v2) {
        int result = 0;  // Initialisation du produit scalaire à 0
        for (int i = 0; i < 3; i++) {
            result += v1[i] * v2[i];  // Produit scalaire : additionne les produits des éléments correspondants
        }
        return result;  // Retourne le résultat du produit scalaire
    }

    /** La fonction scalarProduct calcule le produit scalaire de deux vecteurs. */
    void testScalarProduct() {
        // Vérifie que le produit scalaire de [1,1,1] et [1,2,3] est 6
        assertEquals(6, scalarProduct(new int[]{1, 1, 1}, new int[]{1, 2, 3}));
        // Vérifie que le produit scalaire de [1,2,3] et [-1,-2,-3] est -14
        assertEquals(-14, scalarProduct(new int[]{1, 2, 3}, new int[]{-1, -2, -3}));
    }

}
