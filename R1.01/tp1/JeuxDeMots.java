// Déclaration de la classe JeuxDeMots qui hérite de Program
class JeuxDeMots extends Program {

    // Méthode principale algorithm() pour exécuter l'algorithme de transformation de mot
    void algorithm(){
        // Initialisation de la variable 'mot' avec la chaîne "Meow"
        String mot = "Meow";
        
        // Déclaration de la variable 'resultat' pour stocker le mot transformé
        String resultat;
        
        // Obtention de la première lettre du mot
        char premiereLettre = charAt(mot, 0); // Méthode charAt() utilisée pour extraire le premier caractère
        
        // Extraction du reste du mot à partir du deuxième caractère jusqu'à la fin
        String resteDuMot = substring(mot, 1, length(mot)); // Utilisation de substring() pour découper le mot
        
        // Construction du résultat en plaçant 'resteDuMot' suivi de 'premiereLettre'
        resultat = resteDuMot + premiereLettre;
        
        // Affichage du mot transformé
        println(resultat);
    }
}
