package question01;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LibraryManager {
		public static void main(String[] args) {
		PriorityQueue<String> bookTitle = new PriorityQueue<>();
			
			Scanner scnTit = new Scanner(System.in);
			
			System.out.println("Enter the book title : ");
			
			while(true) {
				String title = scnTit.nextLine();
				if(title.equalsIgnoreCase("done")) {
					break;
				}
				
				bookTitle.add(title);
			}
			
			System.out.println("Etter the book you want to remove : ");
			String bookToRemove = scnTit.nextLine();
			boolean removed = bookTitle.remove(bookToRemove);
			
			if(removed) {
				System.out.println("The book "+bookToRemove+" was successfull");
			}else {
				System.out.println("The book "+bookToRemove+" was not found");
			}
			
			int totalBooks = bookTitle.size();
			System.out.println("Total number of books : "+totalBooks);
			
			System.out.println("Remeianing book titles");
			while(!bookTitle.isEmpty()) {
				System.out.println(bookTitle.poll());
			}
			
			scnTit.close();
		}
}
		
