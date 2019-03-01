import java.util.Scanner;

public class Runner {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("How long will you live?");

        Quiz quiz = new Quiz("Life Expectancy");

        for(int i = 0; i< quiz.question.length; i++){
            System.out.println(quiz.question[i]);
            quiz.answer[i] = sc.nextInt();
            //System.out.println(quiz.answer[i]);
        }

        System.out.print(quiz.process());
    }

}
