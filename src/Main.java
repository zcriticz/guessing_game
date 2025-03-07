import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int machineNumber = new Random().nextInt(100);
        int yourNumber = 0;
        int attempts = 0;

        while (attempts < 5) {
            System.out.println("Escolha um número entre 0 e 100:");
            yourNumber = inputValue.nextInt();
            attempts++;
            if (yourNumber == machineNumber) {
                System.out.println("Parabéns! O número que você digitou corresponde ao número escolhido pela maquina, que é: " + machineNumber);
            } else if (yourNumber > machineNumber) {
                System.out.println("O número digitado é maior que o número escolhido pela maquina. Tente novamente");
            } else {
                System.out.println("O número digitado é menor que o número escolhido pela maquina. Tente novamente");
            }
        }
        if (attempts == 5 && yourNumber != machineNumber) {
            System.out.println("Que pena... Infezlimente você excedeu o limite de tentativas, o que significa que a maquina venceu. :(");
        }
    }
}
