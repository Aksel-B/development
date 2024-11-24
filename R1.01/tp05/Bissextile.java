class Bissextile extends Program { 

    // Première méthode pour vérifier si une année est bissextile
    boolean estBissextile1(int annee) {
        boolean Bissextile = false;  // Initialisation de la variable à false
        if (annee % 4 == 0) {  // Si l'année est divisible par 4
            Bissextile = true;
        }
        if (annee % 100 == 0) {  // Si l'année est divisible par 100
            Bissextile = false;  // L'année n'est pas bissextile
        }
        if (annee % 400 == 0) {  // Si l'année est divisible par 400
            Bissextile = true;  // L'année est bissextile
        }
        return Bissextile;  // Retourne true si l'année est bissextile, sinon false
    }

    // Deuxième méthode utilisant une approche combinée pour vérifier si une année est bissextile
    boolean estBissextile2(int annee){
        boolean Bissextile = false;
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            Bissextile = true;
        }
        return Bissextile;
    }

    // Troisième méthode avec une structure conditionnelle différente
    boolean estBissextile3(int annee) {
        boolean Bissextile = false;
        if (annee % 400 == 0) {  // Si l'année est divisible par 400
            Bissextile = true;
        } else if (annee % 100 == 0) {  // Si l'année est divisible par 100
            Bissextile = false;
        } else if (annee % 4 == 0) {  // Si l'année est divisible par 4
            Bissextile = true;
        }
        return Bissextile;
    }

    // Quatrième méthode avec une approche similaire à la première
    boolean estBissextile4(int annee) {
        boolean Bissextile = false;
        if (annee % 4 == 0) {  // Si l'année est divisible par 4
            Bissextile = true;
        } else if (annee % 100 == 0) {  // Si l'année est divisible par 100
            Bissextile = false;  // L'année n'est pas bissextile
        } else if (annee % 400 == 0) {  // Si l'année est divisible par 400
            Bissextile = true;  // L'année est bissextile
        }
        return Bissextile;
    }

    // Algorithme principal
    void algorithm() {
        int flag = 33;  // Variable pour compter le nombre d'années bissextiles à afficher
        for (int i = 2022; flag >= 0; i--) {  // Boucle qui commence à partir de 2022 et descend
            if (estBissextile1(i)) {  // Vérifie si l'année est bissextile avec la première méthode
                println(i);  // Affiche l'année bissextile
                flag--;  // Décrémente le compteur d'années bissextiles trouvées
            }
        }
    }
}
