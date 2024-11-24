class Tri extends Program {
    void algorithm() {
        char c1, c2, c3;
        
        // Lecture des caractères saisis par l'utilisateur
        c1 = readChar();
        c2 = readChar();
        c3 = readChar();
        
        // Tri des caractères en utilisant des conditions
        // Si c1 est plus grand que c2, on les échange
        if (c1 > c2) {
            char temp = c1;  // Stocke c1 temporairement
            c1 = c2;         // c1 prend la valeur de c2
            c2 = temp;       // c2 prend la valeur de l'ancienne c1
        }
        
        // Après cet échange, on compare c2 et c3
        // Si c2 est plus grand que c3, on les échange
        if (c2 > c3) {
            char temp = c2;  // Stocke c2 temporairement
            c2 = c3;         // c2 prend la valeur de c3
            c3 = temp;       // c3 prend la valeur de l'ancienne c2
        }
        
        // À ce stade, il faut vérifier si c1 est toujours le plus petit
        // S'il est plus grand que c2, on doit encore échanger c1 et c2
        if (c1 > c2) {
            char temp = c1;  // Stocke c1 temporairement
            c1 = c2;         // c1 prend la valeur de c2
            c2 = temp;       // c2 prend la valeur de l'ancienne c1
        }
        
        // Affichage des caractères triés dans l'ordre ASCII
        println("" + c1 + c2 + c3); // à garder tel quel
    }
}
