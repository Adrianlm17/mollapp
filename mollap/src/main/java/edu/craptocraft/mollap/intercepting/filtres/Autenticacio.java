package edu.craptocraft.mollap.intercepting.filtres;

public class Autenticacio implements Filtre{

    @Override
    public void execucio(String id) {
        System.out.print("Autenticación OK para " + id.toString());
    }
    
}
