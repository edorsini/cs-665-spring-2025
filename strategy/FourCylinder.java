/**
 * Name: Michael Jordan
 * Date: 1/1/1111
 * Assignment 1
 * Course 622
 */

package patterns.strategy;


public class FourCylinder implements Fast {
  private String firstName = "Michael";


  @Override
  /**
   * This method does whatever..
   */
  public String goFast() {  // camelCase
    return "This will go 4 cylinder fast....";
  }
  
}
