public class GuessNumber {
    private int playerNum;
    private int hiddenNum;
    private String player;
    
    public GuessNumber(String player, int playerNum, int hiddenNum) {
        this.playerNum = playerNum;
        this.hiddenNum = hiddenNum;
        if (playerNum > hiddenNum){
            System.out.println("Число введенное игроком " + player + " больше загаданного");
        } else if (playerNum < hiddenNum){
            System.out.println("Число введенное игроком " + player + " меньше загаданного");
        } else {         
            System.out.println("Игрок " + player + " победил");
        }
    }
}