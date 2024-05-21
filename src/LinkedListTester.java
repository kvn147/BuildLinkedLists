import java.util.Scanner;

/**
 * This class tests out the LinkedIntList class
 */
public class LinkedListTester {

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      
      LinkedIntList list = new LinkedIntList();
      System.out.println(list + " size=" + list.size());
      
      String option = "";
      do {
         option = displayOptions(console);
         
         if(option.startsWith("af")) {
         
            System.out.print("Add what? > ");
            list.addFront(console.nextInt());
            
         } else if(option.startsWith("ae")) {
         
            System.out.print("Add what? > ");
            list.addEnd(console.nextInt());
            
         } else if(option.startsWith("rf")) {
         
            int removed = list.removeFront();
            System.out.println("Removed " + removed);
            
         } else if(option.startsWith("re")) {
         
            int removed = list.removeEnd();
            System.out.println("Removed " + removed);
            
         } else if (option.startsWith("co")) {

            System.out.print("Contains what? > ");
            System.out.println(list.contains(console.nextInt()));
         }

         System.out.println(list + " size=" + list.size());
         
      } while(!option.startsWith("d"));
   }
   
   private static String displayOptions(Scanner console) {
   
      System.out.println("\nOptions: (af) add to front (ae) add to end (rf) remove front (re) remove end (co) contains (d) done");
      System.out.print("Pick an action > ");
      return console.next().toLowerCase();
      
   }
}