/*
 Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Categoria_Edad_6 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        if(edad >= 0 && edad <= 13)
            System.out.println("La persona es un niño");
        else 
            if(edad >= 14 && edad <= 17)
                System.out.println("La persona es un adolescente");
            else
                if (edad >= 18 && edad <= 64)
                   System.out.println("La persona es un adulto");
                else
                    System.out.println("La persona es de la tercera edad"); 
    }
    
}
