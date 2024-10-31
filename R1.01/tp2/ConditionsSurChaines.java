class ConditionsSurChaines extends Program {
    void algorithm() {
        String a = readString(); // Lire la première chaîne
        String b = readString(); // Lire la deuxième chaîne
        String c = readString(); // Lire la troisième chaîne

        // Condition : la longueur de a est inférieure à 5
        boolean condLongAinf5 = length(a) < 5; // Vérifie si la longueur de 'a' est inférieure à 5

        // Condition : a et b sont la même chaîne
        boolean condAEgalB = equals(a, b); // Vérifie si 'a' est égal à 'b'

        // Condition : la première lettre de b précède la première lettre de a d’après l’ordre du dictionnaire
        boolean condBprecedeA = charAt(b, 0) < charAt(a, 0); // Vérifie si le premier caractère de 'b' est avant celui de 'a'

        // (Optionnel) Condition : c est un préfixe de a
        boolean condCprefixeDeA = length(a) >= length(c) && equals(substring(a, 0, length(c)), c); // Vérifie si 'c' est un préfixe de 'a'

        // Condition : la longueur de a est plus grande que celle de c
        boolean condAplusLongueQueC = length(a) > length(c); // Vérifie si 'a' est plus long que 'c'

        // Affichage des résultats
        if (condLongAinf5) {
            println("\"" + a + "\" a moins de 5 caractères");
        } else {
            println("\"" + a + "\" a 5 caractères ou plus");
        }
        if (condAEgalB) {
            println("\"" + a + "\" est égal à \"" + b + "\"");
        } else {
            println("\"" + a + "\" n'est pas égal à \"" + b + "\"");
        }
        if (condBprecedeA) {
            println("\"" + b + "\" est avant \"" + a + "\" dans le dictionnaire");
        } else {
            println("\"" + b + "\" n'est pas avant \"" + a + "\" dans le dictionnaire");
        }
        if (condCprefixeDeA) {
            println("\"" + c + "\" est préfixe de \"" + a + "\"");
        } else {
            println("\"" + c + "\" n'est pas préfixe de \"" + a + "\"");
        }
        if (condAplusLongueQueC) {
            println("\"" + a + "\" est plus long que \"" + c + "\"");
        } else {
            println("\"" + c + "\" est au moins aussi long que \"" + a + "\"");
        }
    }
}
