// Déclaration de la classe CaractereSuivant qui hérite de Program
class CaractereSuivant extends Program {
    
    // Méthode principale algorithm() pour obtenir le caractère suivant
    void algorithm() {
        // Demande à l'utilisateur d'entrer un caractère
        print("Entrez un caractère : ");
        char c = readChar(); // Lecture du caractère saisi par l'utilisateur

        // Calcul du caractère suivant en utilisant la valeur ASCII
        char suivant = (char)((int) c + 1);

        // Affichage du caractère suivant
        println("Le caractère après " + c + " est : " + suivant);
    }
}
