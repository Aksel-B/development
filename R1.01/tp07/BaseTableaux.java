class BaseTableaux extends Program {

    int[] creerTableau(){
        int[] tab = new int[10];  // Création d'un tableau de 10 éléments
        for (int i = 0; i < 10; i++){  // Parcourt chaque élément du tableau
            if (i < 5 ){  // Si l'indice est inférieur à 5
                tab[i] = 1;  // On assigne la valeur 1
            } else {  // Si l'indice est supérieur ou égal à 5
                tab[i] = 2;  // On assigne la valeur 2
            }
        }
        return tab;  // Retourne le tableau rempli
    }

    int[] creerTableau2(int n){
        int[] tab = new int[n];  // Création d'un tableau de taille n
        for (int i = 0; i < n; i++){  // Parcourt chaque élément du tableau
            if (i < n/2 ){  // Si l'indice est inférieur à la moitié de n
                tab[i] = 1;  // On assigne la valeur 1
            } else if (i >= n/2){  // Si l'indice est supérieur ou égal à la moitié de n
                tab[i] = 2;  // On assigne la valeur 2
            }
        }
        return tab;  // Retourne le tableau rempli
    }

    int[] creerTableauAleatoire(int taille) {
        int[] tab = new int[taille];  // Création d'un tableau de taille spécifiée
        for (int i = 0; i < taille; i++){  // Remplir le tableau avec des valeurs aléatoires
            int valeur = (int)(random()*21);  // Génère une valeur aléatoire entre 0 et 20
            tab[i] = valeur;  // Assigne cette valeur à l'élément du tableau
        }
        return tab;  // Retourne le tableau rempli de valeurs aléatoires
    }

    void testCreerTableauAleatoire() {
        int[] tab = creerTableauAleatoire(20);  // Crée un tableau de 20 éléments aléatoires
        for (int i = 0; i < length(tab); i++) {  // Parcourt chaque élément du tableau
            boolean la = false;  
            if (tab[i] <= 20 && tab[i] >= 0){  // Vérifie si la valeur est entre 0 et 20
                la = true;
            }
            assertEquals(true, la);  // Vérifie que la valeur est valide
        }
    }

    void testCreerTableau() {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau());  // Vérifie le contenu du tableau créé par creerTableau()
    }

    void testCreerTableau2() {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau2(10));  // Vérifie le contenu du tableau créé par creerTableau2() avec n = 10
        assertArrayEquals(new int[]{1,1,2,2,2}, creerTableau2(5));  // Vérifie le tableau créé avec n = 5
        assertArrayEquals(new int[]{}, creerTableau2(0));  // Vérifie le cas où n = 0
    }

}
