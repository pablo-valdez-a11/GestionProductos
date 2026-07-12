/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionproductos;

/**
 *
 * @author PABLO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    System.out.println("Iniciando programa...");

    Producto producto1 = new Producto("Laptop", 15000.00, 5);

    producto1.mostrarInformacion();
ProductoElectronico producto2 = new ProductoElectronico("Celular", 12000.00, 3, "Samsung");
producto2.mostrarInformacion();
    System.out.println("Programa finalizado.");

}
    
}
