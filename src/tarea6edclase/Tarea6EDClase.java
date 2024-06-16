/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea6edclase;

/**
 *
 * @author AMEDECITO
 * 
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos) {     
        double Totalapagar;
        if (numProductos > 3)precioProducto -= 5;
        Calculartotalcondescuento(numProductos, precioProducto);
    }

    private void Calculartotalcondescuento(int numProductos, double precioProducto) {
        double Totalapagar;
        if (numProductos != 0) {
            Totalapagar = precioProducto * Descuentoproducto;
            System.out.println("El total a pagar es: " + Totalapagar);
            System.out.println("Enviado");
        } else {
            Totalapagar = precioProducto * 0.95;
            System.out.println("El total a pagar es: " + Totalapagar);
            System.out.println("Enviado");
        }   
    }
    private static final double Descuentoproducto = 0.8;
}