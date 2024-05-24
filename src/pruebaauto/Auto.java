/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaauto;

/**
 *
 * @author Usuario
 */
class Auto {
    void acelerar() {
        System.out.println("El auto acelera de forma estándar.");
    }

    // Método sobrecargado para demostrar ligadura estática
    static void mostrarTipo(Auto auto) {
        System.out.println("Es un Auto.");
    }

    static void mostrarTipo(Sedan sedan) {
        System.out.println("Es un Sedan.");
    }

    static void mostrarTipo(Deportivo deportivo) {
        System.out.println("Es un Deportivo.");
    }
}

