/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.util.ArrayList;

/**
 * @author mr maulray
 */
public class Child3 {
    
    private String category;

  public String getCategory() { return this.category; }

  public void setCategory(String category) { this.category = category; }

  private ArrayList<Child4> children;

  public ArrayList<Child4> getChildren() { return this.children; }

  public void setChildren(ArrayList<Child4> children) { this.children = children; }

  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String name;

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }

  private double percentage;

  public double getPercentage() { return this.percentage; }

  public void setPercentage(double percentage) { this.percentage = percentage; }

  private double sampling_error;

  public double getSamplingError() { return this.sampling_error; }

  public void setSamplingError(double sampling_error) { this.sampling_error = sampling_error; }
    
}
