class HeuresUSVersFrance extends Program {
    void algorithm() {
        // Demande à l'utilisateur d'entrer l'heure, les minutes et l'indicateur AM/PM
        print("Heure : ");
        int heure = readInt(); // Lire l'heure en format 12 heures
        print("Minutes : ");
        int minutes = readInt(); // Lire les minutes
        print("AM ou PM : ");
        String indice = readString(); // Lire l'indicateur AM/PM

        // Validation de l'heure et des minutes
        if (heure < 1 || heure > 12) {
            println("Erreur : L'heure doit être entre 1 et 12.");
            return; // Sortie de la fonction en cas d'erreur
        }
        
        if (minutes < 0 || minutes >= 60) {
            println("Erreur : Les minutes doivent être entre 0 et 59.");
            return; // Sortie de la fonction en cas d'erreur
        }

        // Conversion de l'heure en format 24 heures
        if (equals(indice, "PM")) {
            // Ajoute 12 à l'heure pour convertir au format 24 heures, sauf si c'est midi
            if (heure < 12) {
                heure += 12; // Convertit PM en format 24 heures
            }
        } else if (equals(indice, "AM")) {
            // Si c'est AM et que l'heure est 12, cela correspond à minuit en format 24 heures
            if (heure == 12) {
                heure = 0; // Minuit en format 24 heures
            }
        } else {
            // Gestion d'erreur pour les entrées AM/PM incorrectes
            println("Erreur : Indicateur doit être 'AM' ou 'PM'.");
            return; // Sortie de la fonction en cas d'erreur
        }

        // Affichage du résultat au format 24 heures
        println("Heure en format 24 heures : " + heure + ":" + minutes);
    }
}
