package ClientV1_1;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Whats the server address?");
		String address = scan.nextLine();*/
		
		/*System.out.println("What is the username?");
		System.out.println("Currently, please only pick User1 or User2");
		String username = scan.nextLine();
		
		while(username.contains(" ")){
			System.out.println("Enter valid username, spaces not allowed");
			username = scan.nextLine();
		}*/
		
		ClientGraphics g = new ClientGraphics("Me", "localhost", 19000);

	}

}
