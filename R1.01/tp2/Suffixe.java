class Suffixe extends Program {
    void algorithm() {
        // Demander à l'utilisateur d'entrer une chaîne de caractères
        print("Entrez une chaîne de caractères : ");
        String chaine = readString();

        // Demander le nombre de lettres de fin souhaitées
        print("Nombre de lettres de fin souhaitées : ");
        int nbLettres = readInt();

        // Vérification si le nombre de lettres est valide
        if (nbLettres < 0) {
            println("Erreur : le nombre de lettres ne peut pas être négatif !");
        } else if (nbLettres > length(chaine)) {
            println("Erreur : pas assez de caractères dans la chaîne !");
        } else {
            // Extraction du suffixe et affichage du résultat
            String result = substring(chaine, length(chaine) - nbLettres, length(chaine));
            println("Résultat : " + result);
        }
    }
}
