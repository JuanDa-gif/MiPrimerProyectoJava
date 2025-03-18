import java.util.Scanner;
public class EjercicioParcial9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("ingrese una nota: ");
        int not= input.nextInt();
        System.out.println("ingrese otra nota: ");
        int not2= input.nextInt();
        System.out.println("ingrese otra nota: ");
        int not3= input.nextInt();
        int promedio= (not + not2 + not3) / 3;
        if (promedio >= 7) {
            System.out.println("El alumno promocionado");
        }
        else if (promedio >=4 && promedio>7) {System.out.println("promocionado regular");}
        else if (promedio < 4) {System.out.println("reprobado");}

        }
    }
    

