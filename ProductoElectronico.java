/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionproductos;

/**
 *
 * @author PABLO
 */

public class ProductoElectronico extends Producto {

    String marca;

    public ProductoElectronico(String nombre, double precio, int cantidad, String marca) {
        super(nombre, precio, cantidad);
        this.marca = marca;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Marca: " + marca);
    }
}
    

