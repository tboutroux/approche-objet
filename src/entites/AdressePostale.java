package entites;

public class AdressePostale {

    private int numeroRue;
    private String libelleRue;
    private int codePostal;
    private String ville;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void affiche() {
        System.out.println(numeroRue + " " + libelleRue + " " + codePostal + " " + ville);
    }

}
