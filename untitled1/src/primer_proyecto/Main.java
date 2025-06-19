package primer_proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hola mundo");
        //Tipos de datos: enteros (int), decimales (float, double), boolean (true/false), caracteres (char), texto (string)
        //tipo de dato + nombre;
        int num = 10;
        float dec = 10.2f; //decimales pequeños
        double dec2 = 20.35; //decimales grandes
        boolean encendido = false;
        char caracter = 'f'; //sólo para un caracter
        String texto = "hola mundo";

        System.out.println(texto);

        num = 5;

        System.out.println(num);

        float decimal = 3.14f;
        int casteo = (int) decimal;
        System.out.println(casteo); //pasar de un tipo de variable a otro

        Scanner scn = new Scanner(System.in);
        String text;
        //donde lo voy a guardar = lo que quiero guardar
        System.out.println("Introduzca un nombre");
        text = scn.next();
        System.out.println("Hola me llamo "+text);
        /*Operadores logicos:
        * + Sumar
        * - Restar
        * * Multiplicar
        * / Dividir
        * % Resto de división
        * && AND, ambas condiciones se debn cumplir
        * || OR
        * <, >, <=, >=, ==, !=
        */
        Scanner scn= new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion, resto;
        float division;

        System.out.println("Introduzca un número");
        num1 = scn.nextInt();

        System.out.println("Introduzca otro número");
        num2 = scn.nextInt();

        //donde lo quiero guardar = lo que quiero guardar
        suma = num1 + num2;
        resta = num1 - num2;
        division = (float) num1 / num2; //porque entero/entero= entero, se usa float para que tenga en cuenta posibles decimales
        multiplicacion = num1 * num2;
        resto = num1 % num2;
        System.out.println("El resultado de la suma de "+num1+" y "+num2+" es: " +suma);
        System.out.println("El resultado de la resta de "+num1+" y "+num2+" es: " +resta);
        System.out.println("El resultado de la división de "+num1+" y "+num2+" es: " +division);
        System.out.println("El resultado de la multiplicación de "+num1+" y "+num2+" es: " +multiplicacion);
        System.out.println("El resultado del resto de "+num1+" y "+num2+" es: " +resto);



    }
}
