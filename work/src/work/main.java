package work;

import java.util.*;

class Book implements Comparable<Book>{
	int price;
	
	Book(int price){
		this.price = price;
	}
	
	public void sort() {
		System.out.println("Book [price = " + price + "]");
	}
	
	@Override
    public int compareTo(Book book) {
        return this.price - book.price;
    }
}

public class main {
	 
    public static void main(String[] args) {
 
        Book[] books = new Book[] { new Book(15000), new Book(50000), new Book(20000) };
        
        System.out.println("정렬 전");
        for (Book b1 : books) {
            b1.sort();
        }
        
        System.out.println();
        Arrays.sort(books);
        
        System.out.println("정렬 후");
        for (Book b2 : books) {
            b2.sort();
        }      
 
    } 
}
