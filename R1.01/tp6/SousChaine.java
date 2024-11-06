class SousChaine extends Program {
    void algorithm(){
        int cpt = 0; // Initialisation d'un compteur pour compter le nombre de sous-chaînes
        print("Chaine : "); // Demande à l'utilisateur de saisir une chaîne
        String chaine = readString(); // Lecture de la chaîne saisie par l'utilisateur
        
        // Première boucle : itère sur chaque indice de la chaîne (i représente le début de la sous-chaîne)
        for (int i = 0; i < length(chaine); i++) {
            
            // Deuxième boucle : pour chaque indice i, elle génère toutes les sous-chaînes possibles
            // en faisant varier l'indice de fin j (qui commence à i+1 pour éviter les indices égaux)
            for (int j = i + 1; j <= length(chaine); j++) {
                
                // Affiche la sous-chaîne allant de l'indice i à l'indice j exclusif
                println(substring(chaine, i, j)); 
                
                // Incrémente le compteur de sous-chaînes
                cpt++; 
            }
        }
        
        // Affiche le nombre total de sous-chaînes générées
        println(cpt); 
    }
}
