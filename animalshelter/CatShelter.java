package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class CatShelter extends AnimalShelter {

    @Override
    Cat adoptAnimal(){
        return (Cat) super.adoptAnimal();
    }

    public void putAnimal(Cat cat){
        super.putAnimal(cat);
    }


}
