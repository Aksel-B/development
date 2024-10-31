class Intersection extends Program {
    void algorithm() {
        // Variables pour stocker les bornes des intervalles
        int borneInf1, borneSup1, borneInf2, borneSup2;

        // Demander à l'utilisateur d'entrer les bornes du premier intervalle
        print("Entrez les bornes du premier intervalle (borne inférieure puis supérieure) : ");
        borneInf1 = readInt();
        borneSup1 = readInt();

        // Demander à l'utilisateur d'entrer les bornes du deuxième intervalle
        print("Entrez les bornes du deuxième intervalle (borne inférieure puis supérieure) : ");
        borneInf2 = readInt();
        borneSup2 = readInt();

        // Variables pour les bornes de l'intersection
        int borneInfIntersection, borneSupIntersection;

        // Déterminer la borne inférieure d'intersection
        if (borneInf1 > borneInf2) {
            borneInfIntersection = borneInf1; // Si borneInf1 est plus grande, on l'utilise
        } else {
            borneInfIntersection = borneInf2; // Sinon, on utilise borneInf2
        }

        // Déterminer la borne supérieure d'intersection
        if (borneSup1 < borneSup2) {
            borneSupIntersection = borneSup1; // Si borneSup1 est plus petite, on l'utilise
        } else {
            borneSupIntersection = borneSup2; // Sinon, on utilise borneSup2
        }

        // Vérifier si l'intervalle d'intersection est valide
        if (borneInfIntersection > borneSupIntersection) {
            println("Cet intervalle est vide.");    
        } else {
            println("L'intersection de ces deux intervalles est : [" + borneInfIntersection + "; " + borneSupIntersection + "]");
        }        
    }
}
