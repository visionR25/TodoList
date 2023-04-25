import java.util.List;
/**
 * Write a description of interface Queue here.
 *
 * @Rowland Ndoma-Egba
 * @version 1
 */
public interface LinearList
{
  public boolean isEmpty();
  
  public int size();
  
  public Object get(int index);
  
  public int indexOf(Object object);
  
  public Object remove(int index);
  
  public void add(int index, Object item);
  
  public String outputList();
}
