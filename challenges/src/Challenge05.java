import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double number01 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        double number02 = input.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double number03 = input.nextDouble();

        double soma = number01 + number02 + number03;
        double media = soma / 3;

        System.out.printf("Soma: %.2f\n",soma);
        System.out.printf("Média: %.2f\n",media);

        input.close();
    }
}
