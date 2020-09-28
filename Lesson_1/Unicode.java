public class Unicode {	
    public static void main(String[] args) {
		char unicode = 0;
		for (int i = 33; i <= 126; i++) {
			if (i != 126) {
				unicode = (char)(i);
				System.out.print(unicode + ", ");
			}
			else 
				System.out.println(unicode);
		}
	}
}