public class Calculator {
    private double result;

    public void calculate(int firstNum, char operation, int secondNum){
        switch(operation){
            case '+' :
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum - secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/' :
                result = firstNum / secondNum;
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNum; i++){
                    result *= firstNum;
                }
                break;
            case '%' :
                result = firstNum % secondNum;
                break;
            default:
                System.out.println("Введены некорректные данные");
            System.out.println("Результат: " + result);
        }
    }
}