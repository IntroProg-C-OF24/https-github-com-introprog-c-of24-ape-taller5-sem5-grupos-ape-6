/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere y el precio unitario. 
Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
*/
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Costo_de_un_pedido_11 {
    public static void main(String[] args) {
        String producto;
        double cantidad, precioUnitario, descuento, costoTotal;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el nombre del producto");
        producto = teclado.nextLine();
        System.out.println("Ingrese la cantidad que requiere");
        cantidad = teclado.nextDouble();
        System.out.println("Ingrese el precio unitario del Producto");
        precioUnitario = teclado.nextDouble();
        costoTotal = cantidad*precioUnitario;
        if (cantidad > 50){
            descuento = costoTotal * 0.15;
            costoTotal = costoTotal - descuento;
        } 
        System.out.println("El costo total es " + costoTotal);
    }
}
