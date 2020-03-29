
import java.util.HashMap;

public class Fase1 {
  public static void main(String[] args) {
    
	int Euro5 ,Euro10, Euro20, Euro50,Euro100,Euro200,Euro500;
	Euro5 = 5;
	Euro10 = 10;
	Euro20 = 20;
	Euro50 = 50;
	Euro100 = 100;
	Euro200 = 200;
	Euro500 = 500;
	  
	HashMap<String, Integer> menuOfTheDay = new HashMap<String, Integer>();
    menuOfTheDay.put("Pasta", 5);
    menuOfTheDay.put("Salad", 10);
    menuOfTheDay.put("Pizza", 15);
    menuOfTheDay.put("Meat", 20);
    menuOfTheDay.put("Tiramisu", 5);
    System.out.println(menuOfTheDay); 
  }
}
