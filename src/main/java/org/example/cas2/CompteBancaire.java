package org.example.cas2;

public class CompteBancaire {
    int numeroCompte;
    double solde;
    String nomTitulaire;

    public double deposer(double montant){
        this.solde += montant;
        return this.solde;
    }
    public double retirer(double montant) throws FondInsuffisantException{
        if(this.solde < montant) throw new FondInsuffisantException("Impossible d'effectuer le retrait. Fond insuffisant");
        this.solde =  this.solde - montant;
        return this.solde;
    }

    public void transfert(CompteBancaire compteACrediter, double montant)
            throws CompteInexistantException,FondInsuffisantException{
        if(this.getSolde() < montant){
            throw new FondInsuffisantException("Votre fond est insuffisant, il nous est donc impossible le transfert.");
        }
        if(compteACrediter == null){
            throw new CompteInexistantException("Le compte qui doit récevoir l'argent est inexistant.");
        }

        this.retirer(montant);
        compteACrediter.deposer(montant);
    }
    public double afficherSolde(){
        return this.solde;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numeroCompte=" + numeroCompte +
                ", solde=" + solde +
                ", nomTitulaire='" + nomTitulaire + '\'' +
                '}';
    }
    public CompteBancaire() {
    }
    public CompteBancaire(int numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }
    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }
}
