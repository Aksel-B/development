class NbrMot extends Program {
    void algorithm() {
        // Lecture d'une chaîne de caractères saisie par l'utilisateur
        String txt = readString();
        int n = 0; // Compteur pour le nombre de mots

        // Vérifie si la chaîne n'est pas vide
        if (length(txt) > 0) {
            n++; // Si non vide, on compte le premier mot
        }

        // Parcourt chaque caractère de la chaîne
        for (int i = 0; length(txt) > i; i++) {
            // Vérifie si le caractère actuel est un espace
            if (charAt(txt, i) == ' ') {
                n++; // Incrémente le compteur à chaque espace trouvé
            }
        }
        
        // Affiche le nombre de mots comptés
        println(n);
    }
}
