class Intervalle extends Program {
    void algorithm() {
        int borneInf, borneSup;

        // Demander à l'utilisateur d'entrer la borne inférieure
        print("Entrez la borne inférieure : ");
        borneInf = readInt();
        println();

        // Demander à l'utilisateur d'entrer la borne supérieure
        print("Entrez la borne supérieure : ");
        borneSup = readInt();
        println();

        // Vérifier si l'intervalle est valide
        if (borneInf > borneSup) {
            println("Cet intervalle est vide.");    
        } else {
            println("Cet intervalle n'est pas vide.");
        }
    }
}
