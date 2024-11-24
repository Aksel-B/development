class Magic8Ball extends Program {
    void algorithm() {
        println("Question : ");
        String question = readString();

        // Vérification si la question est vide
        if (length(question) == 0) {
            println("Veuillez poser une question.");
            return; // Sortir de la fonction si la question est vide
        }

        // Initialisation de la variable de réponse
        String reponse = "";

        // Générer un nombre aléatoire entre 1 et 20
        int random = (int)(random() * 20) + 1;

        // Déterminer la réponse en fonction de la valeur aléatoire
        if (random == 1) {
            reponse = "It is certain";
        } else if (random == 2) {
            reponse = "It is decidedly so";
        } else if (random == 3) {
            reponse = "Without a doubt";
        } else if (random == 4) {
            reponse = "Yes definitely";
        } else if (random == 5) {
            reponse = "You may rely on it";
        } else if (random == 6) {
            reponse = "As I see it, yes";
        } else if (random == 7) {
            reponse = "Most likely";
        } else if (random == 8) {
            reponse = "Outlook good";
        } else if (random == 9) {
            reponse = "Yes";
        } else if (random == 10) {
            reponse = "Signs point to yes";
        } else if (random == 11) {
            reponse = "Reply hazy, try again";
        } else if (random == 12) {
            reponse = "Ask again later";
        } else if (random == 13) {
            reponse = "Better not tell you now";
        } else if (random == 14) {
            reponse = "Cannot predict now";
        } else if (random == 15) {
            reponse = "Concentrate and ask again";
        } else if (random == 16) {
            reponse = "Don't count on it";
        } else if (random == 17) {
            reponse = "My reply is no";
        } else if (random == 18) {
            reponse = "My sources say no";
        } else if (random == 19) {
            reponse = "Outlook not so good";
        } else if (random == 20) {
            reponse = "Very doubtful";
        }

        // Afficher la question et la réponse
        println("La réponse de la boule magique à \"" + question + "\" est : " + reponse);
    }
}
