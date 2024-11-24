class MasqueDeChaine extends Program {
    
    // Méthode masque qui masque les caractères autres que 'c' par des points '.'
    String masque(String txt, char c){
        String chaine = "";
        int i = 0;
        int longueur = length(txt);  // On détermine une fois la longueur de la chaîne
        
        // Parcours de chaque caractère de la chaîne 'txt'
        while (i < longueur) {
            if (charAt(txt, i) == c) {
                chaine = chaine + c;  // On garde le caractère 'c'
            } else {
                chaine = chaine + ".";  // On remplace les autres caractères par '.'
            }
            i++;
        }
        return chaine;  // Retour unique à la fin
    }

    // Méthode de test de la fonction masque
    void testMasque(){
        assertEquals("a...a...a....", masque("au bal masqué",'a'));  // Test avec 'a'
        assertEquals("................", masque("Tonari no Totoro", 'u'));  // Test avec 'u'
        assertEquals(".o......o..o.o.o", masque("Tonari no Totoro", 'o'));  // Test avec 'o'
        assertEquals("", masque("", 'z'));  // Test avec une chaîne vide
    }
}
