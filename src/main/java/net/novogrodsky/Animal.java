package net.novogrodsky;


/**
 * mew class for inheritance.
 */
public class Animal {

  private int brain;
  private int body;
  private int size;
  private int weight;


  /**
   * Create default animal
   */
  public Animal() {
    this(10, 10, 10, 10);
  }

  /**
   *
   * @param brain
   * @param body
   * @param size
   * @param weight
   */
  public Animal(int brain, int body, int size, int weight) {
    this.brain = brain;
    this.body = body;
    this.size = size;
    this.weight = weight;
  }

  public int getBrain() {
    return brain;
  }

  public void setBrain(int brain) {
    this.brain = brain;
  }

  public int getBody() {
    return body;
  }

  public void setBody(int body) {
    this.body = body;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void eat() {
    System.out.println("Animal.eat() called.");
  }

  public void move() {
    System.out.println("Animal.move() called.");
  }
}