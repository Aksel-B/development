class FaireDate extends Program {

    // Fonction pour obtenir le premier jour de l'année en fonction de l'année
    int premierJourDeLAnnee(int annee) {
        int premierJour = 1;  // Le premier janvier 1900 était un lundi (Jour 1)

        // Calcul du premier jour de l'année pour l'année donnée
        for (int i = 1900; i < annee; i++) {
            // On vérifie si l'année est bissextile et on ajoute 366 jours, sinon 365 jours
            if (isBissextile(i)) {
                premierJour = (premierJour + 366) % 7;
            } else {
                premierJour = (premierJour + 365) % 7;
            }
        }

        return premierJour;
    }

    // Fonction pour vérifier si une année est bissextile
    boolean isBissextile(int annee){
        boolean Bissextile = false;
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            Bissextile = true;
        }
        return Bissextile;
    }

    // Afficher le calendrier d'une année donnée en demandant le premier jour de l'année
    void afficherCalendrier(int annee) {
        print("Année souhaitée : ");
        int anneeSaisie = readInt();  // Demander l'année à afficher
        
        // Demander le premier jour de l'année
        print("1er jour de l'année L(1), M(2), M(3), J(4), V(5), S(6) ou D(7) ? ");
        int premierJour = readInt();  // Demander à l'utilisateur quel jour commence l'année

        String jours = "LMMJVSD";  // Légende des jours de la semaine
        
        // Affichage du calendrier pour chaque mois
        for (int mois = 1; mois <= 12; mois++) {
            println("Mois " + mois);  // Afficher le numéro du mois
            int nbJours = 31;  // Par défaut, un mois a 31 jours

            // Ajuster le nombre de jours pour chaque mois
            if (mois == 2) {
                if (isBissextile(anneeSaisie)) {
                    nbJours = 29;  // Février bissextile
                } else {
                    nbJours = 28;  // Février non bissextile
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                nbJours = 30;  // Mois de 30 jours
            }

            int jourActuel = premierJour;  // Commencer à partir du premier jour de l'année
            
            // Affichage des jours de la semaine
            for (int i = 0; i < nbJours; i++) {
                print(charAt(jours, jourActuel - 1) + " " + (i + 1) + " ");  // Afficher le jour et la date
                jourActuel = (jourActuel % 7) + 1;  // Passer au jour suivant de la semaine
                if ((i + 1) % 7 == 0) {
                    println();  // Nouvelle ligne après chaque semaine
                }
            }
            println();  // Nouvelle ligne après chaque mois
        }
    }

    // Affichage du calendrier d'une année sans demander le premier jour
    void afficherCalendrierSansPremierJour(int annee) {
        int premierJour = premierJourDeLAnnee(annee);  // Calcul du premier jour de l'année
        afficherCalendrier(annee);  // Utilisation de la fonction précédente avec le premier jour calculé
    }

    // Fonction pour ajouter ou soustraire des jours à une date
    String calculerNouvelleDate(int jour, int mois, int annee, int nombreDeJours) {
        // Variables pour les jours par mois en fonction des mois standards
        int nbJoursDansMois = 31;
        
        // Calculer les jours pour chaque mois
        if (mois == 2) {
            if (isBissextile(annee)) {
                nbJoursDansMois = 29;  // Février bissextile
            } else {
                nbJoursDansMois = 28;  // Février non bissextile
            }
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            nbJoursDansMois = 30;  // Mois de 30 jours
        }

        // Calcul du total des jours à ajouter ou soustraire
        int totalJours = (jour + nombreDeJours - 1);
        
        // Calculer le mois et l'année de la nouvelle date
        while (totalJours <= 0) {
            mois--;
            if (mois == 0) {
                mois = 12;
                annee--;
            }
            // Calculer les jours du mois en cours
            if (mois == 2) {
                if (isBissextile(annee)) {
                    totalJours += 29;
                } else {
                    totalJours += 28;
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                totalJours += 30;
            } else {
                totalJours += 31;
            }
        }
        
        while (totalJours > nbJoursDansMois) {
            totalJours -= nbJoursDansMois;
            mois++;
            if (mois == 13) {
                mois = 1;
                annee++;
            }

            // Réajuster le nombre de jours en fonction du mois suivant
            if (mois == 2) {
                if (isBissextile(annee)) {
                    nbJoursDansMois = 29;
                } else {
                    nbJoursDansMois = 28;
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                nbJoursDansMois = 30;
            } else {
                nbJoursDansMois = 31;
            }
        }
        
        return "Date obtenue : " + totalJours + "/" + mois + "/" + annee;
    }

    // Fonction principale (algorithm)
    void algorithm() {
        print("1. Afficher le calendrier d'une année donnée (avec jour de début de l'année) : \n");
        print("2. Afficher le calendrier d'une année sans jour de début de l'année : \n");
        print("3. Calculer la date après un certain nombre de jours à partir d'une date donnée : \n");
        int choix = readInt();  // Demander l'option à l'utilisateur
        
        if (choix == 1) {
            afficherCalendrier(2022);  // Exemple pour l'année 2022
        } else if (choix == 2) {
            afficherCalendrierSansPremierJour(2022);  // Exemple pour l'année 2022 sans jour de début
        } else if (choix == 3) {
            print("Jour : ");
            int jour = readInt();
            print("Mois : ");
            int mois = readInt();
            print("Année : ");
            int annee = readInt();
            print("Nombre de jours à ajouter ou soustraire (positif ou négatif) : ");
            int nbJours = readInt();
            println(calculerNouvelleDate(jour, mois, annee, nbJours));  // Afficher la nouvelle date
        } else {
            println("Option invalide.");
        }
    }
}
