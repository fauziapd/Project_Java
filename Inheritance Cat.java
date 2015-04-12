package animal;

/**
 *
 * @author Fauzia Puspita Dewi (0613U042)
 */
public class Cat extends Animal{
        String name;
    public Cat(){
        System.out.println("\nCAT");
    }
    
    public void setName( String nm){
        name = nm;
    }
    
    public String getName(){
        System.out.println("Name : " +name);
        return name;
    }
    
    public void play(){
        System.out.println("Cat can play");
    }
    
}
