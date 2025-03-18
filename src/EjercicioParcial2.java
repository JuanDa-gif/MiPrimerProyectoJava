import java.util.Scanner;
public class EjercicioParcial2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("introduce la primera nota: ");
        int not= input.nextInt();
        System.out.println("introduce la segunda nota: ");
        int not2= input.nextInt();
        System.out.println("introduce la tercera nota: ");
        int not3= input.nextInt();
        int promedio= (not + not2 + not3) / 3;
        if (promedio >= 7) {
            System.out.println("El alumno aprobó con un promedio de: " + promedio);
        }
        else {
            System.out.println("El alumno reprobó con un promedio de: " + promedio);
        }   
    }
}