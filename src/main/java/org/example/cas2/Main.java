package org.example.cas2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> listeCompte = new ArrayList<>();
        CompteEpargne compteEpargne = new CompteEpargne(1145555, 10000, "Moroko jean-romaric");
        CompteCourant compteCourant = new CompteCourant(2245555, 12000, "Moroko jean-romaric", 25000);

        listeCompte.add(compteEpargne);
        listeCompte.add(compteCourant);

        System.out.println("-----------------AFFICHAGE DES COMPTES---------------");
        listeCompte.forEach(c -> {
            System.out.println("Solde :: "+c.afficherSolde());
            System.out.println(c);
        });
        System.out.println("-----------------SUPPRESSION DU DEUXIEME  COMPTE---------------");
        listeCompte.remove(1);

        System.out.println("-----------------AFFICHAGE DU PREMIER COMPTE APRES SUPPRESSION---------------");
        listeCompte.forEach(c -> {
            System.out.println("Solde :: "+c.afficherSolde());
            System.out.println(c);
        });
        System.out.println("Compte courant");
        System.out.println(compteCourant);

        System.out.println("Compte epargne");
        System.out.println(compteEpargne);


        System.out.println("-----------------TRANSFERT D'ARGENT DU COMPTE COURANT VERS LE COMPTE EPARGNE---------------");
        try{
            compteCourant.transfert(compteEpargne, 500);
        }
        catch (CompteInexistantException e){
            System.out.println(e.getMessage());
        }
        catch (FondInsuffisantException e){
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------AFFICHAGE DES COMPTES-------------------");
        System.out.println("-----------------COMPTE COURANT-------------------");
        System.out.println(compteCourant);
        System.out.println("-----------------COMPTE EPARGNE-------------------");
        System.out.println(compteEpargne);

        System.out.println("----------------DEPOT SUR LE COMPTE EPARGNE----------------");
        compteEpargne.deposer(10000);
        System.out.println(compteEpargne);

        System.out.println("----------------RETRAIT SUR LE COMPTE COURANT----------------");
        try{
            compteCourant.retirer(50000);
            System.out.println(compteCourant);
        }
        catch (FondInsuffisantException e){
            System.out.println(e.getMessage());
        }

        CompteBancaire compte2 = null;
        System.out.println("-----------------TRANSFERT D'ARGENT DU COMPTE COURANT VERS LE COMPTE EPARGNE---------------");
        try{
            compteCourant.transfert(compte2, 500);
        }
        catch (CompteInexistantException e){
            System.out.println(e.getMessage());
        }
        catch (FondInsuffisantException e){
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------TRANSFERT D'ARGENT DU COMPTE COURANT VERS LE COMPTE EPARGNE---------------");
        try{
            compteCourant.transfert(compteEpargne, 500000);
        }
        catch (CompteInexistantException e){
            System.out.println(e.getMessage());
        }
        catch (FondInsuffisantException e){
            System.out.println(e.getMessage());
        }

        compteEpargne.calculeInteret();

        System.out.println("AFFICHAGE COMPTE EPARGNE");
        System.out.println(compteEpargne);
    }
}
