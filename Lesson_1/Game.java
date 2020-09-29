public class Game {
    public static void main(String[] args) {
        int comp = 35;
        int firsttry = 15;
        
        System.out.println("Введено число:" + firsttry);
        do{
            if (firsttry > comp) {
                System.out.println("Введенное вами число больше загаданного");
                firsttry -= 5;
                System.out.println("Введено число:" + firsttry);
            } else if (firsttry < comp) {
                System.out.println("Введенное вами число меньше загаданного");
                firsttry += 5;
                System.out.println("Введено число:" + firsttry);
            }        
        } while (firsttry != comp);
        System.out.println("Вы угадали, загаданным число было "+ comp);
    }
}