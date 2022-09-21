
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite otro número: ");
        int num2 = Integer.parseInt(entrada.nextLine());
        System.out.print("El número mayor es: ");
        System.out.print(num1 > num2 ? num1 : num2);
        System.out.println("");
    }
}
