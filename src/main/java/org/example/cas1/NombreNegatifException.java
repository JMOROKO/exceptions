package org.example.cas1;

public class NombreNegatifException extends Exception{
    int cas;
    public NombreNegatifException(String message) {
        super(message);
    }

    public NombreNegatifException(String message, int cause) {
        super(message);
        this.cas = cause;
    }

    public int getCas() {
        return cas;
    }
}
