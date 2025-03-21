import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su sueldo");
        double Sueldo1= input .nextDouble();
        System.out.println("ingrese su años de antiguedad");
        double antiguedad= input.nextDouble();
        if (Sueldo1 < 500 && antiguedad >= 10 ) {Sueldo1 += (Sueldo1 * 0.2);
        System.out.println("sueldo 1" + Sueldo1);}
        if (Sueldo1 < 500 && antiguedad <=10){ Sueldo1 += (Sueldo1 * 0.05);
        System.out.println("su sueldo es" + Sueldo1);}
        if (Sueldo1 >= 500) {System.out.println("su sueldo es" + Sueldo1);
        }

    }
    

    }