public class Jaeger {
    
    private String modelName;
    
    public String getModelName(){
        return modelName;
    }
    
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    
    private String mark;
    
    public String getMark(){
        return mark;
    }
    
    public void setMark(String mark){
        this.mark = mark;
    }
    
    private String origin;
    
    public String getOrigin(){
        return origin;
    }
    
    public void setOrigin(String origin){
        this.origin = origin;
    }
    
    private float height;
    
    public float getHeight(){
        return height;
    }
    
    public void setHeight(float height){
        this.height = height;
    }
    
    private float weight;
    
    public float getWeight(){
        return weight;
    }
    
    public void setWeight(float weight){
        this.weight = weight;
    }
    
    private int speed;
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    private int strength;
    
    public int getStrength(){
        return strength;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    private int armor;
    
    public int getArmor(){
        return armor;
    }
    
    public void setArmor(int armor){
        this.armor = armor;
    }
    
    public boolean drift(){
        System.out.println("You entered drift");
        return true;
    }
    
    public void move(){
        System.out.println(modelName + " started moving");
    }
    
    public String ActivationEC(String energyCore){
        return energyCore + " activate";        
    }
    
    public String useWeapon(String weapon){
        return "Jaeger " + modelName + " started using " + weapon;
    }
}