package Command;

/**
 * Created by Firas on 12/13/2017.
 */
public class Light {

    private final String name;

    public Light (String name){
        this.name = name;
    }

    public void on(){
        System.out.println("Light was turned on...");
    }

    public void off(){
        System.out.println("Light was turned off...");
    }
}
