package entites;

public class Personne {

    private String nom;
    private String prenom;
    private AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void affiche() {
        System.out.println(nom + " " + prenom);
        adresse.affiche();
    }
}
