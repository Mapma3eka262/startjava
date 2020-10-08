public class WolfTest {
    public static void main(String[] args) { 
        Wolf wildwolf = new Wolf();
        
        wildwolf.sex = "Кобель";
        wildwolf.nickname = "Ghost";
        wildwolf.weight = 40.5f;
        wildwolf.age = 4;
        wildwolf.color = "Серый";
        
        System.out.println("Пол: " + wildwolf.sex);
        System.out.println("Кличка: " + wildwolf.nickname);
        System.out.println("Вес: " + wildwolf.weight);
        System.out.println("Возраст: " + wildwolf.age);
        System.out.println("Окрас: " + wildwolf.color);
        wildwolf.move();
        wildwolf.sit();
        wildwolf.run();
        System.out.println(wildwolf.howl());
        System.out.println(wildwolf.hunt());
    }
}