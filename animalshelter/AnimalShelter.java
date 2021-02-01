package animalshelter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */
public class AnimalShelter<T extends Animal> {

    private List<T> animalsInShelter = new ArrayList<>(20);

    T adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(T animal){
        animalsInShelter.add(animal);
    }

}
