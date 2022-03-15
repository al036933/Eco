package es.cristiann;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String texto;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Escribe todo lo que quieras (salir para terminar)... Empieza cuando quieras ");
            texto = entrada.nextLine();
            System.out.println(texto);
        } while (!texto.equalsIgnoreCase("salir"));

        entrada.close();
    }
}
