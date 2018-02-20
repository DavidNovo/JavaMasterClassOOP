package net.novogrodsky;

/**
 * This is a class playing with enums.
 *
 * You should use enum types any time you need to represent a fixed set of constants. 
 */
public enum Wall {
  INNER("drywall", 5), 
  OUTER("stone", 32);


  private String material;
  private int    Rfactor;


  Wall(String material, int Rfactor) {
    this.material = material;
    this.Rfactor = Rfactor;
  }

}
