class Echo extends Program {
    void algorithm () {
        // Demande à l'utilisateur de saisir une chaîne à répéter
        print("Chaîne à répéter : ");
        String phrase = readString();  // Lecture de la chaîne saisie

        // Demande à l'utilisateur de saisir le nombre de répétitions
        print("Nombre de fois : ");
        int n = readInt();  // Lecture du nombre entier saisi

        // Vérification que le nombre de répétitions est positif
        if (n < 0) {
            println("Le nombre de répétitions ne peut pas être négatif.");  // Message d'erreur si n est négatif
        } else {
            // Boucle pour répéter la phrase n fois
            for (int i = 0; i < n; i++) {  // Condition de boucle pour répéter tant que i est inférieur à n
                println(phrase);  // Affiche la phrase à chaque itération
            }
        }
    }
}
