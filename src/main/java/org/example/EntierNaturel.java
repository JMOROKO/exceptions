package org.example;

public class EntierNaturel {
    int val;

    public EntierNaturel(int val) throws NombreNegatifException{
        if(val<0){
            throw new NombreNegatifException("Veuillez saisir un nombre positif", this.val);
        }
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException{
        if(val<0){
            throw new NombreNegatifException("Veuillez saisir un nombre positif", this.val);
        }
        this.val = val;
    }
    public void decrementer() throws NombreNegatifException{
        this.val--;
        if(this.val<0) throw new NombreNegatifException("Impossible de décrémenter un nombre négatif", this.val);
    }
}
