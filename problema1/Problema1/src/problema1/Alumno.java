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
public class Alumno {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promCalificaciones;

    public Alumno(String n, double nota1, double nota2,
            double nota3) {
        nombreEstudiante = n;
        calificacionMateria1 = nota1;
        calificacionMateria2 = nota2;
        calificacionMateria3 = nota3;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public void establecerCalificacionMateria1(double n) {
        calificacionMateria1 = n;
    }

    public void establecerCalificacionMateria2(double n) {
        calificacionMateria2 = n;
    }

    public void establecerCalificacionMateria3(double n) {
        calificacionMateria3 = n;
    }

    public void establecerPromedioCalificaciones() {
        promCalificaciones = (calificacionMateria1 + calificacionMateria2
                + calificacionMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedioCalificaciones() {
        return promCalificaciones;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del estudiante: %s\n"
                + "Calificacion Materia 1: %.2f\n"
                + "Calificacion Materia 2: %.2f\n"
                + "Calificacion Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                nombreEstudiante,
                calificacionMateria1,
                calificacionMateria2,
                calificacionMateria3,
                promCalificaciones);
        return cadena;
    }

}
