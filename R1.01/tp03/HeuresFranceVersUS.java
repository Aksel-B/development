class HeuresFranceVersUS extends Program {
    void algorithm () {
        print("Heure : "); // Demander à l'utilisateur d'entrer l'heure
        int heure = readInt(); // Lire l'heure saisie par l'utilisateur
        print("Minutes : "); // Demander à l'utilisateur d'entrer les minutes
        int minutes = readInt(); // Lire les minutes saisies par l'utilisateur
        String indice = "AM"; // Initialiser l'indice à "AM"

        // Vérifier si l'heure est supérieure à 12 pour la conversion au format 12 heures
        if (heure > 12){
            heure = heure - 12; // Convertir l'heure en format 12 heures
            indice = "PM"; // Changer l'indice à "PM"
        }
        // Afficher l'heure au format 12 heures avec les minutes et l'indice
        println(heure + ":" + minutes + indice);
    }
}
