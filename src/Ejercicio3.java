import java.util.Scanner ;
public class Ejercicio3 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
   System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar y 4 para dividir ");
   int pedido = leer.nextInt();

   switch (pedido) {
    case 1 :
    System.out.println("ingrse primer numero ");
    int num1 = leer.nextInt();
    System.out.println("ingrese segundo numero ");
    int num2 = leer.nextInt();

    float rta = num1 + num2;
    System.out.println("el resultado de la suma es "+rta); 
        
break;

    case 2 :
    System.out.println("ingrse primer numero ");
    int num3 = leer.nextInt();
    System.out.println("ingrese segundo numero ");
    int num4 = leer.nextInt();

    
    System.out.println("el resultado de la resta es "+(num3 - num4));

break;

    case 3 :
    
    System.out.println("ingrse primer numero ");
    int num5 = leer.nextInt();
    System.out.println("ingrese segundo numero ");
    int num6 = leer.nextInt();

    
    System.out.println("el resultado de la multiplicacion es "+(num5 * num6));

break;

    case 4 :
    System.out.println("ingrse primer numero ");
    int num7 = leer.nextInt();
    System.out.println("ingrese segundo numero ");
    int num8 = leer.nextInt();

    float rta2 = num7 / num8;
    System.out.println("el resultado de la division es "+rta2); 

   }
   }
}