/*
En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Hosterias_13 {
    public static void main(String[] args) {
        int dias;
        double costoHabitacion, descuento, subtotal, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar número de días que va a hospedarse");
        dias = teclado.nextInt();
        System.out.println("Ingresar costo de la habitacion");
         costoHabitacion= teclado.nextDouble();
        subtotal = dias * costoHabitacion;
        total = dias * costoHabitacion;
        descuento = 0;
        if (dias > 15) {
            descuento = total * 0.2;
            total = total - descuento;
        } 
        else {
            if (dias > 10) {
                descuento = total * 0.15;
                total = total - descuento;
            } 
            else {
                if (dias > 5) {
                    descuento = total * 0.10;
                    total = total - descuento;
                }
                
            }
        }
        System.out.println("El subtotal a pagar es: " + subtotal);
        System.out.println("El descuento es del: " + descuento);
        System.out.println("El total a pagar es: " + total);
    }
}
