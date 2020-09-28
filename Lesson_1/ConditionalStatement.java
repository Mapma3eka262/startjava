public class ConditionalStatement {	
    public static void main(String[] args) {
    int age = 26;
	String sex = "Мужчина";
	double height = 1.85;
	char Name = 'В';
	if (age>20)
		System.out.println("Вы старше 20 лет");
	if (sex == "Мужчина")
		System.out.println("Вы мужского пола");
	if (sex != "Мужчина")
		System.out.println("Вы не мужского пола");
	if (height < 1.80)
		System.out.println("Вы ниже 1.80 метра");
	else
		System.out.println("Вы выше 1.80 метра");
	if (Name == 'М')
		System.out.println("Ваше имя начинается с буквы 'М'");
	else {
		if (Name == 'И')
			System.out.println("Ваше имя начинается с буквы 'И'");
		else
			System.out.println("Ваше имя начинается с буквы " + Name);
	}
}
}