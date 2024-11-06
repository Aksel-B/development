class Diviseurs extends Program {

    void algorithm() {

        int n = readInt();  // Lecture d'un entier n saisi par l'utilisateur
        print("Diviseurs : ");  // Affiche "Diviseurs :" pour introduire la liste des diviseurs
        int cpt = 0;  // Initialisation du compteur de diviseurs
        int somme = 0;  // Initialisation de la somme des diviseurs

        // Boucle pour trouver les diviseurs de n
        for (int i = 1; n >= i; i++) {  // Boucle de 1 jusqu'à n
            if (n % i == 0) {  // Vérifie si i est un diviseur de n
                cpt++;  // Incrémente le compteur de diviseurs
                somme = somme + i;  // Ajoute i à la somme des diviseurs
                print(i + " ");  // Affiche le diviseur i
            }
        }

        // Vérification si n est un nombre parfait
        if ((2 * n) == somme) {  // Un nombre est parfait si la somme de ses diviseurs est égale à 2 * n
            println("");  // Nouvelle ligne après la liste des diviseurs
            println("Nombre Parfait !");  // Indique que n est un nombre parfait
        }
    }
}
