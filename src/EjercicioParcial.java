import java.util.Scanner;
public class EjercicioParcial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num= input.nextInt();
        System.out.println("Introduce otro número: ");
        int num2= input.nextInt();
        if (num > num2) { 
           int Suma1= num + num2;
            int Suma2= num - num2;
            System.out.println("La suma de los números es: " + Suma1);
            System.out.println("La resta de los números es: " + Suma2);
        }
        else {
             int Producto1= num * num2;
             int Dividio1= num / num2;
            System.out.println("El producto de los números es: " + Producto1);
            System.out.println("La división de los números es: " + Dividio1);
        }
    }
}