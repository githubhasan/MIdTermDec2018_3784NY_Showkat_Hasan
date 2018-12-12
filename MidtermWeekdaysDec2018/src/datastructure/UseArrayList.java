package datastructure;


		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */


import java.util.*;

public class UseArrayList {

	public static void main(String[] args) {

				// create a LinkedList
				LinkedList list = new LinkedList();

				// add some elements
				list.add(" Hello ");
				list.add(2);
				list.add("Chocolate");
				list.add("10");

				// print the list
				System.out.println("LinkedList:" + list);

				// peek at the head of the list
				System.out.println("Head of the list:" + list.peek());
			}
		}




