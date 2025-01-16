package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        // Création des adresses
        AdressePostale adresse1 = new AdressePostale(1, "rue de la Paix", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(2, "rue de la Liberté", 69000, "Lyon");
        AdressePostale nouvelleAdresse = new AdressePostale(3, "avenue des Champs", 75008, "Paris");

        // Utilisation du constructeur avec arguments pour valoriser nom, prénom et adresse
        Personne personne1 = new Personne("Doe", "John", adresse1);
        Personne personne2 = new Personne("D'arc", "Jane", adresse2);

        // Modification de l'adresse de personne1
        personne1.setAdresse(nouvelleAdresse);

        // Affichage des informations des personnes
        System.out.println(personne1);
        System.out.println(personne2);
    }
}
