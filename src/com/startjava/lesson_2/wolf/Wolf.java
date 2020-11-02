public class Wolf {
    private String sex;
    private String nickname;
    private float weight;
    private int age;
    private String color;
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8 || age < 0) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Волк ходит по лесу");
    }
    
    public void sit() {
        System.out.println("Волк сидит");
    }
    
    public void run() {
        System.out.println("Волк побежал");
    }
    
    public String howl() {
        return "Устрашающий вой";
    }
    
    public String hunt() {
        return "Выслеживание жертвы";
    }
}