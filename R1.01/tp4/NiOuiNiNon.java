class NiOuiNiNon extends Program {

    void algorithm() {

        String chaine;  // Variable pour stocker la chaîne saisie par l'utilisateur

        // Boucle do-while qui continue tant que l'utilisateur ne saisit ni "oui" ni "non"
        do {
            chaine = readString();  // Lecture de la chaîne saisie par l'utilisateur
            chaine = toLowerCase(chaine);  // Convertit la chaîne en minuscules pour éviter les erreurs de casse
        } while (!equals(chaine, "oui") && !equals(chaine, "non"));  // La boucle continue tant que la chaîne n'est pas "oui" ou "non"
    }
}
