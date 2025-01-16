package fr.epsi.banque.entites;

public class Compte {

    private int numero;
    private double solde;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte n°" + numero + " : " + solde + " €";
    }

}
