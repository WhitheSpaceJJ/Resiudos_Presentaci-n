    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import interfaces.INegocio;
import vista.FRegistroInicioSesion;

/**
 * Clase principal para la corrida del programa.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class PrincipalPresentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRegistroInicioSesion().setVisible(true);
            }
        });
    }

}
