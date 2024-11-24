// Déclaration de la classe LettreAuHazard qui hérite de Program
class LettreAuHazard extends Program {

    // Méthode principale algorithm() qui génère et affiche une lettre aléatoire
    void algorithm(){
        // Génération d'un code ASCII pour une lettre majuscule aléatoire
        // La formule 65 + (random() * 26) génère un nombre entre 65 (A) et 90 (Z)
        char lettre = (char)(65 + (random() * 26));
        
        // Affichage de la lettre aléatoire générée
        println(lettre);
    }
}
