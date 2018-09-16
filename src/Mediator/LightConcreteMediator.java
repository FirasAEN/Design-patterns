package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Firas on 9/15/2018.
 */
public class LightConcreteMediator implements Mediator {

    private List<Light> items = new ArrayList<>();

    @Override
    public void handle() {
        for (Light item: items) {
            if(!item.isOn()){
                System.out.println(item.getRoom() + ": switching light...");
                item.toggle();
            } else {
                System.out.println(item.getRoom() + ": light is already on");
            }
        }
    }


    public void addItem(Light item){
        this.items.add(item);
    }
}
