class DevinerNombre extends Program {

    void algorithm() { 

        int minimum = 0;   // Limite inférieure de la plage de recherche
        int maximum = 100; // Limite supérieure de la plage de recherche
        int test;          // Variable pour stocker l'estimation de l'ordinateur
        char ans = '';     // Variable pour stocker la réponse de l'utilisateur ('+', '-', ou '=')

        // Boucle de devinette qui continue jusqu'à ce que le nombre soit trouvé
        do {
            test = (minimum + maximum) / 2;  // Calcule l'estimation au milieu de la plage actuelle
            println("Est-ce que le nombre est " + test + " ?");  // Affiche la supposition de l'ordinateur
            ans = readChar();  // Lit la réponse de l'utilisateur

            if (ans == '+') {       // Si l'utilisateur indique que le nombre est plus petit
                maximum = test;     // Réduit la limite supérieure à l'estimation actuelle
            } else if (ans == '-') {// Si l'utilisateur indique que le nombre est plus grand
                minimum = test;     // Augmente la limite inférieure à l'estimation actuelle
            }
        } while (ans != '=');  // Continue tant que le nombre n'est pas trouvé (réponse égale à '=')
    }
}
