class DessineASCII extends Program {

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

    // Fonction pour dessiner la lettre 'L'
    void dessineL(int n) {
        char c = 'L';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la ligne supérieure avec des 'L'
        
        // Dessine les lignes du bas avec un seul 'L' centré
        for (int i = 0; i < (n - 2); i = i + 1) {
            dessineMilieu(n, c);  // Appelle dessineMilieu pour dessiner un 'L' centré
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'L'
    }

    // Fonction pour dessiner la lettre 'E'
    void dessineE(int n) {
        char c = 'E';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la première ligne avec des 'E'

        // Dessine les parties du milieu avec des 'E' en bord
        for (int i = 0; i < (n - 2); i = i + 1) {
            dessineExtreme(n, c);  // Dessine la partie centrale de 'E'
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'E'
    }

    // Fonction pour dessiner la lettre 'A'
    void dessineA(int n) {
        char c = 'A';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la première ligne avec des 'A'
        
        // Dessine les lignes du milieu avec un seul 'A' centré
        for (int i = 0; i < (n - 2); i = i + 1) {
            dessineMilieu(n, c);  // Dessine un 'A' au centre
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'A'
    }

    // Fonction pour dessiner la lettre 'S'
    void dessineS(int n) {
        char c = 'S';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la première ligne avec des 'S'

        // Dessine les parties du milieu avec des 'S' en bord
        for (int i = 0; i < (n - 2); i = i + 1) {
            dessineExtreme(n, c);  // Dessine la partie centrale de 'S'
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'S'
    }

    // Fonction pour dessiner la lettre 'C'
    void dessineC(int n) {
        char c = 'C';  // La lettre à dessiner
        dessineLigne(n, c);  // Dessine la première ligne avec des 'C'

        // Dessine les parties du milieu avec des 'C' en bord
        for (int i = 0; i < (n - 2); i = i + 1) {
            dessineExtreme(n, c);  // Dessine la partie centrale de 'C'
        }

        dessineLigne(n, c);  // Dessine la dernière ligne avec des 'C'
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
        dessineT(n);
        println("");  // Saut de ligne entre les dessins

        // Dessine les lettres 'L', 'L', 'I', 'L', 'L', 'E' pour le mot "LILLE"
        dessineL(n);
        println("");  // Saut de ligne entre les dessins
        dessineI(n);
        println("");  // Saut de ligne entre les dessins
        dessineL(n);
        println("");  // Saut de ligne entre les dessins
        dessineL(n);
        println("");  // Saut de ligne entre les dessins
        dessineE(n);
        println("");  // Saut de ligne entre les dessins

        // Dessine le mot "ASCII"
        dessineA(n);
        println("");  // Saut de ligne entre les dessins
        dessineS(n);
        println("");  // Saut de ligne entre les dessins
        dessineC(n);
        println("");  // Saut de ligne entre les dessins
        dessineC(n);
        println("");  // Saut de ligne entre les dessins
        dessineI(n);
        println("");  // Saut de ligne entre les dessins
    }
}
