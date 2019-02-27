import.java.util.Scanner;

public class Runner {
    public main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:")
        int age = sc.nextInt();
        if(sc.hasNextInt()){
            int input = sc.nextInt();
        } else {
            System.out.print("Not a number!");
        }
    }
}
