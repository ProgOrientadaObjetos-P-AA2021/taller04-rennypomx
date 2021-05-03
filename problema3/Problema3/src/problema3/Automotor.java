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
public class Automotor {

    private String cedulaDueño;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedula, String marca, int añoFa,
            double vehiculo) {
        cedulaDueño = cedula;
        marcaVehiculo = marca;
        añoFabricacion = añoFa;
        valorVehiculo = vehiculo;
    }

    public void establecerCedulaDueno(String cedula) {
        cedulaDueño = cedula;
    }

    public void establecerMarcaVehiculo(String marca) {
        marcaVehiculo = marca;
    }

    public void establecerAnoFabricacion(int añoFa) {
        añoFabricacion = añoFa;
    }

    public void establecerValorVehiculo(double vehiculo) {
        valorVehiculo = vehiculo;
    }

    public void establecerValorMatricula() {
        int numeroAnos = 2021 - añoFabricacion;
        valorMatricula = ((valorVehiculo * 0.002) / 100) * numeroAnos;
    }
    
    public String obtenerCedulaDueno() {
        return cedulaDueño;
    }
    
    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }
    
    public int obtenerAnoFabricacion() {
        return añoFabricacion;
    }
    
    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Datos del vehículo:\n"
                + "Cédula del Dueño: %s\n"
                + "Marca: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor vehículo: %.2f\n"
                + "Valor Matrícula: %.2f\n",
                cedulaDueño,
                marcaVehiculo,
                añoFabricacion,
                valorVehiculo,
                valorMatricula);
        return cadena;
    }

}
