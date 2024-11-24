class Bissextilite extends Program {

    // Méthode pour vérifier si une année est bissextile, avec un seul return
    boolean estBissextile(int annee) {
        boolean Bissextile = false;
        // Une année est bissextile si elle est divisible par 4, mais pas par 100, ou divisible par 400
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            Bissextile = true;
        }
        return Bissextile;
    }

    // Méthode pour obtenir le nombre de jours dans un mois donné pour une année, avec un seul return
    int nombreJoursMois(int annee, int numeroMois) {
        int jours = 0;
        
        // Vérification que le mois est valide
        if (numeroMois < 1 || numeroMois > 12) {
            jours = 0;  // Mois invalide
        } else if (numeroMois == 2) {  // Février
            if (estBissextile(annee)) {
                jours = 29;  // Février a 29 jours si l'année est bissextile
            } else {
                jours = 28;  // Février a 28 jours sinon
            }
        } else if (numeroMois == 4 || numeroMois == 6 || numeroMois == 9 || numeroMois == 11) {  // Mois avec 30 jours
            jours = 30;
        } else {  // Tous les autres mois ont 31 jours
            jours = 31;
        }

        return jours;  // Retourne le nombre de jours
    }

    // Méthode principale exécutant l'algorithme, avec un seul return
    void algorithm() {
        int annee = readInt();  // Lecture de l'année saisie par l'utilisateur
        int numeroMois = readInt();  // Lecture du mois

        String message = "";  // Variable pour contenir le message à afficher
        
        // Vérification si l'année est bissextile
        if (estBissextile(annee)) {
            message = "L'année " + annee + " est bissextile.";
        } else {
            message = "L'année " + annee + " n'est pas bissextile.";
        }

        // Vérification du nombre de jours dans le mois spécifié
        int jours = nombreJoursMois(annee, numeroMois);
        if (jours == 0) {
            message += "\nMois invalide.";
        } else {
            message += "\nLe mois " + numeroMois + " de l'année " + annee + " a " + jours + " jours.";
        }

        println(message);  // Affiche le message final
    }
}
