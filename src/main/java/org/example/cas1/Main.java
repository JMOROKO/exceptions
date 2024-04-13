package org.example.cas1;

public class Main {
    public static void main(String[] args) {
        try{
            EntierNaturel entierNaturel = new EntierNaturel(10);
            //entierNaturel.setVal(-1);
            entierNaturel.setVal(0);
            entierNaturel.decrementer();
        }
        catch (NombreNegatifException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCas());
        }
    }
}
