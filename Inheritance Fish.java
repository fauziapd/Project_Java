package animal;

/**
 *
 * @author Fauzia Puspita Dewi (0613U042)
 */
public class Fish extends Animal{
        String name;
    public Fish(){
        System.out.println("\nFISH");
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public String getName(){
        System.out.println("Name : " +name);
        return name;
    }
    
    public void play(){
        System.out.println("Fish can play");
    }
    
}
