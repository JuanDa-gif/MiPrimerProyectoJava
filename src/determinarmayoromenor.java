import java.util.Scanner;
public class determinarmayoromenor {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese el primer numero");
    int num1 = scanner.nextInt();
    System.out.println("ingrese el segundo numero");
    int num2 = scanner.nextInt();
    System.out.println("ingrese el tercer numero"); 
    int num3 = scanner.nextInt();

    if (num1 > num2 && num1 > num3) {
    System.out.println("El numero mayor es: " + num1);
} else if (num2 > num1 && num2 > num3) {
    System.out.println("El numero mayor es: " + num2);
} else {
    System.out.println("El numero mayor es: " + num3);
    scanner.close();

}
}
}
