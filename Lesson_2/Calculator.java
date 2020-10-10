public class Calculator {
    private double result;

    public void calculate(int firstNum, char operation, int secondNum){
        switch(operation){
            case '+' :
                result = firstNum + secondNum;
                System.out.println("Результат сложения чисел " + firstNum + " и " + secondNum + ": " + result);
                break;
            case '-' :
                result = firstNum - secondNum;
                System.out.println("Результат вычитания чисел " + firstNum + " и " + secondNum + ": " + result);
                break;
            case '*' :
                result = firstNum * secondNum;
                System.out.println("Результат умножения чисел " + firstNum + " и " + secondNum + ": " + result);
                break;
            case '/' :
                result = firstNum / secondNum;
                System.out.println("Результат деления чисел " + firstNum + " и " + secondNum + ": " + result);
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNum; i++){
                    result *= firstNum;
                }
                System.out.println("Результат возведения числа " + firstNum + " в степень " + secondNum + ": " + result);
                break;
            case '%' :
                result = firstNum % secondNum;
                System.out.println("Остаток от деления чисел " + firstNum + " и " + secondNum + ": " + result);
                break;
        }
    }
}