package org.example.cas2;

public class CompteCourant extends CompteBancaire{
    private double decouvert;

    public CompteCourant(int numeroCompte, double solde, String nomTitulaire, double decouvert) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
