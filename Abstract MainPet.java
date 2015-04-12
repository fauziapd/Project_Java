package pet;

/**
 *
 * @author Fauzia Puspita Dewi (0613U042)
 */
public class MainPet {
    public static void main(String[] args) {
               
        Pet pet = new Cat();
        pet.setName("Muy");
        pet.getName();
        pet.play();

        Cat cat = new Cat();
        cat.setName("Mueeza");
        cat.getName();
        cat.play();
        cat.eat();

        Fish fish = new Fish();
        fish.setName("Rocky");
        fish.getName();
        fish.play();
        fish.walk();
        fish.eat();
        
    }
    }
