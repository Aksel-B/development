class FizzBuzz extends Program {
    void algorithm() {
        print("Entrez un nombre : "); // Demander à l'utilisateur d'entrer un nombre
        int nbr = readInt(); // Lire le nombre saisi par l'utilisateur

        // Vérification des conditions FizzBuzz
        if (nbr % 3 == 0 && nbr % 5 == 0) {
            println("fizzbuzz"); // Affiche "fizzbuzz" si le nombre est divisible par 3 et 5
        } else if (nbr % 3 == 0) {
            println("fizz"); // Affiche "fizz" si le nombre est divisible par 3
        } else if (nbr % 5 == 0) {
            println("buzz"); // Affiche "buzz" si le nombre est divisible par 5
        } else {
            println("Le nombre est : " + nbr); // Affiche le nombre s'il n'est ni divisible par 3 ni par 5
        }
    }
}
