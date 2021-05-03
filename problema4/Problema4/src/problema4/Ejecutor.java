/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author josef
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cliente1 = "Franklin Poma";
        String banco1 = "JEP";
        double vCheque1 = 1000;
        Cheque cheque1 = new Cheque(cliente1, banco1, vCheque1);
        cheque1.establecerComisionBanco();
        System.out.printf("%s\n", cheque1);
        System.out.println("------------------------\n");
        
        String cliente2 = "Veronica Medina";
        String banco2 = "Banco de Guayaquil";
        double vCheque2 = 4620;
        Cheque cheque2 = new Cheque(cliente2, banco2, vCheque2);
        cheque2.establecerComisionBanco();
        System.out.printf("%s\n", cheque2);
    }
    
}
