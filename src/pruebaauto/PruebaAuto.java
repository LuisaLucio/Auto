/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaauto;

/**
 *
 * @author Usuario
 */
public class PruebaAuto {

    public static void main(String[] args) {
        Auto miAuto = new Sedan();
        Auto miAuto1 = new Deportivo();
        miAuto.acelerar();  // Ligadura dinámica: Se decide en tiempo de ejecución
        miAuto1.acelerar();
        
        Auto.mostrarTipo(miAuto);
        // Ligadura estática: Se decide en tiempo de compilación. Imprime "Es un Auto."

        // Aquí, aunque `miAuto` es realmente un `Sedan`, la ligadura estática hace que se utilice
        // la versión del método `mostrarTipo(Auto auto)` porque el tipo de la variable `miAuto` es `Auto`.
    
    }
    
}
