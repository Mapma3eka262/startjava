public class Person {
    String sex = "Мужской";
    String personName = "Вася";
    int height = 185;
    float weight 83.5f;
    int age = 34;
    
    void move() {
        System.out.println("Человек начал ходит");
    }
    
    void sit() {
        System.out.println("Человек сел");
    }
    
    void run() {
        System.out.println("Человек бегает");
    }
    
    String talk() {
        return "Человек: 'Я учу Java'";
    }
    
    String learn() {
        return "Знания языка Java";
    }
}