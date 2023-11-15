/*
 Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
*/
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Mayor_de_tres_numeros_3 {
    public static void main(String[] args) {
        int numA, numB, numC, max;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inrese el primer número");
        numA = teclado.nextInt();
        System.out.println("Inrese el segundo número");
        numB = teclado.nextInt();
        System.out.println("Inrese el tercer número");
        numC = teclado.nextInt();
        if (numA > numB)
            max = numA;
        else
            max = numB;
        if (max > numC)
            System.out.println("El número mayor es:" + max);
        else
            System.out.println("El número mayor es:" + numC);          
    }
    
}
