/** The CS12 List.  The methods in this interface supply a simple set of
    list operations. */

public interface ListInterface {

    /** add a character to the end of the list */
    public void addElement(Character toAdd);

    /** print all the elements of the list */
    public void printList ();

    /** turn the list around - the first element become the last, etc.  Note that 
      adding to a list, reversing it, adding to it, reversing it, etc.
      should work.
    */
    public void reverseList ();
    
    /** count the number of times that ch occurs in the list */
    
    public int count(char ch);

}
