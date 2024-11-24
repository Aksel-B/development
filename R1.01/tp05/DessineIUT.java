class DessineIUT extends Program {
    
    // Fonction pour dessiner une ligne de 'n' caractères 'c'
    void dessineLigne(int n, char c) {
        for (int i = 0; i < n; i = i + 1) {
            print(c);  // Affiche le caractère 'c' une fois par itération
        }
        println();  // Affiche un retour à la ligne après avoir dessiné la ligne
    }

    // Fonction pour dessiner la partie du milieu (une seule lettre entourée d'espaces)
    void dessineMilieu(int n, char c) {
        String txt = "";  // Variable pour stocker le texte à afficher
        
        // On ajoute des espaces pour centrer la lettre
        for (int i = 0; i < (n / 2); i = i + 1) {
            txt = txt + " ";  // Ajoute un espace à chaque itération
        }
        txt = txt + c;  // Ajoute la lettre au centre
        println(txt);  // Affiche le texte avec la lettre
    }

    // Fonction pour dessiner les parties extrêmes (caractères avec espaces au milieu)
    void dessineExtreme(int n, char c) {
        String txt = "";  // Variable pour stocker le texte à afficher
        txt = txt + c;  // On commence par ajouter le premier caractère

        // On ajoute des espaces entre les caractères
        for (int i = 0; i < (n - 2); i = i + 1) {
            txt = txt + " ";  // Ajoute un espace
        }

        txt = txt + c;  // Ajoute le dernier caractère
        println(txt);  // Affiche le texte avec les espaces entre les caractères
    }

    // Fonction pour dessiner la lettre 'I'
    void dessineI(int n) {
        char c = 'I';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la première ligne avec des 'I'
        
        // Dessine les lignes du milieu avec un seul 'I' centré
        for (int i = 0; i < (n - 2); i = i + 1) {
            dessineMilieu(n, c);  // Appelle dessineMilieu pour afficher un 'I' au milieu
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'I'
    }

    // Fonction pour dessiner la lettre 'U'
    void dessineU(int n) {
        char c = 'U';  // La lettre à dessiner
        
        // Dessine les parties latérales avec des 'U' à chaque extrémité
        for (int i = 0; i < (n - 1); i = i + 1) {
            dessineExtreme(n, c);  // Appelle dessineExtreme pour dessiner une ligne avec 'U' aux bords
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'U' en bas
    }

    // Fonction pour dessiner la lettre 'T'
    void dessineT(int n) {
        char c = 'T';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la ligne supérieure avec des 'T'

        // Dessine les lignes du bas avec un seul 'T' centré
        for (int i = 0; i < (n - 1); i = i + 1) {
            dessineMilieu(n, c);  // Appelle dessineMilieu pour dessiner un 'T' centré
        }
    }
    
    // Fonction principale qui lance le dessin
    void algorithm() {
        print("Taille : ");  // Demande la taille du dessin
        int n = readInt();  // Lecture de la taille saisie par l'utilisateur

        // Dessine les lettres 'I', 'U', 'T' avec la taille 'n'
        dessineI(n);
        println("");  // Saut de ligne entre les dessins
        dessineU(n);
        println("");  // Saut de ligne entre les dessins
        dessineT(n);  // Dessine la lettre 'T'
    }
}
