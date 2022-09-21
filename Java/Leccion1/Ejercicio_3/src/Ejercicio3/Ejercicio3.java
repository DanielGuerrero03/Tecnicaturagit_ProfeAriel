
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el alto del rectangulo: ");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el ancho del rectangulo: ");
        int ancho = Integer.parseInt(entrada.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Área: "+ area);
        System.out.println("Perímetro: "+ perimetro);
    }
}
