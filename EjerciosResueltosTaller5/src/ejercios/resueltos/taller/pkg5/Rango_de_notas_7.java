
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Rango_de_notas_7 {
    public static void main(String[] args) {
        int nota;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la calificación");
        nota = teclado.nextInt();
        if(nota < 100 && nota >= 90)
            System.out.println("Su rango de calificación es A");
        else 
            if(nota < 89 && nota >= 80)
                System.out.println("Su rango de calificación es B");
            else
                if (nota < 79 && nota >= 70)
                   System.out.println("Su rango de calificación es C");
                else
                    System.out.println("Su rango de calificación es D");
    }
}
