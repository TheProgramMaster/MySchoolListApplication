import java.util.Scanner;
import java.util.ArrayList;
public class schoolList{
	public static String getString(){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<Integer> amounts = new ArrayList<Integer>();
		System.out.println("Please enter each item you plan to purchase for the upcoming school year.");
		System.out.println("For each item, please enter the amount of that item you will need.");
		System.out.println("When you have finished inputting your list of items to the screen, please write"
		+" \"quit\" to stop program.");
		String input;
		int amount;
		while(true){
			System.out.println("Please enter item name: ");
			input = getString();
			if(input.equals("quit")){
				break;
			}
			items.add(input);
			System.out.println("Please enter amount of item you intend to purchase: ");
			amount = scan.nextInt();
			amounts.add(amount);
			input = "";
		}
		int count = 0;
		for(String item : items){
			System.out.println(item + ": " + amounts.get(count));
			count += 1;
		}
	}
}
