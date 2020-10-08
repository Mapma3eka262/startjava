public class Wolf {
    String sex;
    String nickname;
    float weight;
    int age;
    String color;
    
    void move() {
        System.out.println("Волк ходит по лесу");
    }
    
    void sit() {
        System.out.println("Волк сидит");
    }
    
    void run() {
        System.out.println("Волк побежал");
    }
    
    String howl() {
        return "Устрашающий вой";
    }
    
    String hunt() {
        return "Выслеживание жертвы";
    }
}