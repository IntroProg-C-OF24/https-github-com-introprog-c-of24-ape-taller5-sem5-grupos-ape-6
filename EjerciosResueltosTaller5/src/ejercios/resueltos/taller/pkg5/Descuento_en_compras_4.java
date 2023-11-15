/*
Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Descuento_en_compras_4 {
    public static void main(String[] args) {
        double precioProducto, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        precioProducto = teclado.nextDouble();  
        if  (precioProducto > 100){ 
            descuento = (precioProducto*10/100);
            precioProducto = precioProducto - descuento;
            System.out.println("El precio final con descuento es:" + precioProducto);
        }
        else 
            System.out.println("No hay descuento, el precio final es:" + precioProducto);
    }
    
}
