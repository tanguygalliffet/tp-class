import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    // Attributs de la classe Pokemon
    private int numeroNational;
    private String nom;
    private String typePrincipal;
    private String typeSecondaire;
    private int niveau;
    private int pointsDeVie;
    private int attaque;
    private int defense;
    private int attaqueSpeciale;
    private int defenseSpeciale;
    private int vitesse;
    private List<Attaque> attaques; // Liste des attaques du Pokémon

    // Constructeur pour initialiser un Pokémon avec ou sans second type
    public Pokemon(int numeroNational, String nom, String typePrincipal, String typeSecondaire, int niveau, int pointsDeVie,
                   int attaque, int defense, int attaqueSpeciale, int defenseSpeciale, int vitesse) {
        this.numeroNational = numeroNational;
        this.nom = nom;
        this.typePrincipal = typePrincipal;
        this.typeSecondaire = typeSecondaire;
        this.niveau = niveau;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.defense = defense;
        this.attaqueSpeciale = attaqueSpeciale;
        this.defenseSpeciale = defenseSpeciale;
        this.vitesse = vitesse;
        this.attaques = new ArrayList<>(); // Initialiser la liste d'attaques
    }

    // Getter et Setter pour chaque attribut
    public int getNumeroNational() {
        return numeroNational;
    }

    public void setNumeroNational(int numeroNational) {
        this.numeroNational = numeroNational;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypePrincipal() {
        return typePrincipal;
    }

    public void setTypePrincipal(String typePrincipal) {
        this.typePrincipal = typePrincipal;
    }

    public String getTypeSecondaire() {
        return typeSecondaire;
    }

    public void setTypeSecondaire(String typeSecondaire) {
        this.typeSecondaire = typeSecondaire;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttaqueSpeciale() {
        return attaqueSpeciale;
    }

    public void setAttaqueSpeciale(int attaqueSpeciale) {
        this.attaqueSpeciale = attaqueSpeciale;
    }

    public int getDefenseSpeciale() {
        return defenseSpeciale;
    }

    public void setDefenseSpeciale(int defenseSpeciale) {
        this.defenseSpeciale = defenseSpeciale;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    // Ajout d'attaque à la liste d'attaque
    public void ajouterAttaque(Attaque attaque) {
        this.attaques.add(attaque);
    }

    // Afficher liste des attaques
    public void afficherAttaques() {
        for (Attaque attaque : attaques) {
            System.out.println(attaque.toString());
        }
    }

    // Méthode pour retourner une chaîne de caractère avec les informations du Pokémon
    @Override
    public String toString() {
        return "Pokemon{" +
                "Numéro National=" + numeroNational +
                ", Nom='" + nom + '\'' +
                ", Type Principal='" + typePrincipal + '\'' +
                ", Type Secondaire='" + (typeSecondaire != null ? typeSecondaire : "Aucun") + '\'' + //Si pas de type secondaire, on retourne null
                ", Niveau=" + niveau +
                ", Points de Vie=" + pointsDeVie +
                ", Attaque=" + attaque +
                ", Défense=" + defense +
                ", Attaque Spéciale=" + attaqueSpeciale +
                ", Défense Spéciale=" + defenseSpeciale +
                ", Vitesse=" + vitesse +
                '}';
    }

    // Méthode pour calculer les dommages infligés à un autre pokémon
    public int calculerDommage(Pokemon adversaire, Attaque attaque) {
        // Formule pour calculer les dommages infligés à un pokémon
        double dommages = (((2 * this.niveau + 10) / 250.0) * (this.attaque / (double) adversaire.getDefense()) * attaque.getPuissance()) + 2;
        return (int) dommages;
    }
}
