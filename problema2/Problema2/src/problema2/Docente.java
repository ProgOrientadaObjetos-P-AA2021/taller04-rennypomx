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
public class Docente {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Docente(String n, String a, double sBasic, String Id) {
        nombre = n;
        apellido = a;
        sueldoBasico = sBasic;
        cedula = Id;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerApellido(String a) {
        apellido = a;
    }
    
    public void establecerSueldoBasico(double sBas) {
        sueldoBasico = sBas;
    }
    
    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + ((sueldoBasico * 20) / 100);
    }
    
    public void establecerCedula(String ced) {
        cedula = ced;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula() {
        return nombre;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Informacion del profesor:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Cédula: %s\n",
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula);
        return cadena;
    }

}
