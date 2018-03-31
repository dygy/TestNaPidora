
import java.util.Scanner;
public class Pid0r {
    public static void main(String[] args) {
        int pidor, user;
        pidor = 300;
        System.out.println("Ты пидор? ");
        System.out.print("1-да , 2 - если нет");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() ) {
            do {
                user = input.nextInt();
                if(user == 1) {
                    System.out.println("Ты пидор!");
                } else {
                    if (user == 2) {
                        System.out.print("Пидора ответ, ты пидор!");
                    } else {
                        System.out.println("Ты даже отвечаешь как пидор!");
                    }
                }
            } while( user != pidor );
        }
        System.out.println("Отсоси у тракториста!");
    }
}
