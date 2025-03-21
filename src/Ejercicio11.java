import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        int notasMayores = 0;
        int notasMenores = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una nota:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nota " + i + ": ");
            double nota = input.nextDouble();
            if (nota >= 7) {
                notasMayores++;
            } else {
                notasMenores++;
            }
        }
        System.out.println("El número de notas mayores o iguales a 7 son: " + notasMayores);
        System.out.println("El número de notas menores a 7 son: " + notasMenores);
        input.close();
    }
}
