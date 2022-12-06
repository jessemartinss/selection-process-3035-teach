
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Challenge04 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Formato da data: ex:05/12/2022");
		System.out.print("Digite uma data no formato acima: ");
		String wordDay = input.nextLine();

        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Date day = formatDate.parse(wordDay);
        GregorianCalendar calendarDate = new GregorianCalendar();
        calendarDate.setTime(day);
        int dayOfWeek = calendarDate.get(GregorianCalendar.DAY_OF_WEEK);
        
        switch (dayOfWeek) {
            case 1:
              System.out.println("Domingo");
              break;
            case 2:
              System.out.println("Segunda-feira");
              break;
            case 3:
              System.out.println("Terça-feira");
              break;
            case 4:
              System.out.println("Quarta-feira");
              break;
            case 5:
              System.out.println("Quinta-feira");
              break;
            case 6:
              System.out.println("Sexta-feira");
              break;
            case 7:
              System.out.println("Sábado");
              break;
          }
          input.close();
        }
}
