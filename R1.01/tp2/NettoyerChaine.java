class NettoyerChaine extends Program {
    void algorithm() {
        println("Nettoyer : ");
        String chaine = readString(); // Lire la chaîne à nettoyer
        
        // Affichage de la chaîne avant nettoyage
        println("Avant nettoyage :");
        println(">" + chaine + "<");

        // Supprimer les espaces au début
        while (length(chaine) > 0 && charAt(chaine, 0) == ' ') {
            chaine = substring(chaine, 1, length(chaine)); // Enlève le premier caractère si c'est un espace
        }

        // Supprimer les espaces à la fin
        while (length(chaine) > 0 && charAt(chaine, length(chaine) - 1) == ' ') {
            chaine = substring(chaine, 0, length(chaine) - 1); // Enlève le dernier caractère si c'est un espace
        }

        // Affichage de la chaîne après nettoyage
        println("Après nettoyage :");
        println(">" + chaine + "<");
    }
}
