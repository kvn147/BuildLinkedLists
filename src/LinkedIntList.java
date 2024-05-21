/**
 * This class allows singly-linked lists to be constructed and manipulated
 */
public class LinkedIntList {
   // instance field    front --> 2, 44, 77 null
   private ListNode front;

   /**
    * Constructs a LinkedIntList with no nodes, front is set to null
    */
   public LinkedIntList() {
      front = null;
   }

   /**
    * Constructs a LinkedIntList and sets the front to the head ListNode
    * passed to it.  Note: head may already be connected to other ListNodes
    * @param head ListNode to become the front of the linked list
    */
   public LinkedIntList(ListNode head){
      front = head;
   }

   /**
    * Constructs a singly linked list with one ListNode storing an integer
    * value
    * @param value data value to store in the ListNode
    */
   public LinkedIntList(int value) {
   
      front = new ListNode(value, null);
       
   }

   /**
    * Adds a new list node to the front of the singly linked list
    * @param value
    *
    * front ---> null   handled
    *
    * front ---> 3
    *
    * front ---> 3, 5, 6, null
    *
    * addFront(7)
    * front --> 7 --> 3 null
    * Note: You need to change the front instance field reference
    * to point at this new node
    */
   public void addFront(int value) {
      if (front == null) {
         front = new ListNode(value);
      }
      else {
         front = new ListNode(value, front);
      }
   }

   /**
    * Add a list node to the end of the singly linked list
    * @param value integer value to add
    */
   public void addEnd(int value) {
   
   }

   /**
    * Removes the first node in the list and returns the data value
    * stored in the removed node
    * @return integer data value that was removed
    *
    * Note: if front is null, throw an IllegalStateException("No node to remove");
    */
   public int removeFront() {
   // TODO
      return -1;
      
   }

   /**
    * Traverses to the NEXT to last node and removes the last list node
    * in the singly linked list by setting current.next to null. Make sure you
    * save the removed value before setting .next to null so you can return it.
    * @return integer data value that was removed
    *
    * Note: if front is null, throw an IllegalStateException("No node to remove");
    *
    * front ---> null
    *
    * front ---> 3 null
    *
    * front ---> 3 ---> 4 ---> 5 ---> 6 null
    *                          c
    */
   public int removeEnd() {
      if (front == null) {
         throw new IllegalArgumentException("No node to remove");
      }

      // if only one ListNode
      if (front.next == null) {
         int removed = front.data;
         front = null;
         return removed;
      }
      else { // traverse the end of 2 more nodes recursively
         return removeEnd(front);
      }
   }

   // recursive helper method
   private int removeEnd(ListNode curr) {
      // base case
      if (curr.next.next == null) {
         int removed = curr.next.data;
         curr.next = null;
         return removed;
      }
      else {
         // recursive case
         return removeEnd(curr.next);
      }
   }

   /**
    * Determines if the value is in a list node in the singly linked list
    * @param value integer data value to search for
    * @return true if value is found, false otherwise
    */
   public boolean contains(int value) {
   // TODO
      return false;
      
   }

   /**
    *
    * @return the number of list nodes in the singly linked list
    */
   public int size() {
   // TODO
      int count = 1;

      while (front.next != null) {

         count ++;
      }
      return count;
      
   }

   /**
    * Creates and returns a string representation of the integer values in the
    * singly linked list by traversing through all of the nodes concatenating/appending
    * as you go
    * @return string of data values ex. [3, 5, 77, -1]
    * front ---> 3, 5, 77, -1 null
    *                     curr
    * front ---> null
    *
    * front ---> 3 null
    * Note: Be careful not to lose the front of the list!
    * This means that you need another reference to the front of the list
    * that you manipulate rather than directly manipulating the front reference.
    */
   public String toString() {
      if (front == null) {
         return "[ ]";
      }
      String result = "[" + front.data;
      // , data , data , data
      ListNode curr = front.next; // 3, 4, 5, 7
                                  //          c
                                 // 3 null
                                 //    c
      // visiting every node in the list
      while (curr != null) {
         result += ", " + curr.data;
         curr = curr.next;
      }
      // curr is on null

      return result + "]";
      
   }
}