class ConditionsSurEntiers extends Program {
    void algorithm() {
        // Lire les entiers a, b et c
        int a = readInt();
        int b = readInt();
        int c = readInt();

        // Condition : a est supérieur à 5
        boolean aSuperieurA5 = a > 5; // Vérifie si 'a' est supérieur à 5

        // Condition : la somme de a et b est égale à c
        boolean aPlusBEgalC = a + b == c; // Vérifie si a + b est égal à c

        // Condition : b est inférieur à a et à c
        boolean bInferieurAEtC = b < a && b < c; // Vérifie si 'b' est inférieur à 'a' et 'c'

        // Condition : a, b, c sont ordonnés du plus petit au plus grand
        boolean aBCEordonnes = a <= b && b <= c; // Vérifie si a <= b <= c

        // Condition : c n’est pas le plus petit des trois nombres
        boolean cPasLePlusPetit = c > a && c > b; // Vérifie si 'c' n'est pas le plus petit

        // Tests des conditions ; ne pas modifier
        if (aSuperieurA5) {
            println(a + " est supérieur à 5");
        } else {
            println(a + " n'est pas supérieur à 5");
        }

        if (aPlusBEgalC) {
            println(a + " + " + b + " = " + c);
        } else {
            println(a + " + " + b + " n'est pas égal à " + c);
        }

        if (bInferieurAEtC) {
            println(b + " est inférieur à " + a + " et à " + c);
        } else {
            println("Il est faux que " + b + " est inférieur à " + a + " et à " + c);
        }

        if (aBCEordonnes) {
            println("Il est vrai que " + a + " <= " + b + " <= " + c);
        } else {
            println("Il n'est pas vrai que " + a + " <= " + b + " <= " + c);
        }

        if (cPasLePlusPetit) {
            println(c + " n'est pas le plus petit parmi " + a + ", " + b + ", " + c);
        } else {
            println(c + " est le plus petit parmi " + a + ", " + b + ", " + c);
        }
    }
}
