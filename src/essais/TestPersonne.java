package essais;
import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(1, "rue de la Paix", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(2, "rue de la Liberté", 69000, "Lyon");

        Personne personne1 = new Personne("Doe", "John", adresse1);
        Personne personne2 = new Personne("D'arc", "Jane", adresse2);

        personne1.affiche();
        personne2.affiche();
    }
}
