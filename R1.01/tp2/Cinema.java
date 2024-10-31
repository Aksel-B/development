class Cinema extends Program {
    // Constantes pour les prix
    private static final double PRIX_DE_BASE = 12.0;
    private static final double REDUCTION_ENFANT = 0.5; // Réduction de 50%
    private static final double REDUCTION_AGE = 3.0; // Réduction pour les âges 10-16 ou 60+
    private static final double SURCHARGE_3D = 2.0; // Surcharge pour le 3D
    private static final double REDUCTION_ABONNE = 0.8; // Réduction de 20% pour les abonnés

    void algorithm() {
        print("Âge du spectateur : ");
        int age = readInt();
        
        print("Option 3D ? (1 si oui, autre chiffre si non) : ");
        int troisD = readInt();
        
        print("Abonné ? (1 si oui, autre chiffre si non) : ");
        int abo = readInt();

        double prix = calculerPrix(age, troisD, abo);
        
        // Affichage du prix avec deux décimales
        println("Coût du billet : " + (int)(prix * 100) / 100.0 + " euros");
    }

    private double calculerPrix(int age, int troisD, int abo) {
        double prix = PRIX_DE_BASE;

        // Calcul des réductions
        if (age < 10) {
            prix *= REDUCTION_ENFANT; // Réduction de 50% pour les enfants
        } else if ((age >= 10 && age <= 16) || (age >= 60)) {
            prix -= REDUCTION_AGE; // Réduction de 3 euros
        }

        // Surcharge pour 3D
        if (troisD == 1) {
            prix += SURCHARGE_3D;
        }

        // Remise pour abonnement
        if (abo == 1) {
            prix *= REDUCTION_ABONNE;
        }

        return prix;
    }
}
