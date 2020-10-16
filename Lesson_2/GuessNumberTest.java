import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args){
        String again;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        do {
            int hiddenNum = random.nextInt(100 + 1);
        
            System.out.println("Введите имя первого игрока и загаданное число");
            Player playerOne = new Player(scan.nextLine(),scan.nextInt());
            scan.nextLine();
            System.out.println("Введите имя второго игрока и загаданное число");
            Player playerTwo = new Player(scan.nextLine(),scan.nextInt());
            
            
            
            while (playerOne.getNumber() != hiddenNum && playerTwo.getNumber() != hiddenNum) {
                GuessNumber playerOneGuess = new GuessNumber(playerOne.getName(),playerOne.getNumber(),hiddenNum);
                if (playerOne.getNumber() != hiddenNum) {
                    GuessNumber playerTwoGuess = new GuessNumber(playerTwo.getName(),playerTwo.getNumber(),hiddenNum);
                }

                if (playerOne.getNumber()!=hiddenNum && playerTwo.getNumber()!=hiddenNum) {
                    System.out.println("Игрок " + playerOne.getName() + " введите новое число");
                    playerOne.setNumber(scan.nextInt());
                    System.out.println("Игрок " + playerTwo.getName() + " введите новое число");
                    playerTwo.setNumber(scan.nextInt());
                    scan.nextLine();
                }
            }
            
            
            if (playerOne.getNumber()==hiddenNum && playerTwo.getNumber()!=hiddenNum) {
                System.out.println("Игрок " + playerOne.getName() + " победил");
            } else if (playerTwo.getNumber()==hiddenNum && playerOne.getNumber()!=hiddenNum) {
                System.out.println("Игрок " + playerTwo.getName() + " победил");
            } else {
                System.out.println("Игрок " + playerOne.getName() + " победил");
            }
            
            do {
                    System.out.print("Хотите продолжить? [yes/no]: ");
                    again = scan.nextLine();
            } while (!again.equals("yes") && !again.equals("no"));
        } while (again.equals("yes"));
    }
}