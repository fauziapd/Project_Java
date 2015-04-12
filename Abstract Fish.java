package pet;

/**
 *
 * @author Fauzia Puspita Dewi (0613U042)
 */
public class Fish extends Pet{
        String name;
    public Fish(){
        System.out.println("\nFISH");
    }
    
    public void setName( String nm){
        name = nm;
    }
    
    public String getName(){
        System.out.println("Name : " +name);
        return name;
    }
    
    public void walk(){
        System.out.println("Fish can walk");
    }
    
    public void eat(){
        System.out.println("Fish can eat");
    }
    
}
