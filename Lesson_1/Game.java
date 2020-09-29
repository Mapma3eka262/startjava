public class Game {
    public static void main(String[] args) {
        int hiddenNum = 35;
        int playerNum = 15;
        
        System.out.println("Введено число:" + playerNum);
        do {
            if (playerNum > hiddenNum) {
                System.out.println("Введенное вами число больше загаданного");
                playerNum -= 5;
            } else if (playerNum < hiddenNum) {
                System.out.println("Введенное вами число меньше загаданного");
                playerNum += 5;
            }
            System.out.println("Введено число:" + playerNum);        
        } while (playerNum != hiddenNum);
        System.out.println("Вы угадали, загаданным число было " + hiddenNum);
    }
}