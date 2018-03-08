
package ta;

import java.util.ArrayList;

/**
 * @author Tochukwu Nwankwo
 */
public class Tree {
    
     private ArrayList<Child> children;

  public ArrayList<Child> getChildren() { return this.children; }

  public void setChildren(ArrayList<Child> children) { this.children = children; }
/*  
 * @return the identifier 
 */         
  private String id;

  public String getId() { return this.id; }
/*   
* @param userid           
 * @ param userName 
*/

  public void setId(String id) { this.id = id; }

  private String name;

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }
    
}
