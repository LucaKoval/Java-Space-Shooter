
public class Pet {

	public String name;
    public String type;
    public String color;
    public int calories;
 
    Pet(){
        name = "Spike";
        type = "dog";
        color = "black";
        calories = 3000;
    }
    
    public void run(){
        calories = calories - 50;
    }
     
    public void eat(int a){
        calories = calories + a;
    }
	
}