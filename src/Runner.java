import java.util.Scanner;

public class Runner {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please respond to the following questions using a number between 1 and 5 (inclusive). Your life expectancy will be determined shortly.");

        Quiz quiz = new Quiz("Life Expectancy");

        for(int i = 0; i< quiz.question.length; i++){
            System.out.println(quiz.question[i]);
           // quiz.answer[i] = sc.nextInt();
            if (sc.hasNextInt()){
                quiz.answer[i] = sc.nextInt();
            } else {
                System.out.println("Not a number! Your life span has been cut short due to your idiocy.");
                break;
            }
        }

        System.out.print(quiz.evaluate());
    }

}
