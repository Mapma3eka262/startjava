public class Game {	
    public static void main(String[] args) {
		int comp = 36;
		int firsttry = 50;
		int secondtry = 25;
		int thirdtry = 40;
		int fourthtry = 36;
		int count = 0;		
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				count = firsttry;
				System.out.println("Вы ввели число: " + count);
			}
			else {
				if (i == 1) {
					count = secondtry;
					System.out.println("Вы ввели число: " + count);
				}
				else {
					if (i == 2) {
						count = thirdtry;
						System.out.println("Вы ввели число: " + count);
					}
					else {
						count = fourthtry;
						System.out.println("Вы ввели число: " + count);
					}
				}
			}
			if (count > comp)
				System.out.println("Введенное вами число больше загаданного");
			else {
				if (count < comp)
					System.out.println("Введенное вами число меньше загаданного");
				else
					System.out.println("Вы угадали, загаданным число было "+ comp);
			}
		}
	}
}