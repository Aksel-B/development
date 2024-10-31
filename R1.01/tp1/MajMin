// Déclaration de la classe MajMin qui hérite de Program
class MajMin extends Program {

    // Constante représentant la différence ASCII entre majuscules et minuscules
    final int DIFF_MAJ_MIN = 32;

    // Méthode principale algorithm() pour convertir une lettre minuscule en majuscule et vice versa
    void algorithm(){
        // Demande à l'utilisateur d'entrer une lettre en minuscule
        print("Entrez une lettre en minuscule : ");
        
        // Lecture de la lettre minuscule entrée par l'utilisateur
        char lettreMin = readChar();

        // Vérifie si la lettre est bien en minuscule
        if (lettreMin >= 'a' && lettreMin <= 'z') {
            // Conversion de la lettre minuscule en majuscule en soustrayant DIFF_MAJ_MIN
            char enMaj = (char)((int) lettreMin - DIFF_MAJ_MIN);
            
            // Affichage de la lettre en majuscule
            println("La lettre " + lettreMin + " en majuscule donne : " + enMaj);
        } else {
            println("Erreur : veuillez entrer une lettre minuscule.");
        }

        // Demande à l'utilisateur d'entrer une lettre en majuscule
        print("Entrez une lettre en majuscule : ");
        
        // Lecture de la lettre majuscule entrée par l'utilisateur
        char lettreMaj = readChar();

        // Vérifie si la lettre est bien en majuscule
        if (lettreMaj >= 'A' && lettreMaj <= 'Z') {
            // Conversion de la lettre majuscule en minuscule en ajoutant DIFF_MAJ_MIN
            char enMin = (char)((int) lettreMaj + DIFF_MAJ_MIN);
            
            // Affichage de la lettre en minuscule
            println("La lettre " + lettreMaj + " en minuscule donne : " + enMin);
        } else {
            println("Erreur : veuillez entrer une lettre majuscule.");
        }
    }
}
