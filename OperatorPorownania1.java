import java.util.Scanner;

public class OperatorPorownania1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę A");
        int firstNumber = scanner.nextInt();
        System.out.println("podaj liczbę B");
        int secondNumber = scanner.nextInt();

        boolean result = firstNumber > secondNumber;
        boolean result2 = firstNumber < secondNumber;
        boolean result3 = firstNumber == secondNumber;
        boolean result4 = firstNumber <= secondNumber;
        boolean result5 = firstNumber >= secondNumber;
        boolean result6 = firstNumber != secondNumber;

        System.out.println("A > B : " + (firstNumber > secondNumber));
        System.out.println("A < B : " + (firstNumber < secondNumber));
        System.out.println("A = B : " + (firstNumber == secondNumber));
        System.out.println("A <= B : " + (firstNumber <= secondNumber));
        System.out.println("A >= B : " + (firstNumber >= secondNumber));
        System.out.println("A =/= B : " + (firstNumber != secondNumber));
    }
}
