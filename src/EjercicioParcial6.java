import java.util.Scanner;
public class EjercicioParcial6 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        if (num>0){System.out.println("el numero es positivo");}
        else if (num<0){System.out.println("el numero es negativo");}
        else {System.out.println("el numero es cero");}
    }
    
}
