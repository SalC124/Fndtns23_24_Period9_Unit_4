import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Salutations " + name + "!");
        }
    }
}