
package basicJava;
import java.util.Scanner;
public class LinkedListPractice {

	public static void main(String[] args) {
		
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void increment(Node head) {
		Node temp = head;
		while(temp!=null) {
			temp.data+=2;
			temp = temp.next;
		}
	}
	
	public static int getLength(Node head) {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}
