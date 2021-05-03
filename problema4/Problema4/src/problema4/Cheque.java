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
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque(String cliente, String banco, double vCheque) {
        nombreCliente = cliente;
        nombreBanco = banco;
        valorCheque = vCheque;
    }

    public void establecerNombreCliente(String client) {
        nombreCliente = client;
    }
    
    public void establecerNombreBanco(String banco) {
        nombreBanco = banco;
    }
    
    public void establecerValorCheque(double cheque) {
        valorCheque = cheque;
    }
    
    public void establecerComisionBanco() {
        comisionBanco = valorCheque * 0.003;
    }
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public String obtenerNombreBanco() {
        return nombreBanco;
    }
    
    public double obtenerValorCheque() {
        return valorCheque;
    }
    
    public double obtenerComisionBanco() {
        return comisionBanco;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Atributos del Cheque:\n"
                + "Nombre del Cliente: %s\n"
                + "Nomnbre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comisión del Banco: %.2f\n",
                nombreCliente,
                nombreBanco,
                valorCheque,
                comisionBanco);
        return cadena;
    }

}
