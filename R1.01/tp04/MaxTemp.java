class MaxTemp extends Program {

    void algorithm() {

        int temp = 0;  // Variable pour stocker la température actuelle
        int i = 0;     // Compteur pour le nombre de températures lues
        int moyenne = 0;  // Variable pour calculer la somme des températures
        int maximum = -273;  // Initialisation de la température maximale (température absolue minimale)
        int minimum = 99999999;  // Initialisation de la température minimale à une valeur très haute

        // Boucle pour lire les températures jusqu'à ce que l'utilisateur entre -273
        do {
            temp = readInt();  // Lecture de la température

            if (temp != -273) {  // Si la température lue n'est pas -273, on continue les calculs
                i++;  // Incrémente le compteur des températures lues
                if (maximum < temp) {  // Si la température actuelle est plus élevée que la précédente valeur maximale
                    maximum = temp;  // Met à jour la température maximale
                } else if (minimum > temp) {  // Si la température actuelle est plus basse que la précédente valeur minimale
                    minimum = temp;  // Met à jour la température minimale
                }
                moyenne = moyenne + temp;  // Ajoute la température à la somme pour calculer la moyenne
            }
        } while (temp != -273);  // La boucle continue jusqu'à ce que l'utilisateur entre -273

        moyenne = moyenne / i;  // Calcul de la moyenne des températures en divisant la somme par le nombre de températures lues
        println("Le maximum est " + maximum + ".");  // Affiche la température maximale
        println("La moyenne est " + moyenne + ".");  // Affiche la moyenne des températures
        println("Le minimum est " + minimum + ".");  // Affiche la température minimale
    }
}
