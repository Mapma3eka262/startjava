public class GuessNumber {
    private int playerOneNum;
    private int playerTwoNum;
    private int hiddenNum;
    private String playerOneName;
    private String playerTwoName;
    
    public GuessNumber(String playerOneName, String playerTwoName, int hiddenNum) {
        this.hiddenNum = hiddenNum;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }
    
    public void Guess(int playerOneNum, int playerTwoNum) {
        this.playerOneNum = playerOneNum;
        this.playerTwoNum = playerTwoNum;

        if (playerOneNum == hiddenNum) {
            System.out.println("Игрок " + playerOneName + " победил");            
        } else if (playerTwoNum == hiddenNum) {
            System.out.println("Игрок " + playerTwoName + " победил");
        } else if (playerOneNum != hiddenNum && playerTwoNum != hiddenNum) {
            if (playerOneNum > hiddenNum){
                System.out.println("Число введенное игроком " + playerOneName + " больше загаданного");
            } else if (playerOneNum < hiddenNum){
                System.out.println("Число введенное игроком " + playerOneName + " меньше загаданного");
            }
            if (playerTwoNum > hiddenNum){
                System.out.println("Число введенное игроком " + playerTwoName + " больше загаданного");
            } else if (playerTwoNum < hiddenNum){
                System.out.println("Число введенное игроком " + playerTwoName + " меньше загаданного");
            }
        }     
    }
    
    public void setPlayerOneNum(int playerOneNum){
        this.playerOneNum = playerOneNum;
    }
    
    public void setPlayerTwoNum(int playerTwoNum){
        this.playerTwoNum = playerTwoNum;
    }
}




