package Practice_problem;

import java.util.Scanner;

public class Implemented_Linked_list {
	public static void main(String[] args) {
		Single_Linked_List list = new Single_Linked_List();
		list.append(56);
		list.append(30);
		list.append(70);
		list.display();
		System.out.println();
		System.out.println("Search the element => 56,30,70");
		Scanner userInput = new Scanner(System.in);
		int num = userInput.nextInt();
		list.search(num);
	}
}