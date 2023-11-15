/*
Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Ordenamiento_de_tres_numeros_9 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inrese el primer número");
        num1 = teclado.nextInt();
        System.out.println("Inrese el segundo número");
        num2 = teclado.nextInt();
        System.out.println("Inrese el tercer número");
        num3 = teclado.nextInt();
        if (num1 >= num2 && num2 >= num3)
            System.out.println("Los numeros ordenados de manera ascendente" + num3 + "," + num2 + "," + num1);
        else
            if (num1 >= num3 && num3 >= num2)
            System.out.println("Los numeros ordenados de manera ascendente" + num2 + "," + num3 + "," + num1);
            else 
                if (num2 >= num1 && num1 >= num3)
                   System.out.println("Los numeros ordenados de manera ascendente" + num3 + "," + num1 + "," + num2);
                else 
                    if (num2 >= num3 && num3 >= num1)
                       System.out.println("Los numeros ordenados de manera ascendente" + num1 + "," + num3 + "," + num2);
                    else
                        if (num3 >= num1 && num1 >= num2)
                           System.out.println("Los numeros ordenados de manera ascendente" + num2 + "," + num1 + "," + num3);
                        else
                            if (num3 >= num2 && num2 >= num1)
                               System.out.println("Los numeros ordenados de manera ascendente" + num1 + "," + num2 + "," + num3);          
    }

}
