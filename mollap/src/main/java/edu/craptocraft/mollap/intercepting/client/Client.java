package edu.craptocraft.mollap.intercepting.client;

import edu.craptocraft.mollap.intercepting.administrador.ProgramadorTasques;

public interface Client {
    
    public void setProgramadorTasques(ProgramadorTasques programador);

    public void enviarPeticio(String peticion);

}
