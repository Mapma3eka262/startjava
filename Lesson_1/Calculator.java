public class Calculator {
    public static void main(String[] args) {
        char operation = '%';  // Введите математическое знак
        int firstNum = 39;     // Введите 1 число для математических операций
        int secondNum = 7;     // Введите 2 число для математических операций
        double result = 0;

        if (choose == '+') {
            System.out.println("Выбран математический знак: " + choose);
            result = firstNum + secondNum;
        System.out.println("Результат сложения чисел " + firstNum + " и " + secondNum + ": " + result);
        } else {
            if (choose == '-') {
                System.out.println("Выбран математический знак: " + choose);
                result = firstNum - secondNum;
                System.out.println("Результат вычитания чисел " + firstNum + " и " + secondNum + ": " + result);
            } else if (choose == '*') {
                System.out.println("Выбран математический знак: " + choose);
                result = firstNum * secondNum;
                System.out.println("Результат умножения чисел " + firstNum + " и " + secondNum + ": " + result);
            } else if (choose == '/') {
                System.out.println("Выбран математический знак: " + choose);
                result = firstNum / secondNum;
                System.out.println("Результат деления чисел " + firstNum + " и " + secondNum + ": " + result);
            } else if (choose == '^') {
                System.out.println("Выбран математический знак: " + choose);
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        result=secondNum;
                    }
                    else {
                        result *= secondNum;
                    }
                }
                System.out.println("Результат возведения числа " + secondNum + " в степень 3: " + result);
            } else {
                System.out.println("Выбран математический знак: " + choose);
                result = firstNum % secondNum;
                System.out.println("Остаток от деления чисел " + firstNum + " и " + secondNum + ": " + result);
            }
        }
    }
}