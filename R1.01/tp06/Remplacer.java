class Remplacer extends Program {
    
    // Méthode pour remplacer une sous-chaîne par une autre dans une chaîne
    String copieEnRemplacant(String phrase, String avant, String apres){
        String resultat = "";
        int i = 0;
        
        // Si la sous-chaîne 'avant' est vide, on retourne la chaîne initiale
        if (equals(avant, "")) {
            resultat = phrase;
        }
        
        // Boucle pour parcourir la chaîne 'phrase'
        while (i < length(phrase)) {
            // Si on trouve la sous-chaîne 'avant'
            if (equals(avant, substring(phrase, i, i + length(avant)))) {
                resultat = resultat + apres;  // On ajoute 'apres' à la place de 'avant'
                i = i + length(avant);  // On saute la longueur de 'avant'
            } else {
                resultat = resultat + charAt(phrase, i);  // Sinon, on ajoute le caractère courant
                i++;  // On passe au caractère suivant
            }
        }
        
        return resultat;  // Retour de la chaîne modifiée après remplacement
    }

    // Méthode de test pour vérifier la fonction de remplacement
    void testCopieEnRemplacant () {
        assertEquals("15x35" , copieEnRemplacant("15*35", "*", "x"));  // Remplacer '*' par 'x'
        assertEquals("15 + 35", copieEnRemplacant("15 plus 35", "plus", "+"));  // Remplacer 'plus' par '+'
        assertEquals("abcd", copieEnRemplacant("abcd", "cb" , "xy"));  // Aucun remplacement
        assertEquals("abcd", copieEnRemplacant("abcd", "", "x"));  // Si 'avant' est vide, retour de la chaîne originale
        assertEquals("abcd", copieEnRemplacant("-ab-cd-", "-", ""));  // Remplacer '-' par une chaîne vide
        assertEquals("xx", copieEnRemplacant("aaaa", "aa" , "x"));  // Remplacer 'aa' par 'x'
        assertEquals("xxa", copieEnRemplacant("aaaaa", "aa" , "x"));  // Remplacer 'aa' par 'x'
        assertEquals("9 plus 3 plus 3", copieEnRemplacant("9 moins 3 moins 3", "moins", "plus"));  // Remplacer 'moins' par 'plus'
    }
}
