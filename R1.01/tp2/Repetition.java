class Repetition extends Program {
    void algorithm() {
        // Lire la chaîne de caractères
        String rep = readString();

        // Vérifier si la chaîne est suffisamment longue pour être divisée
        if (length(rep) < 2) {
            println(rep + " : La chaîne est trop courte pour vérifier la répétition.");
            return; // Sortir de la fonction si la chaîne est trop courte
        }

        // Vérifier si la longueur de la chaîne est paire
        if (length(rep) % 2 != 0) {
            println(rep + " : La chaîne a une longueur impair, pas de répétition possible.");
            return; // Sortir de la fonction si la longueur est impair
        }

        // Comparer les deux moitiés de la chaîne
        boolean repetition = equals(substring(rep, 0, length(rep) / 2), substring(rep, length(rep) / 2, length(rep)));

        // Afficher le résultat
        println(rep + " : " + repetition);
    }
}
