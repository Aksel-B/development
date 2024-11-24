class ParcoursTableau extends Program {
    
    int[] rechercherPremiereOccurrence(char[][] tab, char c) {
        int nbLignes = length(tab);
        int nbColonnes = length(tab[0]);
        int totalCells = nbLignes * nbColonnes;
        int[] resultat = new int[]{-1, -1}; // Valeur par défaut si non trouvé
        
        // On parcourt toutes les cellules avec un seul indice k
        for (int k = 0; k < totalCells && resultat[0] == -1; k++) {
            // Conversion de l'indice k en coordonnées (i,j)
            int i = k / nbColonnes;  // Division entière pour obtenir la ligne
            int j = k % nbColonnes;  // Modulo pour obtenir la colonne
            
            if (tab[i][j] == c) {
                resultat[0] = i;
                resultat[1] = j;
            }
        }
        
        return resultat;
    }
    
    // Test fourni
    void testRechercherPremiereOccurrence() {
        char[][] tab = new char[][]{
            {'a','b','c'},
            {'d','a','b'},
            {'a','e','d'}
        };
        assertArrayEquals(new int[]{0,1}, rechercherPremiereOccurrence(tab, 'b'));
        assertArrayEquals(new int[]{1,0}, rechercherPremiereOccurrence(tab, 'd'));
        assertArrayEquals(new int[]{2,1}, rechercherPremiereOccurrence(tab, 'e'));
        assertArrayEquals(new int[]{-1,-1}, rechercherPremiereOccurrence(tab, 'x'));
    }
}
