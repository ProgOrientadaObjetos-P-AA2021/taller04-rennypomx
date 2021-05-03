/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Renny
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Mayra";
        String lastName = "Macas";
        double sueldoB = 1000;
        String cedu = "1103051957";
        Docente profesor1 = new Docente(name, lastName, sueldoB, cedu);
        profesor1 .establecerSueldoTotal();
        System.out.printf("%s\n", profesor1 );
        System.out.println("-------------------\n");
        
        String nombre = "Jeremy";
        String apellido = "Poma";
        double sueldoBasico = 400;
        String ced = "1105208258";
        Docente profesor2 = new Docente(nombre, apellido, sueldoBasico, ced);
        profesor2.establecerSueldoTotal();
        System.out.printf("%s\n", profesor2);
    }
    
}
