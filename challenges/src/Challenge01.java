import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        int vectorSize;
        int assistantValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho do array de números: ");
        vectorSize = input.nextInt();
        int numbers[] = new int[vectorSize];
        vectorSize = vectorSize - 1;

        for (int i = 0; i <= vectorSize; i++) {
            System.out.print("Digite o valor do " + (i + 1) + " elemento do arary:");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i <= vectorSize; i++) {
            for (int j = 0; j <= (vectorSize - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    assistantValue = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = assistantValue;
                }
            }

        }
        System.out.println("O valores ordenados dos elementos ficaram assim:");
        for (int i = 0; i <= vectorSize; i++) {
            System.out.println("Elemento: " + (i + 1) + " Valor: " + numbers[i]);

        }
        System.out.println("O segundo maior elemento é:" + numbers[vectorSize - 1]);
        input.close();
    }
}
