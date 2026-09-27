/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    private String id;
    private String nombre;
    private double notaDesarrollo;
    private double notaMatematica;
    private double definitiva;

    public Calculadora(String id, String nombre, double notad, double notam) {

        this.id = id;
        this.nombre = nombre;
        this.notaDesarrollo = notad;
        this.notaMatematica = notam;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double calcularDefinitiva() {
        definitiva = notaMatematica * 0.4 + notaDesarrollo * 0.6;
        return definitiva;
    }

    public void mostrarNota() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre
                + "\nCodigo: " + id
                + "\nNota definitiva: " + definitiva);
    }

    public int pedirNumeroEstudiantes() {
        int cantidad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el número de estudiantes")
        );
        return cantidad;
    }

    public Calculadora ingresarEstudiante() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");

        String id = JOptionPane.showInputDialog("Ingrese el código del estudiante");

        double notad = Double.parseDouble(
                JOptionPane.showInputDialog("Digite la nota de Desarrollo")
        );

        double notam = Double.parseDouble(
                JOptionPane.showInputDialog("Digite la nota de Matemáticas")
        );

        Calculadora estudiante = new Calculadora(id, nombre, notad, notam);

        estudiante.calcularDefinitiva();

        return estudiante;
    }

    public double pedirNotaLimite() {
        double notaLimite;
        do {
            notaLimite = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la notaLimite (entre 0.0 y 4.9)")
            );
        } while (notaLimite < 0.0 || notaLimite > 4.9);
        return notaLimite;
    }

    public void mostrarSiSuperaLimite(double notaLimite) {
        if (definitiva > notaLimite) {
            JOptionPane.showMessageDialog(null,
                    "Codigo: " + id
                    + "\nNombre: " + nombre
                    + "\nNota definitiva: " + definitiva);
        }
    }

    public double pedirCifraIncremento() {
        double cifra;
        do {
            cifra = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la cifra de incremento (entre 0.0 y 0.5)")
            );
        } while (cifra < 0.0 || cifra > 0.5);
        return cifra;
    }
}