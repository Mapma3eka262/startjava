public class JaegerTest {
    public static void main (String[] args){
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();
        
        System.out.println("Creation first Jaeger");
        
        jaegerOne.setModelName("Cherno Alpha");
        System.out.println("ModelName " + jaegerOne.getModelName());
        
        jaegerOne.setMark("Mark-1");
        System.out.println("Mark " + jaegerOne.getMark());
        
        jaegerOne.setOrigin("Russia");
        System.out.println("Origin " + jaegerOne.getOrigin());
        
        jaegerOne.setHeight(85.34f);
        System.out.println("Height " + jaegerOne.getHeight());
        
        jaegerOne.setWeight(2.412f);
        System.out.println("Weight " + jaegerOne.getWeight());
        
        jaegerOne.setSpeed(3);
        System.out.println("Speed " + jaegerOne.getSpeed());
        
        jaegerOne.setStrength(10);
        System.out.println("Strength " + jaegerOne.getStrength());
        
        jaegerOne.setArmor(10);
        System.out.println("Armor " + jaegerOne.getArmor());
        
        jaegerOne.drift();
        
        System.out.println(jaegerOne.ActivationEC("Stun Core 08"));
                
        jaegerOne.move();
        
        System.out.println(jaegerOne.useWeapon("Z-14 Tesla fists \n"));
        
        System.out.println("Creation second Jaeger");
        
        jaegerTwo.setModelName("Coyote Tango");
        System.out.println("ModelName " + jaegerTwo.getModelName());
        
        jaegerTwo.setMark("Mark-1");
        System.out.println("Mark " + jaegerTwo.getMark());
        
        jaegerTwo.setOrigin("Japan");
        System.out.println("Origin " + jaegerTwo.getOrigin());
        
        jaegerTwo.setHeight(85.34f);
        System.out.println("Height " + jaegerTwo.getHeight());
        
        jaegerTwo.setWeight(2.312f);
        System.out.println("Weight " + jaegerTwo.getWeight());
        
        jaegerTwo.setSpeed(5);
        System.out.println("Speed " + jaegerTwo.getSpeed());
        
        jaegerTwo.setStrength(7);
        System.out.println("Strength " + jaegerTwo.getStrength());
        
        jaegerTwo.setArmor(4);
        System.out.println("Armor " + jaegerTwo.getArmor());
        
        jaegerTwo.drift();
        
        System.out.println(jaegerTwo.ActivationEC("Iso-thor reaction chamber"));
        
        jaegerTwo.move();
        
        System.out.println(jaegerTwo.useWeapon("Ballistic mortar cannons"));
        
    }
}