import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
		String vowel = "aeiouAEIOU";
		String stringVowels = "";

        Scanner input = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String word = input.nextLine();

		char[] ArrayChars = word.toCharArray();

		for(int x = 0;x < ArrayChars.length;x++){
			if(vowel.contains(""+ArrayChars[x])){ 
                stringVowels+=ArrayChars[x];
			}
		}

		System.out.println("Vogais: "+stringVowels);
        input.close();
    }
}
