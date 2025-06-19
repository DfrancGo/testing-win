//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el radio
        System.out.print("Introduce el radio de la esfera en metros: ");
        double radio = scanner.nextDouble();

        // Calcular el volumen
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        // Mostrar el resultado
        System.out.printf("El volumen de la esfera con radio %.2f es %.2f\n", radio, volumen);

        scanner.close();
    }
}
