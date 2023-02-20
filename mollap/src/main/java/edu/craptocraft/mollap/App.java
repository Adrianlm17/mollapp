package edu.craptocraft.mollap;

import edu.craptocraft.mollap.intercepting.administrador.ProgramadorTasques;
import edu.craptocraft.mollap.intercepting.client.Mollapp;
import edu.craptocraft.mollap.intercepting.filtres.Autenticacio;
import edu.craptocraft.mollap.intercepting.filtres.Autoritzacio;
import edu.craptocraft.mollap.intercepting.targets.Vehicle;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        ProgramadorTasques programadorTasques = new ProgramadorTasques(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programadorTasques.setTasca(new Autenticacio());
        programadorTasques.setTasca(new Autoritzacio());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgramadorTasques(programadorTasques);
        mollapp.enviarPeticio("Francesc");
    }
}