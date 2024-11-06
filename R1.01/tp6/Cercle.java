class Cercle extends Program{
    double pi = 3.14159;
    double calcul = 4.0/3.0;
    int cptM = 0;

    // Méthode qui calcule la circonférence du cercle
    double circonference(double rayon) {
        cptM = cptM + 1;  // Incrémentation du compteur de multiplications
        double resultat = pi * diametre(rayon);  // Calcul de la circonférence
        return resultat;  // Retourne le résultat calculé
    }

    // Méthode qui calcule le diamètre du cercle
    double diametre(double rayon) {
        cptM = cptM + 1;  // Incrémentation du compteur de multiplications
        double resultat = 2 * rayon;  // Calcul du diamètre
        return resultat;  // Retourne le résultat calculé
    }

    // Méthode qui calcule l'aire du cercle
    double aire(double rayon) {
        cptM = cptM + 2;  // Incrémentation du compteur de multiplications
        double resultat = pi * rayon * rayon;  // Calcul de l'aire
        return resultat;  // Retourne le résultat calculé
    }

    // Méthode qui calcule le volume d'une sphère
    double volume(double rayon) {
        cptM = cptM + 4;  // Incrémentation du compteur de multiplications
        double resultat = calcul * pi * rayon * rayon * rayon;  // Calcul du volume
        return resultat;  // Retourne le résultat calculé
    }

    // Méthode principale qui exécute les calculs pour différents rayons
    void algorithm() {
        for (int rayon = 1; rayon < 16 ; rayon++) {
            println("Circonference : " + circonference(rayon));  // Affiche la circonférence
            println("Aire : " + aire(rayon));  // Affiche l'aire
            println("Volume : " + volume(rayon));  // Affiche le volume
            println("Nbr de multiplication : " + cptM);  // Affiche le nombre total de multiplications
        }
    }
}
