import java.util.LinkedList;
/**
 * class Todo list - This class is to be used to make a shopping list that specifies
 * name of the item and the number of items to get
 *
 * @Rowland Ndoma-Egba
 * @version 1
 */
public class LinkedLinearList 
{
    // instance variables - replace the example below with your own
    protected LinkNode head;
    protected int size;

    public LinkedLinearList()
    {
        head=null;
    }
    
    public void add(Object theObject, int index)
    {
        checkIndex(index);
        if(index == 0){
            head = new LinkNode(theObject, head);
        }else{
            LinkNode current = head;
            for(int i=0; i < index - 1; i++)
            {
                current = current.next;
            }
            current.next = new LinkNode(theObject, current.next);
        }
        size++;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public int size()
    {
        return size;
    }
    
    public void checkIndex(int index)
    {
        if(index < 0 || index > size)
          throw new IndexOutOfBoundsException
          ("index = " + index + "size = " + size + " Program will permit index 5 or below");        
    }
    
    public Object get(int index)
    {
        checkIndex(index);// check whether the index is not between 0 and size – 1
        LinkNode current; // a variable to return the data item in
        current = head;
        for (int i=0; i<index; i++)
        {
        current = current.next;
    }
        return current.theObject;
    }
    
    public int indexOf(Object theObject)
    {
    //search for the element
    LinkNode current = head;
    int index = 0;
    while (current!= null && !current.theObject.equals(theObject))
    {
        current = current.next;//move to the next node
        index++;
    }
    if (current == null)// head is empty
        return -1;
        else
        return index;
   }
   
   public Object remove(int index)
   {
    checkIndex(index); 
    Object removedObject;
    if (index == 0) 
    {  
        removedObject = head.theObject;
        head = head.next;
    }
    else
    {
        LinkNode current = head;
        for (int i=0; i<index-1; i++)
        {
        current = current.next;
       }
        removedObject = current.next.theObject;
        current.next = current.next.next;
    }
    size--;
    return removedObject;
    }
    
   public String outputList()
   {
     LinkNode current = head;
     StringBuffer s = new StringBuffer("[");
     for (int i = 0; i < size; i++)
     // put elements into the buffer
     {
     if (current == null)
     s.append("null, ");
     else     
     s.append(current.toString());
     current = current.next;
     // remove last ", "
    }
    if (size > 0)
     s.delete(s.length() - 2, s.length());
     s.append("]");
     return new String(s);    
   }
   
}