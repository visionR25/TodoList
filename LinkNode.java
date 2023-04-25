
/**
 * Write a description of class LinkNode here.
 *
 * @Rowland Ndoma-Egba
 * @version 1
 */
public class LinkNode
{
    // instance variables - replace the example below with your own
    protected Object theObject;
    protected LinkNode next;

    /**
     * Constructor for objects of class LinkNode
     */
    public LinkNode(Object newItem, LinkNode next)
    {
        // initialise instance variables
        theObject = newItem;
        this.next = next;
    }
    
    public String toString()
    {
        return theObject + ", ";
    }
}
