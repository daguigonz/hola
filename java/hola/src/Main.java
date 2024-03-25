
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre completo: ");
        String name = scanner.nextLine();

        System.out.print("Mi edad es: ");
        String age = scanner.nextLine();

        String response = String.format("Mi nombre es %s y tengo 😎 %s años de edad.", name, age);
        System.out.println(response);

    }
}