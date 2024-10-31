// Déclaration de la classe Additionnatrice qui hérite de Program
class Additionnatrice extends Program {

    // Méthode principale algorithm() pour effectuer une addition de deux nombres
    void algorithm() {
        // Demande à l'utilisateur d'entrer le premier nombre
        print("1er nombre à additionner (entier) : ");
        int premier = readInt(); // Lecture du premier nombre

        // Demande à l'utilisateur d'entrer le deuxième nombre
        print("2ème nombre à additionner (entier) : ");
        int deuxieme = readInt(); // Lecture du deuxième nombre
        
        // Calcul de la somme des deux nombres
        int somme = premier + deuxieme;

        // Affichage du résultat
        println("Résultat de " + premier + " + " + deuxieme + " = " + somme);
    }
}
