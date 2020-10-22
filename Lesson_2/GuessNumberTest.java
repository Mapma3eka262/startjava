import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args){
        String again;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        do {
            int hiddenNum = random.nextInt(100 + 1);
        
            System.out.println("Введите имя первого игрока");
            Player playerOne = new Player(scan.nextLine(),0);
            System.out.println("Введите имя второго игрока");
            Player playerTwo = new Player(scan.nextLine(),0);
            
            GuessNumber guessNumber = new GuessNumber(playerOne.getName(),playerTwo.getName(),hiddenNum);
            
            while (playerOne.getNumber() != hiddenNum && playerTwo.getNumber() != hiddenNum) {
                System.out.println("Игрок " + playerOne.getName() + " введите число");
                playerOne.setNumber(scan.nextInt());
                System.out.println("Игрок " + playerTwo.getName() + " введите число");
                playerTwo.setNumber(scan.nextInt());
                scan.nextLine();
                
                guessNumber.Guess(playerOne.getNumber(),playerTwo.getNumber());
            }
            
            do {
                    System.out.print("Хотите продолжить? [yes/no]: ");
                    again = scan.nextLine();
            } while (!again.equals("yes") && !again.equals("no"));
        } while (again.equals("yes"));
    }
}