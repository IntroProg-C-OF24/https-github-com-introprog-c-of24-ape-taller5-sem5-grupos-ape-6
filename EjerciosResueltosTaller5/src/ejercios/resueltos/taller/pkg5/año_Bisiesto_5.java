/*
Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
*/
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class año_Bisiesto_5 {
    public static void main(String[] args) {
        int anio;
        Scanner teclado = new Scanner(System.in);  
        System.out.println("ingrese un año");
        anio = teclado.nextInt();
       if (anio % 4 == 0)
           if (anio % 100 == 0) 
               if (anio % 400 == 0)
                  System.out.println("El año es bisiesto");
               else 
                    System.out.println("El año no es bisiesto");
           else
                System.out.println("El año es bisiesto");
       else
           System.out.println("El año no es bisiesto");
    }
}
