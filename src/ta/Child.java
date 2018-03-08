
package ta;

import java.util.ArrayList;

/**
 *
 * @author mr maulray
 */
public class Child {
    private ArrayList<Child2> children;

  public ArrayList<Child2> getChildren() { return this.children; }

  public void setChildren(ArrayList<Child2> children) { this.children = children; }

  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String name;

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }
    
}
