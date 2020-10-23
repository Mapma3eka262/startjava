import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private String playerOneName;
    private String playerTwoName;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    
    public GuessNumber(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }
    
    public void start() {
        hiddenNum = random.nextInt(100 + 1);
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        
        while (playerOne.getNumber() != hiddenNum && playerTwo.getNumber() != hiddenNum) {
            System.out.println("Игрок " + playerOne.getName() + " введите число");
            playerOne.setNumber(scan.nextInt());
            if (playerOne.getNumber() == hiddenNum) {
                System.out.println("Игрок " + playerOneName + " победил");            
            } else if (playerOne.getNumber() > hiddenNum){
                System.out.println("Число введенное игроком " + playerOneName + " больше загаданного");
                System.out.println("Игрок " + playerTwo.getName() + " введите число");
                playerTwo.setNumber(scan.nextInt());
                scan.nextLine();
                if (playerTwo.getNumber() == hiddenNum) {
                System.out.println("Игрок " + playerTwoName + " победил");
                } else if (playerTwo.getNumber() > hiddenNum){
                System.out.println("Число введенное игроком " + playerTwoName + " больше загаданного");
                } else if (playerTwo.getNumber() < hiddenNum){
                System.out.println("Число введенное игроком " + playerTwoName + " меньше загаданного");
                }
            } else if (playerOne.getNumber() < hiddenNum){
                System.out.println("Число введенное игроком " + playerOneName + " меньше загаданного");
                System.out.println("Игрок " + playerTwo.getName() + " введите число");
                playerTwo.setNumber(scan.nextInt());
                scan.nextLine();
                if (playerTwo.getNumber() == hiddenNum) {
                System.out.println("Игрок " + playerTwoName + " победил");
                } else if (playerTwo.getNumber() > hiddenNum){
                System.out.println("Число введенное игроком " + playerTwoName + " больше загаданного");
                } else if (playerTwo.getNumber() < hiddenNum){
                System.out.println("Число введенное игроком " + playerTwoName + " меньше загаданного");
                }
            }
        }
    }
}




