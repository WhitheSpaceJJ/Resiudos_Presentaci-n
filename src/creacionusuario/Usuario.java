/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionusuario;

import entidades.Administrador;
import entidades.Productor;
import entidades.Transportador;
import implementaciones.FNegocio;
import implementaciones.FabricaNegocios;
import implementaciones.INegocio;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * Clase main para la creacion de un usuario administrador.
 *
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Usuario {

    /**
     * Metodo main.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        INegocio negocio = FabricaNegocios.crearFNegocio();
        String nombreUsuario = "";
        String contrasena = "";
        String correo = "";

        System.out.println("Creacion de usuario administrador");
        System.out.println("---------------------------------");
        do {
            do {
                System.out.println("Digite el nombre de usuario");
                nombreUsuario = teclado.nextLine();
                if (nombreUsuario.length() > 30) {
                    JOptionPane.showMessageDialog(null, "El nombre es demasiado largo, máximo 30 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            } while (true);
            System.out.println("---------------------------------");
            do {
                System.out.println("Digite la contraseña");
                contrasena = teclado.nextLine();
                if (contrasena.length() > 30) {
                    JOptionPane.showMessageDialog(null, "La contraseña es demasiado larga, máximo 50 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            } while (true);
            System.out.println("---------------------------------");
            do {
                System.out.println("Digite el correo");
                correo = teclado.nextLine();
                if (correo.length() > 30) {
                    JOptionPane.showMessageDialog(null, "El correo es demasiado largo, máximo 100 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (validaCorreo(correo)) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo es invalido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } while (true);

            boolean validarUsuario = negocio.validarUsuario(nombreUsuario);
            if (validarUsuario) {
                System.out.println("Nombre de Usuario ya registrado.");

            } else {

                Administrador administrador = new Administrador(nombreUsuario, contrasena, correo);
                boolean validarGuardar = negocio.guardarUsuario(1, administrador);
                if (validarGuardar) {
                    System.out.println("Se agregó el Usuario.");
                    break;
                } else {
                    System.out.println("No se pudo agregar al Usuario.");
                }
            }
        } while (true);
        System.out.println("----------------------------------------");
        System.out.println("Gracias por su registro.");
    }

    /**
     * Metodo que valida si la cadena es un correo.
     *
     * @param s La cadena a evaluar
     * @return true si es entero, false en caso contrario
     */
    private static boolean validaCorreo(String s) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(s);
        return mather.find();
    }

}
