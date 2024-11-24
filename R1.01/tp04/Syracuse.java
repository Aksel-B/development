class Syracuse extends Program {
    
    void algorithm() {
        int n = readInt();  // Lecture du nombre initial
        
        // Vérification que n est un nombre entier positif
        if (n <= 0) {  
            println("Veuillez entrer un nombre entier positif.");
        } else {
            int cpt = 0;  // Compteur pour la durée de vol
            int cptHIGH = 0;  // Compteur pour la durée de vol en altitude
            print("Trajectoire : ");
            int base = n;  // Sauvegarde de la valeur initiale
            int high = 0;  // Altitude maximale

            // Algorithme de Syracuse
            do {
                if (n > high) {  // Si n dépasse l'altitude maximale, on la met à jour
                    high = n;
                }
                print(n + ", ");  // Affichage de la valeur actuelle

                // Application de la règle de Syracuse : n est divisé par 2 si pair, multiplié par 3 et augmenté de 1 si impair
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
                cpt++;  // Incrément du compteur de durée
                if (n > base) {  // Si n est plus grand que la valeur initiale, on incrémente cptHIGH
                    cptHIGH++;
                }
            } while (n != 1);  // La boucle continue jusqu'à ce que n atteigne 1

            // Affichage des résultats
            println("1,");
            println("Altitude max: " + high);
            println("Durée de vol: " + cpt);
            println("Durée de vol en altitude: " + (cptHIGH - 1));
            println("Facteur d'expansion: " + (high / base));
        }
    }
}
