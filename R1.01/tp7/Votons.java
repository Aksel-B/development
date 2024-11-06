class Votons extends Program {
    
    // Fonction qui détermine si une proposition a été adoptée
    boolean estAdopte(boolean[] votes) {
        boolean adoptee = true;  // Initialisation à true, on suppose que la proposition est adoptée
        int pour = 0;  // Compteur pour les votes "pour"
        int contre = 0;  // Compteur pour les votes "contre"
        
        // Parcours de tous les votes
        for (int i = 0; i < length(votes); i++) {
            if (votes[i]) {  // Si le vote est "pour"
                pour++;
            } else {  // Si le vote est "contre"
                contre++;
            }
        }
        
        // Si les votes "contre" sont supérieurs ou égaux aux votes "pour", la proposition n'est pas adoptée
        if (pour <= contre) {
            adoptee = false;
        } 
        
        return adoptee;  // Retourne true si la proposition est adoptée, false sinon
    }

    // Fonction de test pour la fonction estAdopte
    void testEstAdopte() {
        // Test 1 : Si la proposition a plus de votes "contre" que "pour", elle ne doit pas être adoptée
        assertEquals(false, estAdopte(new boolean[]{true, false}));
        
        // Test 2 : Si la proposition a plus de votes "pour" que "contre", elle doit être adoptée
        assertEquals(true, estAdopte(new boolean[]{true, true, false}));

        // Test 3 : Tableau vide, la proposition ne peut pas être adoptée
        assertEquals(false, estAdopte(new boolean[]{}));

        // Test 4 : Tous les votes sont "pour", la proposition est adoptée
        assertEquals(true, estAdopte(new boolean[]{true, true, true}));

        // Test 5 : Tous les votes sont "contre", la proposition est rejetée
        assertEquals(false, estAdopte(new boolean[]{false, false, false}));
    }
}
