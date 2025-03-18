import java .util.Scanner;
public class EjercicioParcial5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num= input.nextInt();
        System.out.println("Introduce otro número: ");
        int num2= input.nextInt();
        if (num > num2){ System.out.println("El número mayor es: " + num);}
        else if (num2 > num) {System.out.println("El número mayor es: " + num2);}
        else {System.out.println("Los números son iguales");}
    }
}   