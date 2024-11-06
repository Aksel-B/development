class MinMax extends Program{
    int[] minMax(int[] tab) {
        int[] res = new int[2];  // Tableau de 2 éléments pour stocker le minimum et le maximum
        int min = tab[0];  // Initialisation de la valeur minimale avec le premier élément du tableau
        int max = tab[0];  // Initialisation de la valeur maximale avec le premier élément du tableau
        for (int i = 0; i < length(tab); i++){  // Parcourt chaque élément du tableau
            if (tab[i] < min) {  // Si l'élément actuel est inférieur au minimum actuel
                min = tab[i];  // Mise à jour du minimum
            }
            if (tab[i] > max) {  // Si l'élément actuel est supérieur au maximum actuel
                max = tab[i];  // Mise à jour du maximum
            }
        } 
        res[0] = min;  // Stocke la valeur minimale dans le premier élément du tableau 'res'
        res[1] = max;  // Stocke la valeur maximale dans le deuxième élément du tableau 'res'
        return res;  // Retourne le tableau contenant le minimum et le maximum
    }

    int[] minMaxIndices(int[] tab) {
        int[] res = new int[2];  // Tableau de 2 éléments pour stocker les indices du minimum et du maximum
        int min = tab[0];  // Initialisation de la valeur minimale avec le premier élément du tableau
        int max = tab[0];  // Initialisation de la valeur maximale avec le premier élément du tableau
        int i1 = 0;  // Indice de l'élément minimum
        int i2 = 0;  // Indice de l'élément maximum
        for (int i = 0; i < length(tab); i++){  // Parcourt chaque élément du tableau
            if (tab[i] < min) {  // Si l'élément actuel est inférieur au minimum actuel
                min = tab[i];  // Mise à jour du minimum
                i1 = i;  // Mise à jour de l'indice du minimum
            }
            if (tab[i] > max) {  // Si l'élément actuel est supérieur au maximum actuel
                max = tab[i];  // Mise à jour du maximum
                i2 = i;  // Mise à jour de l'indice du maximum
            }
        } 
        res[0] = i1;  // Stocke l'indice du minimum dans le premier élément du tableau 'res'
        res[1] = i2;  // Stocke l'indice du maximum dans le deuxième élément du tableau 'res'
        return res;  // Retourne le tableau contenant les indices du minimum et du maximum
    }

    void testMinMax() {
        assertArrayEquals(new int[]{1,3}, minMax(new int[]{2,1,3}));  // Test avec un tableau de 3 éléments
        assertArrayEquals(new int[]{2,2}, minMax(new int[]{2,2,2}));  // Test avec un tableau contenant des éléments identiques
        assertArrayEquals(new int[]{-1,3}, minMax(new int[]{3,-1,2}));  // Test avec des éléments positifs et négatifs
    }

    void testMinMaxIndices() {
        assertArrayEquals(new int[]{1,2}, minMaxIndices(new int[]{2,1,3}));  // Test avec un tableau de 3 éléments
        assertArrayEquals(new int[]{0,0}, minMaxIndices(new int[]{2,2,2}));  // Test avec un tableau contenant des éléments identiques
        assertArrayEquals(new int[]{1,0}, minMaxIndices(new int[]{3,-1,2}));  // Test avec des éléments positifs et négatifs
    }
}
