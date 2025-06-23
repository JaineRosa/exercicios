package org.example;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        notas(scan);
    }

    public static void notas(Scanner scan){

        int nota;
        System.out.println("Informe uma nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota >10){
            System.out.println("Nota inválida. \nDigite uma nova nota: " );
            nota = scan.nextInt();
        }

        System.out.println("Nota válida.\nA nota digitada foi: " + nota);

    }

}