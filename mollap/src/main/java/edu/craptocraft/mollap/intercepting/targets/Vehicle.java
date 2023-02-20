package edu.craptocraft.mollap.intercepting.targets;

public class Vehicle implements Target{

    @Override
    public void execucio(String id) {
        System.out.print("Puerta abierta:" + id.toString());
    }
    
}
