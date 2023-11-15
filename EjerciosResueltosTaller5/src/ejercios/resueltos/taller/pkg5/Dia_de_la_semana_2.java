/*
 Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Dia_de_la_semana_2 {
    public static void main(String[] args) {
        int dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        dia = teclado.nextInt();
        if (dia == 1)
            System.out.println("Lunes");
        else
            if(dia == 2)
                System.out.println("Martes");
            else
                if (dia ==  3)
                    System.out.println("Miercoles ");
                else
                    if (dia == 4)
                        System.out.println("Jueves");
                    else
                        if (dia == 5)
                            System.out.println("Viernes");
                        else
                            if (dia == 6)
                                System.out.println("Sábado");
                            else
                                if (dia == 7)
                                    System.out.println("Domingo");
                                else
                                    System.out.println("El número ingresado no pertenece a un día de la semana");                  
    }    
}
