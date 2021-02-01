package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        // CatShelter catShelter = new CatShelter();
        AnimalShelter<Cat> catShelter = new AnimalShelter<>();

        Dog badBoyRex = new Dog();
        Cat kitty = new Cat();

        catShelter.putAnimal(kitty);
        catShelter.putAnimal(badBoyRex);

        System.out.println("Who let the dogs out?!?");
    }
}
