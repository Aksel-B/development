class FinalCountdown extends Program {

    void algorithm() {

        double pos1, pos2, temps;  // Variables pour stocker le temps initial, le temps actuel, et le temps écoulé
        int i = 0;  // Initialisation de la variable compteur `i` à 0

        pos1 = getTime();  // Stocke le temps initial en secondes depuis le démarrage du programme

        // Boucle qui s'exécute tant que le temps écoulé est inférieur à 3 secondes
        do {
            pos2 = getTime();  // Récupère le temps actuel
            i = i + 3;  // Incrémente `i` de 3 à chaque itération
            temps = pos2 - pos1;  // Calcule le temps écoulé depuis le début
            println(i);  // Affiche la valeur actuelle de `i`
        } while (temps < 3);  // Continue la boucle tant que le temps écoulé est inférieur à 3 secondes
    }
}
