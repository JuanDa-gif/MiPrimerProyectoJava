import java.util.Scanner;
public class EjercicioParcial7 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        if (num>0 && num<100) {System.out.println("el numero tiene una cifra");}
        else if (num>=100 && num<1000) {System.out.println("el numero tiene dos cifras");}
        else if (num>=1000 && num<10000) {System.out.println("el numero tiene tres cifras");}
        else if (num>=10000 && num<100000) {System.out.println("el numero tiene mas de 3 cifras");}
        {
            System.out.println("el numero no es de una, dos, tres o mas de tres cifras");
        }
    }
    {
    }
    }
  