// Déclaration de la classe HeureAleatoire qui hérite de Program
class HeureAleatoire extends Program {
    
    // Constantes pour les limites d'heure et de minute
    final int MAX_HEURE = 24;
    final int MAX_MINUTE = 60;

    // Méthode principale algorithm() pour générer une heure aléatoire
    void algorithm() {
        // Génération d'une heure aléatoire entre 0 et 23
        int heure = (int)(random() * MAX_HEURE);
        
        // Génération d'une minute aléatoire entre 0 et 59
        int minute = (int)(random() * MAX_MINUTE);
        
        // Formatage des minutes avec un zéro devant si nécessaire
        String minuteStr = (minute < 10) ? "0" + minute : "" + minute;

        // Affichage de l'heure et des minutes
        println("Heure : " + heure + "h" + minuteStr);
    }
}
