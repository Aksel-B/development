class TicketDeCaisse extends Program {
    
    void algorithm() {
        int n, somme = 0;  // Déclaration des variables
        print("Entrez le montant des articles (0 pour terminer) : ");  // Message pour l'utilisateur
        
        do {
            n = readInt();  // Lecture du montant saisi par l'utilisateur
            if (n >= 0) {  // Validation pour s'assurer que le montant est positif ou zéro
                somme = somme + n;  // Ajout du montant à la somme
            } else {
                println("Montant invalide. Veuillez entrer un montant positif.");
            }
        } while (n != 0);  // La boucle continue tant que n n'est pas égal à 0 (fin de saisie)

        // Affichage du total
        println("Le total des achats est : " + somme);
    }
}
