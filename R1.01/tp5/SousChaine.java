class SousChaine extends Program {
    
    // Fonction principale qui gère la lecture de la chaîne et du motif à rechercher
    void algorithm () {
        // Demande à l'utilisateur de saisir une chaîne
        print("Chaine : ");
        String chaine = readString();

        // Demande à l'utilisateur de saisir le motif à rechercher
        print("Motif : ");
        String motif = readString();

        // Appel de la méthode 'motif' pour vérifier si le motif est présent dans la chaîne
        if (motif(chaine, motif)) {
            println("Trouvé");  // Si trouvé, affiche "Trouvé"
        } else {
            println("Non trouvé");  // Sinon, affiche "Non trouvé"
        }
    }

    // Fonction qui vérifie si le motif est présent dans le texte
    boolean motif(String txt, String motif) {
        boolean T = false;  // Par défaut, le motif n'est pas trouvé
        int i = 0;  // Initialisation de l'index pour parcourir la chaîne
        int lengthM = length(motif);  // Récupère la longueur du motif
        int lengthT = length(txt);  // Récupère la longueur du texte

        // La boucle continue jusqu'à ce que l'index 'i' atteigne la limite
        while (i <= lengthT - lengthM) {
            // Récupère une sous-chaîne de texte de la longueur du motif, à partir de l'index i
            String txt2 = substring(txt, i, i + lengthM);

            // Si la sous-chaîne extraite est égale au motif, on marque le motif comme trouvé
            if (equals(txt2, motif)) {
                T = true;  // Le motif est trouvé
            }
            i++;  // Incrémente l'index pour vérifier la prochaine sous-chaîne
        }
        return T;  // Retourne 'true' si le motif est trouvé, sinon 'false'
    }
}
