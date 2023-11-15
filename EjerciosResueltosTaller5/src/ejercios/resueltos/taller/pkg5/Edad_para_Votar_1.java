/*
Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
*/
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Edad_para_Votar_1 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        if (edad >= 18)
            System.out.println("Puede votar");
        else
            System.out.println("No puede votar");
        
    }
    
}
