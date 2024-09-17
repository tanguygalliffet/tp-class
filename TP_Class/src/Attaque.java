
public class Attaque {

    private String nom;      //nom de l'attaque
    private int puissance;   //puissance de l'attaque


    public Attaque(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getPuissance() {
        return puissance;
    }


    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    //Nom et puissance de l'attaque sous forme de chaîne de caractère
    @Override
    public String toString() {
        return "Attaque{" +
                "Nom='" + nom + '\'' +
                ", Puissance=" + puissance +
                '}';
    }
}
