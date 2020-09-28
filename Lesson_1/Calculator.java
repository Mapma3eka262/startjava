public class Calculator {	
    public static void main(String[] args) {
	char choose = '%';		// Введите математическое выражение
	int first = 39;			// Введите 1 число для математических операций
	int second = 7;			// Введите 2 число для математических операций
	double result = 0;
	if (choose == '+') {
		System.out.println("Выбрано математическое выражение: " + choose);
		result = first + second;
		System.out.println("Результат сложения чисел " + first + " и " + second + ": " + result);
	}
	else {
		if (choose == '-') {
			System.out.println("Выбрано математическое выражение: " + choose);
			result = first - second;
			System.out.println("Результат вычитания чисел " + first + " и " + second + ": " + result);
		}
		else {
			if (choose == '*') {
				System.out.println("Выбрано математическое выражение: " + choose);
				result = first * second;
				System.out.println("Результат умножения чисел " + first + " и " + second + ": " + result);
			}
			else {
				if (choose == '/') {
					System.out.println("Выбрано математическое выражение: " + choose);
					result = first / second;
					System.out.println("Результат деления чисел " + first + " и " + second + ": " + result);
				}
				else {
					if (choose == '^') {
						System.out.println("Выбрано математическое выражение: " + choose);
						for (int i = 0; i < 3; i++) {
							if (i == 0)
								result=second;
							else {
								result = result * second;						
							}
						}
						System.out.println("Результат возведения числа " + second + " в степень 3: " + result);		
					}
					else {
						System.out.println("Выбрано математическое выражение: " + choose);
						result = first % second;
						System.out.println("Остаток от деления чисел " + first + " и " + second + ": " + result);
					}
				}
			}
		}
	}
}
}