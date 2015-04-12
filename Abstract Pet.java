package pet;

/**
 *
 * @author Fauzia Puspita Dewi (0613U042)
 */
public abstract class Pet{
    protected String name;
    
    public Pet(){}
    
    public void setName(String nm){
        name = nm;
    }
    
    public String getName(){
        System.out.println("Name : " +name);
        return name;
    }
    
    public void play(){
        System.out.println("Pet can play");
    }
    
     
}
