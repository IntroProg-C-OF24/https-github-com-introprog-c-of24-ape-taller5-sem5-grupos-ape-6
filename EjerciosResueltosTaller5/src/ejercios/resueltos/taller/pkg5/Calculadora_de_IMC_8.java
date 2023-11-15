/*
 Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 */
package ejercios.resueltos.taller.pkg5;
import java.util.Scanner;
public class Calculadora_de_IMC_8 {
    public static void main(String[] args) {
        double peso, altura, IMC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su altura");
        altura = teclado.nextDouble();
        IMC = peso / (altura * altura);
        if(IMC >=1 && IMC<= 19){ 
            System.out.println("Su peso es bajo");
            System.out.println("Tu IMC es: " + IMC);    
        }
        else{ 
            if(IMC >=20 && IMC<= 24){
                System.out.println("Su peso es normal");
                System.out.println("Tu IMC es: " + IMC);
            }
            else{ 
                if(IMC >=25){
                    System.out.println("Esta con sobrepeso");
                    System.out.println("Tu IMC es: " + IMC);       
                }
                else{ 
                    System.out.println("Estas con obesidad, ");
                    System.out.println("Tu IMC es: " + IMC);
                }
            }
        }    
    }
    
}
