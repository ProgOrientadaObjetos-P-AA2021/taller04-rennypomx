/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author Renny
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cedula1 = "11037035668";
        String marca1 = "Toyota";
        int fabricacion1 = 1985;
        double vehiculo1 = 450000;
        Automotor auto1 = new Automotor(cedula1, marca1, fabricacion1, vehiculo1);
        auto1.establecerValorMatricula();
        System.out.printf("%s\n", auto1);
        System.out.println("------------------------\n");
        
        String cedula2 = "110520258";
        String marca2 = "Hyunday";
        int fabricacion2 = 1960;
        double vehiculo2 = 980000;
        Automotor auto2 = new Automotor(cedula2, marca2, fabricacion2, vehiculo2);
        auto2.establecerValorMatricula();
        System.out.printf("%s\n", auto2);
    }
    
}
