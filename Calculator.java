import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę A ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj liczbę B ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Suma liczb A i B = " + result);
        int result2 = firstNumber - secondNumber;
        System.out.println("Odejmowanie liczb A i B = " + result2);
        int result3 = firstNumber * secondNumber;
        System.out.println("Mnożnik liczb A i B = " +result3);
        int result4 = firstNumber / secondNumber;
        System.out.println("Dzielenie liczb A i B = " +result4);
    }
}
