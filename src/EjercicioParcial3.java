import java.util.Scanner;
public class EjercicioParcial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero de 1 o dos digitos: ");
        int num= input.nextInt();
        if (num > 0 && num < 10) {
            System.out.println("El número tiene un digito");
        }
        else if (num >= 10 && num < 100) {
            System.out.println("El número tiene dos digitos");
        }
        else {
            System.out.println("El número no es de uno o dos digitos");
       
        }
    }
    
}
