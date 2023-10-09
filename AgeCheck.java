import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        System.out.println("Witaj");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int firstNumber = scanner.nextInt();

        if (firstNumber >= 18) {
            System.out.println("Dziękujemy za zakupy!");
        }
         else if (firstNumber <0) {
            System.out.println("wprowadż  poprawną wartość");
        }
         else {
            System.out.println("Nie masz ukończonych 18-tu lat, nie możesz kupić alkocholu!");
        }
    }
}
