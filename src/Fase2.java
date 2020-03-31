import java.util.Scanner;
import java.util.ArrayList;
public class Fase2 {
	
	public static void main(String[] args) {
    
	Integer Euro5,Euro10,Euro20,Euro50,Euro100,Euro200,Euro500;
	Euro5 = 5;
	Euro10 = 10;
	Euro20 = 20;
	Euro50 = 50;
	Euro100 = 100;
	Euro200 = 200;
	Euro500 = 500;

	ArrayList<Integer> total = new ArrayList<Integer>();
	
	String dishes [] = {"Pasta", "Salad", "Pizza", "Meat","Tiramisu"};
	int prices []  = {5, 10, 15, 20, 5};
	
		System.out.println("The menu of today is:");
	for (int i = 0; i < dishes.length; i++) {
		System.out.println(dishes[i] + ": " + prices[i]+ "€.");
		}
	int bill = 0;
	while (bill==0){
	Scanner myObj = new Scanner(System.in);
    System.out.println("What do you want to eat? 1-Pasta - 2-Salad - 3-Pizza"
    		+ " 4-meat - 5-Tiramisu. (6-Ask for the Bill).");

    int client = myObj.nextInt();
    String dish;
    int more;
    int i = (client-1);
    int sum = 0;
    
    
	switch(client)
   {
        case 1:
        	dish = dishes[i];
            System.out.println("You chosed: " + dish + 
            " do you want something more to eat? 1-Yes / 2-No.");
            total.add(prices[i]);
            Scanner myObj1 = new Scanner(System.in);
            more = myObj1.nextInt();
            if (more == 1) {System.out.println("Yes");}
            	else if (more == 2) {bill = 1;}
            	else {System.out.println("Please chose a number between 1 and 2.");}
            break;
        case 2:
        	dish = dishes[i];
            System.out.println("You chosed: " + dish + 
            " do you want something more to eat? 1-Yes / 2-No.");
            total.add(prices[i]);
            Scanner myObj2 = new Scanner(System.in);
            more = myObj2.nextInt();
        	if (more == 1) {System.out.println("Yes");}
	        	else if (more == 2) {bill = 1;}
	        	else {System.out.println("Please chose a number between 1 and 2.");}
        	break;
        case 3:
        	dish = dishes[i];
            System.out.println("You chosed: " + dish + 
            " do you want something more to eat? 1-Yes / 2-No.");
            total.add(prices[i]);
            Scanner myObj3 = new Scanner(System.in);
            more = myObj3.nextInt();
        	if (more == 1) {System.out.println("Yes");}
	        	else if (more == 2) {bill = 1;}
	        	else {System.out.println("Please chose a number between 1 and 2.");}
            break;
        case 4:
        	dish = dishes[i];
            System.out.println("You chosed: " + dish + 
            " do you want something more to eat? 1-Yes / 2-No.");
            total.add(prices[i]);
            Scanner myObj4 = new Scanner(System.in);
            more = myObj4.nextInt();
        	if (more == 1) {System.out.println("Yes");}
	        	else if (more == 2) {bill = 1;}
	        	else {System.out.println("Please chose a number between 1 and 2.");}
            break;
        case 5:
        	dish = dishes[i];
            System.out.println("You chosed: " + dish + 
            " do you want something more to eat? 1-Yes / 2-No.");
            total.add(prices[i]);
            Scanner myObj5 = new Scanner(System.in);
            more = myObj5.nextInt();
        	if (more == 1) {System.out.println("Yes");}
	        	else if (more == 2) {bill = 1;}
	        	else {System.out.println("Please chose a number between 1 and 2.");}
            break;
        case 6:
        bill = 1;
            break;
        default:
            System.out.println("Please chose a number between 1 and 6.");

	}
	
    for(int d : total)
    sum += d;
    if (bill == 1) 
    {System.out.println("The total bill is: " + sum + "€.");}

	}
  }
}