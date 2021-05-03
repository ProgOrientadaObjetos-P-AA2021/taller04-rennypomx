/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Renny
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String nombre = "Renny Poma";
        double calificacion1 = 7.93;
        double calificacion2 = 10;
        double calificacion3 = 9.03;
        Alumno est1 = new Alumno(nombre, calificacion1, calificacion2,
                calificacion3);
        est1.establecerPromedioCalificaciones();
        System.out.printf("%s\n", est1);
        System.out.println("---------------------\n");
        String nombres = "Erika Tene";
        double nota1 = 6.66;
        double nota2 = 10;
        double nota3 = 9.66;
        
        Alumno est2 = new Alumno(nombres, nota1, nota2, nota3);
        est2.establecerPromedioCalificaciones();
        System.out.printf("%s\n", est2);
    }

}
