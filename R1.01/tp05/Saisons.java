class Saisons extends Program {
    
    // Fonction pour déterminer la saison météorologique d'un mois donné (en fonction du mois)
    String saisonMeteorologique(int mois) {
        String saison;
        
        // Détermine la saison en fonction du mois
        if (mois >= 3 && mois < 6) {
            saison = "Printemps";  // Mois de mars à mai : Printemps
        } else if (mois >= 6 && mois < 9) {
            saison = "Été";  // Mois de juin à août : Été
        } else if (mois >= 9 && mois < 12) {
            saison = "Automne";  // Mois de septembre à novembre : Automne
        } else if (mois == 12 || (mois >= 1 && mois < 3)) {
            saison = "Hiver";  // Mois de décembre, janvier et février : Hiver
        } else {
            saison = "Erreur";  // Si le mois est hors du cadre (1-12), retourne une erreur
        }
        return saison;  // Retourne la saison déterminée
    }

    // Fonction pour déterminer le nombre de jours d'un mois donné
    int nombreJoursMois(int numeroMois) {
        int jour;
        
        // Si c'est février, par défaut 28 jours
        if (numeroMois == 2) {
            jour = 28;
        } 
        // Mois ayant 30 jours : avril, juin, septembre, novembre
        else if (numeroMois == 4 || numeroMois == 6 || numeroMois == 9 || numeroMois == 11) {
            jour = 30;
        } 
        // Si le mois est invalide (en dehors de 1 à 12), retourne 0
        else if (numeroMois < 1 || numeroMois > 12) {
            jour = 0;
        } 
        // Les autres mois ont 31 jours
        else {
            jour = 31;
        }
        return jour;  // Retourne le nombre de jours du mois
    }

    // Fonction pour déterminer la saison astronomique d'une date donnée (jour et mois)
    String saisonAstronomique(int jour, int mois) {
        String saison;
        
        // Pour les jours entre le 21 et 31 de certains mois, on utilise le mois suivant pour déterminer la saison
        if ((jour >= 21 && jour <= 31) && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) {
            saison = saisonMeteorologique(mois + 1);  // Utilise le mois suivant pour la saison
        } else {
            saison = saisonMeteorologique(mois);  // Utilise le mois actuel pour la saison
        }
        return saison;  // Retourne la saison astronomique déterminée
    }

    // Fonction principale qui exécute l'algorithme
    void algorithm() {
        // Boucle sur chaque mois de l'année (de 1 à 12)
        for (int m = 1; m < 13; m = m + 1) {
            // Boucle sur chaque jour du mois
            for (int j = 1; j <= nombreJoursMois(m); j = j + 1) {
                // Affiche la date et la saison correspondante (astronomique) pour chaque jour
                println(j + "/" + m + " : " + saisonAstronomique(j, m));
            }
        }
    }
}
