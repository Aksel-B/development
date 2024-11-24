class Decompte extends Program {

    // Génère les nombres pairs de n à 2 sous forme de chaîne
    String genereNombresPairs1(int n) {
        String chaine = "";
        do {
            chaine = chaine + n;  // Ajoute le nombre actuel à la chaîne
            n = n - 2;  // Décrémente de 2 pour obtenir le prochain nombre pair
        } while (n >= 2);  // Continue tant que n est supérieur ou égal à 2
        return chaine;  // Retourne la chaîne générée
    }

    // Teste la méthode genereNombresPairs1
    void testGenereNombresPairs1() {
        assertEquals("8642", genereNombresPairs1(8));
        assertEquals("12108642", genereNombresPairs1(12));
        assertEquals("2", genereNombresPairs1(2));
    }

    // Génère les nombres pairs de n à 2 entourés d'astérisques
    String genereNombresPairs2(int n) {
        String chaine = "*";  // Initialise la chaîne avec un astérisque
        do {
            chaine = chaine + n;  // Ajoute le nombre actuel à la chaîne
            n = n - 2;  // Décrémente de 2 pour obtenir le prochain nombre pair
        } while (n >= 2);  // Continue tant que n est supérieur ou égal à 2
        return chaine + '*';  // Ajoute un astérisque à la fin et retourne la chaîne
    }

    // Teste la méthode genereNombresPairs2
    void testGenereNombresPairs2() {
        assertEquals("*8642*", genereNombresPairs2(8));
        assertEquals("*12108642*", genereNombresPairs2(12));
        assertEquals("*2*", genereNombresPairs2(2));
    }

    // Génère les nombres pairs de n à 2 séparés par des astérisques et finit par 2
    String genereNombresPairs3(int n) {
        String chaine = "";  // Initialise la chaîne vide
        do {
            chaine = chaine + n + '*';  // Ajoute le nombre et un astérisque à la chaîne
            n = n - 2;  // Décrémente de 2 pour obtenir le prochain nombre pair
        } while (n > 2);  // Continue tant que n est strictement supérieur à 2

        // Si n est égal à 0, on réinitialise la chaîne à vide
        if (n == 0) {
            chaine = "";
        }

        return chaine + 2;  // Retourne la chaîne avec le dernier 2
    }

    // Teste la méthode genereNombresPairs3
    void testGenereNombresPairs3() {
        assertEquals("8*6*4*2", genereNombresPairs3(8));
        assertEquals("12*10*8*6*4*2", genereNombresPairs3(12));
        assertEquals("2", genereNombresPairs3(2));
    }
}
