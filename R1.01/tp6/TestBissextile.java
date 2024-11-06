class TestBissextile extends Program {

    // Cette méthode détermine si une année est bissextile selon les règles du calendrier grégorien.
    boolean Bissextile(int annee){
        boolean Bissextile = false; // Initialisation de la variable à false, elle sera modifiée si l'année est bissextile.

        // Vérification des conditions d'une année bissextile :
        // - L'année est divisible par 4 ET n'est PAS divisible par 100, OU
        // - L'année est divisible par 400.
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            Bissextile = true; // Si les conditions sont remplies, l'année est bissextile.
        }


        return Bissextile; // Retourne true si l'année est bissextile, sinon false.
    }

    // Cette méthode contient des tests pour vérifier la validité de la méthode Bissextile().
    void testBissextile(){
        // Tests pour des années bissextiles
        assertEquals(true, Bissextile(2000));  // 2000 est une année bissextile (divisible par 400)
        assertEquals(true, Bissextile(2012));  // 2012 est une année bissextile (divisible par 4 et pas par 100)
        assertEquals(true, Bissextile(2024));  // 2024 est une année bissextile (divisible par 4 et pas par 100)
        assertEquals(true, Bissextile(1600));  // 1600 est une année bissextile (divisible par 400)

        // Tests pour des années non bissextiles
        assertEquals(false, Bissextile(2013)); // 2013 n'est pas bissextile (non divisible par 4)
        assertEquals(false, Bissextile(2006)); // 2006 n'est pas bissextile (non divisible par 4)
        assertEquals(false, Bissextile(1999)); // 1999 n'est pas bissextile (non divisible par 4)
        assertEquals(false, Bissextile(1000)); // 1000 n'est pas bissextile (divisible par 100 mais pas par 400)
    }
}
