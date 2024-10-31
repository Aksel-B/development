// Déclaration de la classe Chrono qui hérite de Program
class Chrono extends Program {

    // Méthode principale algorithm() pour chronométrer le temps entre deux actions
    void algorithm() {
        // Capture le temps au début
        double pos1 = getTime();

        // Instructions pour l'utilisateur
        println("Appuyez sur une touche pour arrêter le chronomètre...");

        // Lecture d'un caractère de l'utilisateur (peut-être pour signaler un événement)
        char car = readChar();

        // Capture le temps à la fin
        double pos2 = getTime();

        // Calcul du temps écoulé entre les deux mesures
        double temps = pos2 - pos1;

        // Conversion du temps en secondes (si getTime() retourne en millisecondes)
        double tempsEnSecondes = temps / 1000; // à adapter selon la précision de getTime()

        // Affichage du temps écoulé
        println("Temps écoulé : " + tempsEnSecondes + " secondes");
    }
}
