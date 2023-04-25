
/**
 * Class Todo is to organize a shopping list, This program allows the user to manage items 
 * and focus on important items.
 *
 * @Rowland Ndoma-Egba 
 * @version 1
 */
public class Todo 
{
    // instance variables - replace the example below with your own
    private LinkedLinearList list;

    /**
     * Constructor for objects of class Todo, This 
     */
    public Todo()
    { 
        list = new LinkedLinearList();
        list.add("Buy an Apples", 0);
        list.add("Buy a Notebook", 1);
        list.add("Take out the trash", 2);
        list.add("Finish the Assignment", 3);
        list.add("Move the chairs", 4);        
   }
   
   /**
    * This method allows you to add an item to the list
    * int values should be less or equal to size of list
    * Enter item and position
    * no return param included
    */ 
   public void addTask(Object task, int position)
    {
        list.add(task,position);
    }
   
    /**
     * This method will display all the items in the list
     * @return String param
     */
    public String showTasks()
   {
      return list.outputList();
    }
    
   /**
    * This method will count the number of items in the list
    * @return int param
    */
   public int countTasks()
   {
       return list.size;
    }
   
    /**
     * This method will remove an item from the list
     * Enter postion
     * @returns Object
     */
   public Object removeTask(int position)
   {
       return list.remove(position);
    }
    
    /**
     * This method will check if an item is available in the list
     * Enter item
     * @returns boolean statement
     */
   public boolean checkForTask(Object tasks)
   {
       int inList = list.indexOf(tasks); 
       if(inList == 0 || inList == -1)
       {
           System.out.println(tasks + " is not on the list.");
           return false;
        }
        else
        System.out.println(tasks + " is on the list.");
        return true;
    }
    
    /**
     * This method finds an item in the list 
     */
   public Object findTask(Object task)
   {
       int position = list.indexOf(task);
       if(position == -1)
       {
           System.out.println(task +" is not on the list");
        }
       return list.get(position);
    }
    
   /**
    * Shows the next task to be done
    */
   public Object nextTask()
   {
       return list.head;
    }
}
