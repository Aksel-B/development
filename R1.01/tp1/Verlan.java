// Déclaration de la classe Verlan qui hérite de Program
class Verlan extends Program {

    // Méthode principale algorithm() pour inverser le mot en deux parties
    void algorithm() {
        // Demande à l'utilisateur d'entrer un mot à inverser
        print("Entrez un mot à transformer en verlan : ");
        String mot = readString(); // Lecture de l'entrée utilisateur

        // Calcul de la longueur du mot
        int tailleMot = length(mot);
        
        // Vérification que le mot a au moins 2 caractères
        if (tailleMot < 2) {
            println("Erreur : le mot doit contenir au moins 2 caractères.");
            return; // Sortie de la méthode si le mot est trop court
        }

        // Calcul de l'indice du milieu du mot, arrondi vers le haut pour les longueurs impaires
        int indiceMilieu = (tailleMot + 1) / 2;

        // Extraction de la première moitié du mot
        String debut = substring(mot, 0, indiceMilieu);
        
        // Extraction de la seconde moitié du mot
        String fin = substring(mot, indiceMilieu, tailleMot);
        
        // Affichage du mot en verlan (partie finale + partie initiale)
        println(fin + debut);
    }
}
