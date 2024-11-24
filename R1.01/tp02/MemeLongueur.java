class MemeLongueur extends Program {
    void algorithm() {
        // Déclaration et initialisation des mots à comparer
        String mot1 = "pomme";  // Premier mot
        String mot2 = "orange"; // Deuxième mot

        // Calcul des longueurs des mots
        int longueurMot1 = length(mot1); // Longueur du premier mot
        int longueurMot2 = length(mot2); // Longueur du deuxième mot

        // Vérification si les deux mots ont la même longueur
        boolean memeLongueur = longueurMot1 == longueurMot2; // Vérification de l'égalité des longueurs

        // Affichage du résultat
        println("Les deux mots sont de la même longueur : " + memeLongueur);
    }
}
