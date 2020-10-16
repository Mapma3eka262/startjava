public class JaegerTest {
    public static void main (String[] args){
        Jaeger сhernoAlpha = new Jaeger("Cherno Alpha","Mark-1","Russia",85.34f,2.412f,3,10,10);
        Jaeger сoyoteTango = new Jaeger("Coyote Tango","Mark-1","Japan",85.34f,2.312f,5,7,4);
        
        System.out.println("Creation first Jaeger");
       
        System.out.println("ModelName " + сhernoAlpha.getModelName());
        
        System.out.println("Mark " + сhernoAlpha.getMark());
        
        System.out.println("Origin " + сhernoAlpha.getOrigin());
        
        System.out.println("Height " + сhernoAlpha.getHeight());
        
        System.out.println("Weight " + сhernoAlpha.getWeight());
        
        System.out.println("Speed " + сhernoAlpha.getSpeed());
        
        System.out.println("Strength " + сhernoAlpha.getStrength());
        
        System.out.println("Armor " + сhernoAlpha.getArmor());
        
        сhernoAlpha.drift();
        
        System.out.println(сhernoAlpha.ActivationEC("Stun Core 08"));
                
        сhernoAlpha.move();
        
        System.out.println(сhernoAlpha.useWeapon("Z-14 Tesla fists \n"));
        
        System.out.println("Creation second Jaeger");
        
        System.out.println("ModelName " + сoyoteTango.getModelName());
        
        System.out.println("Mark " + сoyoteTango.getMark());
        
        System.out.println("Origin " + сoyoteTango.getOrigin());
        
        System.out.println("Height " + сoyoteTango.getHeight());
        
        System.out.println("Weight " + сoyoteTango.getWeight());
        
        System.out.println("Speed " + сoyoteTango.getSpeed());
        
        System.out.println("Strength " + сoyoteTango.getStrength());
        
        System.out.println("Armor " + сoyoteTango.getArmor());
        
        сoyoteTango.drift();
        
        System.out.println(сoyoteTango.ActivationEC("Iso-thor reaction chamber"));
        
        сoyoteTango.move();
        
        System.out.println(сoyoteTango.useWeapon("Ballistic mortar cannons"));
        
        
    }
}