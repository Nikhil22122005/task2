import java.util.Scanner;

public class guessingnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int b = 0;
        while(true) {
            int random = (int) (Math.random() * 100) + 1;

            System.out.println("A number is choosen from 1-100 ");
            System.out.println(" Choose a Random Number within 5 Trial");
            System.out.println("If u want to Exit then Type : 0");
            for (int i = 0; i < 5; i++) {
                String intro = "Guess the number ";
                int a = sc.nextInt();
                if (a == random) {
                    System.out.println("You guessed the number Right");
                    return;
                }
                if (a == 0) {
                    System.out.println("Game Over");
                    return;
                }
            }
            System.out.println("Right answer is :" + random);
            b++;
            System.out.println("Your score is :" + b);
        }
    }
}
