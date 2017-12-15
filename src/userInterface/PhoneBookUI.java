package userInterface;

import java.io.IOException;
import java.util.Scanner;
import businessObjects.PhoneBookBO;
import service.PhoneBookService;
import dataAccess.PhoneBookDAO;

public class PhoneBookUI {
	
	public static void main(String[] args) throws IOException {
		
		//Get the phone numbers
		System.out.println("Enter your 10-digit phone number");
		String phone = new Scanner(System.in).nextLine();
		
		//Get the name
		System.out.println("Enter your name");
		String name = new Scanner(System.in).nextLine();
		
		PhoneBookBO user = new PhoneBookBO();
			user.setPhone(phone);
			user.setName(name);
		
			PhoneBookService phoneBookService = new PhoneBookService();
			System.out.println(phoneBookService.savePhoneBook(user));
	}

}
