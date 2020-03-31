import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Fase3 {

	public static void main(String[] args) {
		//create arrays with data to manipulate.
		int banknotes[] = { 500, 200, 100, 50, 20, 10, 5 };

		ArrayList<Integer> total = new ArrayList<Integer>();
		ArrayList<Integer> arrayChange = new ArrayList<Integer>();

		String dishes[] = { "Pasta", "Salad", "Pizza", "Meat", "Tiramisu" };
		int prices[] = { 5, 10, 15, 25, 5 };

		//Show the menu.
		System.out.println("The menu of today is:");
		for (int i = 0; i < dishes.length; i++) {
			System.out.println(dishes[i] + ": " + prices[i] + "€.");
		}
		//Create a while loop for ask what they want to eat.
		boolean  bill = true; //Boolean variable used for manage the while loop.
		while (bill == true) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("What do you want to eat? 1-"+dishes[0]+" - 2-"+dishes[1]+" - 3-"+dishes[2]+
					 " - 4-"+dishes[3]+" - 5-"+dishes[4]+". (6-Ask for the Bill).");

			int sum = 0;
			int client = myObj.nextInt();
			String dish;
			int more;
			int i = (client - 1);
			
			//Create a switch for ask if they want to eat something more.
			switch (client) {
			case 1:
				dish = dishes[i];
				System.out.println("You chosed: " + dish + " do you want something more to eat? 1-Yes / 2-No.");
				total.add(prices[i]); //Add the price of the dish in total array.
				Scanner myObj1 = new Scanner(System.in);
				more = myObj1.nextInt();
				if (more == 1) { //If 1 continue inside of the loop.
					System.out.println("Yes");
				} else if (more == 2) { //If 2 exit the loop and ask for the bill.
					bill = false;
				} else {
					System.out.println("Please chose a number between 1 and 2.");
				}
				break;
			case 2:
				dish = dishes[i];
				System.out.println("You chosed: " + dish + " do you want something more to eat? 1-Yes / 2-No.");
				total.add(prices[i]);
				Scanner myObj2 = new Scanner(System.in);
				more = myObj2.nextInt();
				if (more == 1) {
					System.out.println("Yes");
				} else if (more == 2) {
					bill = false;
				} else {
					System.out.println("Please chose a number between 1 and 2.");
				}
				break;
			case 3:
				dish = dishes[i];
				System.out.println("You chosed: " + dish + " do you want something more to eat? 1-Yes / 2-No.");
				total.add(prices[i]);
				Scanner myObj3 = new Scanner(System.in);
				more = myObj3.nextInt();
				if (more == 1) {
					System.out.println("Yes");
				} else if (more == 2) {
					bill = false;
				} else {
					System.out.println("Please chose a number between 1 and 2.");
				}
				break;
			case 4:
				dish = dishes[i];
				System.out.println("You chosed: " + dish + " do you want something more to eat? 1-Yes / 2-No.");
				total.add(prices[i]);
				Scanner myObj4 = new Scanner(System.in);
				more = myObj4.nextInt();
				if (more == 1) {
					System.out.println("Yes");
				} else if (more == 2) {
					bill = false;
				} else {
					System.out.println("Please chose a number between 1 and 2.");
				}
				break;
			case 5:
				dish = dishes[i];
				System.out.println("You chosed: " + dish + " do you want something more to eat? 1-Yes / 2-No.");
				total.add(prices[i]);
				Scanner myObj5 = new Scanner(System.in);
				more = myObj5.nextInt();
				if (more == 1) {
					System.out.println("Yes");
				} else if (more == 2) {
					bill = false;
				} else {
					System.out.println("Please chose a number between 1 and 2.");
				}
				break;
			case 6: 
				/*Case created for arrange if a mistake is made in choose yes or no 
				when it's asked for another one dish.*/
				bill = false;
				break;
			default:
				System.out.println("Please chose a number between 1 and 6.");
				//After the error message automatically ask again the question.
			}
			//When exit the while loop begin the bill calculator.
			if (bill == false) {

				for (int d : total)
					sum += d;

				{
					System.out.println("The total bill is: " + sum + "€.");
				}
				/* When the bill is calculated, begin a do while loop for calculate 
				which is the best way to receive the payment by cash.*/
				int j, ammount;

				for (j = 0; j < banknotes.length; j++) {
					if (sum >= banknotes[j]) {
						do {
							ammount = sum - banknotes[j];
							arrayChange.add(banknotes[j]);
							sum = ammount;
						} while (sum > banknotes[j]);
					}
				}
				System.out.println("The client have to pay with those banknotes: ");
				for (int banknote : arrayChange) {
					System.out.println(banknote + "€");
				}
			}
		}
	}
}
