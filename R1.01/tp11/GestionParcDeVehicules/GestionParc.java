class GestionParc extends Program {
    final int NB_MAX = 100;
    
    // Constructeur d'un véhicule
    Vehicule newVehicule(String modele, int annee) {
        Vehicule v = new Vehicule();
        v.modele = modele;
        v.annee = annee;
        return v;
    }

    // Représentation d'un véhicule en chaîne
    String toString(Vehicule v) {
        return v.modele + " " + v.annee;
    }

    // Test de toString pour un véhicule
    void testToStringVehicle() {
        assertEquals("Yaris 2020", toString(newVehicule("Yaris", 2020)));
    }

    // Constructeur d'un parc vide
    Parc newParcVide() {
        Parc p = new Parc();
        p.vehicules = new Vehicule[NB_MAX];
        p.nbVehicules = 0;
        return p;
    }

    // Ajout d'un véhicule dans un parc
    boolean ajouterVehicule(Parc parking, Vehicule v) {
        boolean resultat = true; 
        if (parking.nbVehicules >= NB_MAX) {
            resultat = false;
        }
        parking.vehicules[parking.nbVehicules] = v;
        parking.nbVehicules++;
        return resultat;
    }

    // Représentation d'un parc en chaîne
    String toString(Parc parking) {
        String resultat = "";
        for (int i = 0; i < parking.nbVehicules; i++) {
            resultat += toString(parking.vehicules[i]) + "\n";
        }
        return resultat;
    }

    // Test de toString pour un parc
    void testToStringParc() {
        Parc p = newParcVide();
        Vehicule v1 = newVehicule("Yaris", 2020);
        Vehicule v2 = newVehicule("Touran", 2019);
        ajouterVehicule(p, v1);
        ajouterVehicule(p, v2);
        assertEquals("Yaris 2020\nTouran 2019\n", toString(p));
    }

    // Comptage des voitures d'un certain modèle
    int nbVoitures(Parc p, String modele) {
        int compte = 0;
        for (int i = 0; i < p.nbVehicules; i++) {
            if (equals(p.vehicules[i].modele, modele)) {
                compte++;
            }
        }
        return compte;
    }

    // Fusion de deux parcs
    boolean fusionParcs(Parc p1, Parc p2) {
        int placesDisponibles = NB_MAX - p1.nbVehicules;
        int aDeplacer = Math.min(p2.nbVehicules, placesDisponibles);
        
        // Déplacement des véhicules
        for (int i = 0; i < aDeplacer; i++) {
            p1.vehicules[p1.nbVehicules + i] = p2.vehicules[i];
        }
        
        // Mise à jour des compteurs
        p1.nbVehicules += aDeplacer;
        
        // Réorganisation de p2
        for (int i = 0; i < p2.nbVehicules - aDeplacer; i++) {
            p2.vehicules[i] = p2.vehicules[i + aDeplacer];
        }
        p2.nbVehicules -= aDeplacer;
        
        return aDeplacer == p2.nbVehicules;
    }

    // Suppression d'un véhicule
    void suppressionVehicule(Parc p, Vehicule v) {
        int i = 0;
        // Recherche du véhicule
        while (i < p.nbVehicules && !equals(toString(p.vehicules[i]), toString(v))) {
            i++;
        }
        
        // Si le véhicule a été trouvé
        if (i < p.nbVehicules) {
            // Décalage des véhicules
            for (int j = i; j < p.nbVehicules - 1; j++) {
                p.vehicules[j] = p.vehicules[j + 1];
            }
            p.nbVehicules--;
        }
    }

    void algorithm() {
        // Test des différentes fonctionnalités
        testToStringVehicle();
        testToStringParc();
        
        // Création d'un parc exemple
        Parc p = newParcVide();
        ajouterVehicule(p, newVehicule("Yaris", 2020));
        ajouterVehicule(p, newVehicule("Touran", 2019));
        ajouterVehicule(p, newVehicule("Yaris", 2021));
        
        println("Parc initial :");
        println(toString(p));
        println("Nombre de Yaris : " + nbVoitures(p, "Yaris"));
    }
}
