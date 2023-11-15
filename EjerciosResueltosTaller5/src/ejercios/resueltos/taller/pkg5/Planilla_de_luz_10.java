/*
Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
*/
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Planilla_de_luz_10 {
    public static void main(String[] args) {
        double costoMinuto, minutosMes, edad, descuento, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingresa el costo por minuto:");
        costoMinuto = teclado.nextDouble();
        System.out.println("Ingresa número de minutos consumidos en el mes:");
        minutosMes = teclado.nextDouble();
        System.out.println("ingrese su Edad");
        edad = teclado.nextDouble();
        valorPlanilla = costoMinuto * minutosMes;
        if (edad > 65){
            descuento = valorPlanilla * 0.1;
            valorPlanilla = valorPlanilla - descuento;
        }
        System.out.println("El valor total a cancelar de la planilla de luz es:" + valorPlanilla);
    }
}
