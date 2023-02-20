package edu.craptocraft.mollap.intercepting.filtres;

public class Autoritzacio implements Filtre{

    @Override
    public void execucio(String id) {
        System.out.print("Autorización OK para: " + id.toString());
    }
    
}
