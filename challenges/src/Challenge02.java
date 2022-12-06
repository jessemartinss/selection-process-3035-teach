import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String word = input.nextLine();
        String newWord = "";
        char letter;

        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            newWord = letter + newWord;
        }
        System.out.println("Palavra informada: "+word);
        System.out.println("Palavra em ordem reversa: " + newWord);
        input.close();
    }
}
