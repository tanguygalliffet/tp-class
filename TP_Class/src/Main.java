public class Main {
    public static void main(String[] args) {
        // Création de plusieurs instances de la classe Pokemon
        Pokemon dracaufeu = new Pokemon(6, "Dracaufeu", "Feu", "Vol", 78, 360, 84, 78, 109, 85, 100);
        Pokemon tortank = new Pokemon(9, "Tortank", "Eau", null, 79, 362, 83, 100, 85, 105, 78);

        // Ajout d'attaques
        Attaque lanceFlamme = new Attaque("Lance-Flammes", 90); //Attaque de dracaufeu
        Attaque hydroCanon = new Attaque("Hydrocanon", 110); //Attaque de Tortank

        dracaufeu.ajouterAttaque(lanceFlamme);
        tortank.ajouterAttaque(hydroCanon);

        // Afficher les informations des pokémons
        System.out.println(dracaufeu.toString());
        System.out.println(tortank.toString());

        // Simuler une attaque entre Dracaufeu et Tortank
        int dommagesDracaufeuSurTortank = dracaufeu.calculerDommage(tortank, lanceFlamme);
        System.out.println("Dracaufeu inflige " + dommagesDracaufeuSurTortank + " dommages à Tortank.");


    }
}
