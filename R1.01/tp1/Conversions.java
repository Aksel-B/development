// Déclaration de la classe Conversions qui hérite de Program
class Conversions extends Program {
    
    // Méthode principale algorithm() pour démontrer différents types de conversions
    void algorithm() {
        // Conversion d'un double en int (troncature)
        print("(int) 4.6 -> 4 ");
        println((int) 4.6); // Affiche 4 (la partie entière)

        // Conversion d'un int en double
        print("(double) 4 -> 4.0 ");
        println((double) 4); // Affiche 4.0 (conversion vers double)

        // Addition d'un double et d'un int
        print("2.1 + 3 -> 5.1 ");
        println(2.1 + 3); // Affiche 5.1 (addition avec promotion en double)

        // Conversion d'un caractère en son code ASCII
        print("(int) 'A' -> 65 ");
        println((int) 'A'); // Affiche 65 (code ASCII de 'A')

        // Conversion d'un int en caractère
        print("(char) 66 -> B ");
        println((char) 66); // Affiche 'B' (caractère correspondant au code ASCII 66)

        // Multiplication d'un double et conversion en int
        print("(int) 3.7 * 2 -> 6 ");
        println((int) 3.7 * 2); // Affiche 6 (troncature de 3.7 avant multiplication)

        // Multiplication puis conversion en int
        print("(int) (3.7 * 2) -> 7 ");
        println((int) (3.7 * 2)); // Affiche 7 (résultat de 3.7 * 2 tronqué)

        // Concatenation de chaîne de caractères avec un caractère
        print("\"ABC\" + A -> ");
        println("ABC" + (char) 65); // Affiche "ABCA" (concaténation de la chaîne avec 'A')
    }
}
