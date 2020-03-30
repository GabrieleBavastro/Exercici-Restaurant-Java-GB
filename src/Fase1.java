public class Fase1 {
  public static void main(String[] args) {
    
	int Euro5 ,Euro10, Euro20, Euro50,Euro100,Euro200,Euro500,total;
	Euro5 = 5;
	Euro10 = 10;
	Euro20 = 20;
	Euro50 = 50;
	Euro100 = 100;
	Euro200 = 200;
	Euro500 = 500;
	total = 0;
	
	String dishes [] = {"Pasta", "Salad", "Pizza", "Meat","Tiramisu"};
	int prices []  = {5, 10, 15, 20, 5};
	
		System.out.println("The menu of today is:");
	for (int i = 0; i < dishes.length; i++) {
		System.out.println(dishes[i] + ": " + prices[i]+ "€.");
   }
  }
}
