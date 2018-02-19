package net.novogrodsky;

public class Fish extends Animal {

  private int gills;

  /**
   *
   * @param brain
   * @param body
   * @param size
   * @param weight
   * @param gills
   */
  public Fish(int brain, int body, int size, int weight, int gills) {
    super(brain, body, size, weight);
    this.gills = gills;
  }

}
