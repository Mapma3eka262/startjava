public class Unicode {	
    public static void main(String[] args) {
		for (int i = 33; i <= 126; i++) {
			if (i != 126) {
				System.out.print((char)(i) + ", ");
			} else 
				System.out.println((char)(i));
		}
	}
}