import java.util.Scanner;
public class EjercicioParcial8 {
    public static void main(String[] args) {
        System.out.println("El numero de preguntas : ");
        Scanner input = new Scanner(System.in);
        int preguntas= input.nextInt();
        System.out.println("El numero de respuestas correctas: ");
        int correctas= input.nextInt();
        if (correctas >= (preguntas * 0.9)) {
            System.out.println("Nivel máximo alcanzado");
        }
        else if (correctas >= (preguntas * 0.75)) {
            System.out.println("Nivel medio alcanzado");
        }
        else if (correctas >= (preguntas * 0.5)) {
            System.out.println("Nivel regular alcanzado");
        }
        else {
            System.out.println("Fuera de nivel");
        }
    }
    
}
