class PGCD extends Program { 

    void algorithm() {

        int a = abs(readInt());  // Lecture du premier entier et prise de sa valeur absolue
        int b = abs(readInt());  // Lecture du deuxième entier et prise de sa valeur absolue
        int r;  // Variable pour stocker le reste de la division

        // Algorithme d'Euclide pour calculer le PGCD
        do {
            r = a % b;  // Calcul du reste de la division de a par b
            a = b;      // Met à jour a avec la valeur de b
            b = r;      // Met à jour b avec le reste de la division
        } while (r != 0);  // La boucle continue jusqu'à ce que le reste soit 0

        println("Le pgcd est " + a);  // Affiche le PGCD, qui est la dernière valeur de a
    }
}
