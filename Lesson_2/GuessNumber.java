import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    Player playerOne;
    Player playerTwo;
    
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    public void start() {
        hiddenNum = random.nextInt(100 + 1);
        
        while (true) {
            System.out.println("Игрок " + playerOne.getName() + " введите число");
            playerOne.setNumber(scan.nextInt());
            if (playerOne.getNumber() == hiddenNum) {
                System.out.println("Игрок " + playerOne.getName() + " победил");   
                break;
            } else if (playerOne.getNumber() > hiddenNum){
                System.out.println("Число введенное игроком " + playerOne.getName() + " больше загаданного");
                System.out.println("Игрок " + playerTwo.getName() + " введите число");
                playerTwo.setNumber(scan.nextInt());
                scan.nextLine();
                if (playerTwo.getNumber() == hiddenNum) {
                    System.out.println("Игрок " + playerTwo.getName() + " победил");
                    break;
                } else if (playerTwo.getNumber() > hiddenNum){
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " больше загаданного");
                } else if (playerTwo.getNumber() < hiddenNum){
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " меньше загаданного");
                }
            } else if (playerOne.getNumber() < hiddenNum){
                System.out.println("Число введенное игроком " + playerOne.getName() + " меньше загаданного");
                System.out.println("Игрок " + playerTwo.getName() + " введите число");
                playerTwo.setNumber(scan.nextInt());
                scan.nextLine();
                if (playerTwo.getNumber() == hiddenNum) {
                    System.out.println("Игрок " + playerTwo.getName() + " победил");
                    break;
                } else if (playerTwo.getNumber() > hiddenNum){
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " больше загаданного");
                } else if (playerTwo.getNumber() < hiddenNum){
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " меньше загаданного");
                }
            }
        }
    }
}




