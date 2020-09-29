public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 26;
        if (age > 20) {
            System.out.println("Вы старше 20 лет");
        } 

        String sex = "Мужчина";
        if (sex.equals("Мужчина")) {
            System.out.println("Вы мужского пола");
        } else {
            System.out.println("Вы не мужского пола");
        }

        double height = 1.85;
        if (height < 1.80){
            System.out.println("Вы ниже 1.80 метра");
        } else {
            System.out.println("Вы выше 1.80 метра");
        } 
        
        char firstNameLetter = 'В';
        if (firstNameLetter == 'М') {
            System.out.println("Ваше имя начинается с буквы 'М'");
        } else if (firstNameLetter == 'И') {
            System.out.println("Ваше имя начинается с буквы 'И'");
        } else {
            System.out.println("Ваше имя начинается с буквы " + firstNameLetter);
        }
    }
}