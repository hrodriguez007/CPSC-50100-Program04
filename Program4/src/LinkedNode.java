//Heidy Rodriguez
//Programming Fundamentals
//Summer 2021
//Programming Assignment 4 (LinkedNode)

public class LinkedNode {	
	private int data; // data value
	private LinkedNode next; // pointer to next node
  
	// constructor that initialize the data and sets next to null
	public LinkedNode(int data) {
       this.data = data;
       next = null;
	}
  
   // constructor that initialize the data and next
   public LinkedNode(int data, LinkedNode next) {
       this.data = data;
       this.next = next;
   }
  
   // getters
   public int getData() {
       return data;
   }
  
   public LinkedNode getNext() {
       return next;
   }
  
   // setters
   public void setData(int data) {
       this.data = data;
   }
  
   public void setNext(LinkedNode next) {
       this.next = next;
   }
}