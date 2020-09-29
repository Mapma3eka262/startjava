public class Cycle {
    public static void main(String[] args) {
        System.out.println("Вывод с помощью цикла for");
        for (int i = 0; i <= 20; i++) {
            if (i < 20) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Вывод с помощью цикла while (шаг итерации равен 2)");
        int j = 6;
        while (j >= -6) {
            if (j > -6) {
                System.out.print(j + ", ");
                j = j - 2;
            } else {
                System.out.println(j);
                j = j - 2;
            }
        }

        System.out.println("Вывод с помощью цикла do-while");
        int k = 10;
        int result = 0;
        do {
            if (k % 2 != 0) {
                result += k;
                k++;
            } else {
                k++;
            }
        } while (k <= 20);
        System.out.println("Сумма нечетных числе в промежутке от 10 до 20 равна " + result);
    }
}