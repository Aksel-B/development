class NbrMaj extends Program {
    void algorithm() {
        // Lecture d'une chaîne de caractères saisie par l'utilisateur
        String txt = readString();
        int n = 0; // Compteur pour le nombre de lettres majuscules

        // Parcourt chaque caractère de la chaîne
        for (int i = 0; length(txt) > i; i++) {
            // Vérifie si le caractère actuel est une lettre majuscule
            if (charAt(txt, i) >= 'A' && charAt(txt, i) <= 'Z') {
                n++; // Incrémente le compteur pour chaque majuscule trouvée
            }
        }

        // Affiche le nombre total de lettres majuscules dans la chaîne
        println(n);
    }
}
