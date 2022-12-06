import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um valor em R$: ");
        double valueReal = input.nextDouble();
        double percentage5 = valueReal * 0.05;
        double percentage50 = valueReal * 0.50;
        double percentage150 = valueReal * 1.50;
        
        System.out.printf("Conforme o valor informado 5 porcento equivale a R$%.2f\n",percentage5);
        System.out.printf("Conforme o valor informado 50 porcento equivale a R$%.2f\n",percentage50);
        System.out.printf("Conforme o valor informado 150 porcento equivale a R$%.2f",percentage150);

        input.close();
    }
}
