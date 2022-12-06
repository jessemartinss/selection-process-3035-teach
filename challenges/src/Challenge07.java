import java.util.Scanner;

public class Challenge07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double number01 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        double number02 = input.nextDouble();

        System.out.println("Operação 1: A soma de dois números");
        System.out.println("Operação 2: A subtração de dois números");
        System.out.println("Operação 3: A multiplicação de dois números");
        System.out.println("Operação 4: A divisão de dois números");
        System.out.print("Informe o número da operação: ");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                double sum = number01 + number02;
                System.out.printf("Soma: %.2f", sum);
                break;
            case 2:
                double subtraction = number01 - number02;
                System.out.printf("Subtração: %.2f", subtraction);
                break;
            case 3:
                double multiplication = number01 * number02;
                System.out.printf("Multiplicação: %.2f", multiplication);
                break;
            case 4:
                double division = number01 / number02;
                System.out.printf("Divisão: %.2f", division);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        input.close();
    }
}
