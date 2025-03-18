import java.util.Scanner;
public class NumeroPerfectos {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       System.out.println("Introduce un número: ");
       int num= input.nextInt();
       boolean esPerfecto = false;
       if (num > 1) {
           int SumDiv = 1;
           for (int i = 2; i <= Math.sqrt(num) ; i++) {
               if( num % i == 0) {
                   SumDiv += i;
                if ( i != num / i) { 
                    SumDiv += num / i;
                }
                 System.out.println("el número " + num + " es perfecto");
                
               }
           
       }
}
}
}