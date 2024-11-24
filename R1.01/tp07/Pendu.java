class Pendu extends Program {
    // Méthode toString pour afficher le tableau sous forme de chaîne avec des espaces entre les caractères
    String toString(String[] tab) {
        String s = "";
        // Parcours du tableau pour ajouter chaque élément suivi d'un espace
        for (int i = 0; i < length(tab); i++) {
            s = s + tab[i] + " ";
        }
        return s;  // Retourne la chaîne formatée
    }

    // Méthode principale du jeu
    void algorithm() {
        // Déclaration du nombre de tentatives restantes et de la variable pour vérifier si le joueur a gagné
        int tentatives = 5;
        boolean gagner = false;
        // Mot à deviner
        String chaine = "unix";
        // Initialisation du tableau tab avec des "*" pour chaque caractère du mot à deviner
        String[] tab = new String[length(chaine)];
        char c;  // Variable pour stocker le caractère entré par l'utilisateur

        // Initialisation de chaque caractère du tableau tab à "*"
        for (int i = 0; i < length(chaine); i++) {
            tab[i] = "*";
        }

        boolean trouve = false;  // Indicateur pour savoir si le caractère entré a été trouvé
        int cpt = 0;  // Compteur de lettres trouvées

        // Boucle principale du jeu
        do {
            // Affiche le nombre de tentatives restantes et l'état actuel du mot (avec "*" pour les lettres non trouvées)
            print("Il vous reste " + tentatives + " tentatives: " + toString(tab));
            // Demande à l'utilisateur de saisir un caractère
            print("Entrez un caractère : ");
            c = readChar();  // Lire un caractère entré par l'utilisateur

            // Vérifie si le caractère entré correspond à une lettre du mot à deviner
            for (int i = 0; i < length(chaine); i++) {
                if (c == charAt(chaine, i)) {  // Si le caractère correspond
                    tab[i] = "" + c;  // Remplace "*" par la lettre trouvée dans le tableau
                    trouve = true;  // Indique que le caractère a été trouvé
                    cpt++;  // Incrémente le compteur de lettres trouvées
                }
            }

            // Si le caractère n'a pas été trouvé, on réduit le nombre de tentatives
            if (!trouve) {
                tentatives--;
            }

            // Si toutes les lettres ont été trouvées (cpt == longueur du mot), le joueur a gagné
            if (length(chaine) == cpt) {
                gagner = true;
            }

        // La boucle continue tant qu'il reste des tentatives et que le joueur n'a pas gagné
        } while (tentatives > 0 && !gagner);

        // Affiche le résultat final : victoire ou défaite
        if (gagner) {
            println("Vous avez gagné ! Il fallait trouver : " + chaine); 
        } else {
            println("Vous avez perdu ! Il fallait trouver : " + chaine);
        }
    }
}
