/*
Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Datos_Automovil_12 {
    public static void main(String[] args) {
        String marca, origen;
        double impuesto, precioVenta;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa la marca del carro");
        marca = teclado.nextLine();
        System.out.println("Ingresa el pais de origen del carro");
        origen= teclado.nextLine();
        System.out.println("Ingresa el costo del carro");
        precioVenta = teclado.nextDouble();
        if (origen.equals("Alemania")) {
            impuesto = precioVenta * 0.2;
            precioVenta = precioVenta + impuesto;
            System.out.println("El impuesto por pagar es:" + impuesto);
            System.out.println("El precio de Venta es: " + precioVenta);
        }  
        else{
            if (origen.equals("Japón")) {
            impuesto = precioVenta * 0.3;
            precioVenta = precioVenta + impuesto;
            System.out.println("El impuesto por pagar es:" + impuesto);
            System.out.println("TOTAL: " + precioVenta);
            }
            else{
                if (origen.equals("Italia")) {
                   impuesto = precioVenta * 0.15;
                   precioVenta = precioVenta + impuesto;
                   System.out.println("El impuesto por pagar es:" + impuesto);
                   System.out.println("El precio de Venta es: " + precioVenta);
                }
                else{
                    if (origen.equals("USA")) {
                        impuesto = precioVenta * 0.08;
                        precioVenta = precioVenta + impuesto;
                        System.out.println("El impuesto a pagar es: " + impuesto);
                        System.out.println("El precio de venta es: " + precioVenta);
                    }
                }
            }            
        }    
    }
}
