class MomentJournee extends Program {
    void algorithm() {
        // Demande à l'utilisateur d'entrer une heure
        print("Heure : ");
        int heure = readInt(); // Lit l'heure saisie par l'utilisateur

        // Vérifie si l'heure est valide (entre 0 et 23)
        if (heure < 24) {
            // Détermine le moment de la journée en fonction de l'heure
            if (heure >= 0 && heure < 6 || heure >= 22 && heure < 24) {
                println("nuit"); // Heure de la nuit
            } else if (heure >= 6 && heure < 12) {
                println("matinée"); // Heure du matin
            } else if (heure >= 12 && heure < 18) {
                println("après-midi"); // Heure de l'après-midi
            } else if (heure >= 18 && heure < 22) {
                println("soirée"); // Heure de la soirée
            }
        }
        // Si l'heure est inférieure à 0 ou supérieure ou égale à 24, afficher une erreur
        if (heure >= 24 || heure < 0) {
            println("erreur"); // Affiche "erreur" pour une heure invalide
        }
    }
}
