import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    public void start() {
        hiddenNum = random.nextInt(100 + 1);
        
        while (true) {
            System.out.println("Игрок " + playerOne.getName() + " введите число");
            playerOne.setNumber(scan.nextInt());
            if (playerOne.getNumber() != hiddenNum) {
                if (playerOne.getNumber() > hiddenNum) {
                    System.out.println("Число введенное игроком " + playerOne.getName() + " больше загаданного");
                    System.out.println("Игрок " + playerTwo.getName() + " введите число");
                    playerTwo.setNumber(scan.nextInt());
                    scan.nextLine();
                } else {
                    System.out.println("Число введенное игроком " + playerOne.getName() + " меньше загаданного");
                    System.out.println("Игрок " + playerTwo.getName() + " введите число");
                    playerTwo.setNumber(scan.nextInt());
                    scan.nextLine();
                }
            } else {
                System.out.println("Игрок " + playerOne.getName() + " победил");   
                break;
            }
            
            if (playerTwo.getNumber() != hiddenNum) {
                if (playerTwo.getNumber() > hiddenNum) {
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " больше загаданного");
                } else {
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " меньше загаданного");
                }
            } else {
                System.out.println("Игрок " + playerTwo.getName() + " победил");   
                break;
            }
        }
    }
}