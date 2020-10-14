public class JaegerTest {
    public static void main (String[] args){
        Jaeger firstJaeger = new Jaeger();
        Jaeger secondJaeger = new Jaeger();
        
        System.out.println("Creation first Jaeger");
        
        firstJaeger.setModelName("Cherno Alpha");
        System.out.println("ModelName " + firstJaeger.getModelName());
        
        firstJaeger.setMark("Mark-1");
        System.out.println("Mark " + firstJaeger.getMark());
        
        firstJaeger.setOrigin("Russia");
        System.out.println("Origin " + firstJaeger.getOrigin());
        
        firstJaeger.setHeight(85.34f);
        System.out.println("Height " + firstJaeger.getHeight());
        
        firstJaeger.setWeight(2.412f);
        System.out.println("Weight " + firstJaeger.getWeight());
        
        firstJaeger.setSpeed(3);
        System.out.println("Speed " + firstJaeger.getSpeed());
        
        firstJaeger.setStrength(10);
        System.out.println("Strength " + firstJaeger.getStrength());
        
        firstJaeger.setArmor(10);
        System.out.println("Armor " + firstJaeger.getArmor());
        
        firstJaeger.drift();
        
        System.out.println(firstJaeger.ActivationEC("Stun Core 08"));
                
        firstJaeger.move();
        
        System.out.println(firstJaeger.useWeapon("Z-14 Tesla fists \n"));
        
        System.out.println("Creation second Jaeger");
        
        secondJaeger.setModelName("Coyote Tango");
        System.out.println("ModelName " + secondJaeger.getModelName());
        
        secondJaeger.setMark("Mark-1");
        System.out.println("Mark " + secondJaeger.getMark());
        
        secondJaeger.setOrigin("Japan");
        System.out.println("Origin " + secondJaeger.getOrigin());
        
        secondJaeger.setHeight(85.34f);
        System.out.println("Height " + secondJaeger.getHeight());
        
        secondJaeger.setWeight(2.312f);
        System.out.println("Weight " + secondJaeger.getWeight());
        
        secondJaeger.setSpeed(5);
        System.out.println("Speed " + secondJaeger.getSpeed());
        
        secondJaeger.setStrength(7);
        System.out.println("Strength " + secondJaeger.getStrength());
        
        secondJaeger.setArmor(4);
        System.out.println("Armor " + secondJaeger.getArmor());
        
        secondJaeger.drift();
        
        System.out.println(secondJaeger.ActivationEC("Iso-thor reaction chamber"));
        
        secondJaeger.move();
        
        System.out.println(secondJaeger.useWeapon("Ballistic mortar cannons"));
        
    }
}