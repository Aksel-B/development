class Factorielle extends Program {
    void algorithm () {
        // Lire un entier depuis l'entrée utilisateur
        int n = readInt(); 
        int nbr = n; // Initialiser une variable nbr pour garder une trace de n

        // Boucle pour calculer la factorielle
        for (int i = 1; nbr > 1; i++) {
            nbr = nbr - 1; // Décrémenter nbr à chaque itération
            n = n * nbr; // Multiplier n par le nombre courant (nbr)
        } 
        
        // Vérifier si n est 0, auquel cas la factorielle est 1
        if (n == 0) {
            println("1"); // Afficher 1 si n est 0 (par convention, 0! = 1)
        } else {
            println(n); // Afficher la valeur de n, qui est la factorielle calculée
        }
    }
}
