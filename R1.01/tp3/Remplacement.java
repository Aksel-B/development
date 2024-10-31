class Remplacement extends Program {
    void algorithm() {
        String txt;      // Variable pour stocker le texte saisi par l'utilisateur
        char ancien;     // Variable pour stocker le caractère à remplacer
        char nouveau;    // Variable pour stocker le caractère de remplacement

        // Demande à l'utilisateur de saisir un texte
        print("Veuillez saisir votre texte : ");
        txt = readString();

        // Demande à l'utilisateur quel caractère il souhaite remplacer
        print("Caractère à remplacer : ");
        ancien = readChar();

        // Demande à l'utilisateur quel caractère il souhaite utiliser en remplacement
        print("Caractère de remplacement : ");
        nouveau = readChar();

        String nouveauTxT = ""; // Variable pour stocker le texte après remplacement

        // Parcourt chaque caractère du texte saisi
        for (int i = 0; length(txt) > i; i++) {
            // Vérifie si le caractère actuel est celui que l'on veut remplacer
            if (charAt(txt, i) == ancien) {
                // Si c'est le cas, on ajoute le nouveau caractère à nouveauTxT
                nouveauTxT = nouveauTxT + nouveau;
            } else {
                // Sinon, on ajoute le caractère actuel à nouveauTxT
                nouveauTxT = nouveauTxT + charAt(txt, i);
            }
        }
        
        // Affiche le texte après remplacement
        println(nouveauTxT);
    }
}
