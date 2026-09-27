/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Logica.Calculadora;

/**
 *
 * @author Usuario
 */
public class CalculadoraDeNotas {

    public static void main(String[] args) {

        Calculadora miCalculadora = new Calculadora("", "", 0, 0);

        int cantidadEstudiantes = miCalculadora.pedirNumeroEstudiantes();

        Calculadora[] estudiantes = new Calculadora[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {

            estudiantes[i] = miCalculadora.ingresarEstudiante();

        }

        double notaLimite = miCalculadora.pedirNotaLimite();

        double cifraIncremento = miCalculadora.pedirCifraIncremento();

        for (int i = 0; i < cantidadEstudiantes; i++) {

            estudiantes[i].incrementarNotaDesarrollo(cifraIncremento);
            estudiantes[i].calcularDefinitiva();

        }

        for (int i = 0; i < cantidadEstudiantes; i++) {

            estudiantes[i].mostrarSiSuperaLimite(notaLimite);

        }
    }
}