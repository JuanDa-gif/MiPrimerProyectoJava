import java.util.Scanner;
public class EjercicioParcial4 {
    public static void main(String[] args) {
       System.out.println("introduzca el sueldo de la persona: ");
         Scanner input = new Scanner(System.in);
            double sueldo= input.nextDouble();
        if (sueldo > 3000){ System.out.println("el sueldo es mayor a 3000 debe abonar impuestos ")
        ;}
        else {System.out.println("el sueldo es menor a 3000 no debe abonar impuestos");}
    }
}