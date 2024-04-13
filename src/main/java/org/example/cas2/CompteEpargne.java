package org.example.cas2;

public class CompteEpargne extends CompteBancaire{
    static final double TAUX_INTERET = 3.5;

    public CompteEpargne(int numeroCompte, double solde, String nomTitulaire) {
        super(numeroCompte, solde, nomTitulaire);
    }

    public void calculeInteret(){
        this.solde = this.solde * (1+TAUX_INTERET/100);
    }
}
