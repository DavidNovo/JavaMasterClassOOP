package net.novogrodsky;

/**
 *
 */
public class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  public Dog() {
    this(10, 15, 12, 13);
  }

  public Dog(int brain, int body, int size, int weight) {
    super(brain, body, size, weight);
  }

  public Dog(int size, int weight) {
    super(1, 1, size, weight);
  }

  // getters and setters
  public int getEyes() {
    return eyes;
  }

  public void setEyes(int eyes) {
    this.eyes = eyes;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public int getTail() {
    return tail;
  }

  public void setTail(int tail) {
    this.tail = tail;
  }

  public int getTeeth() {
    return teeth;
  }

  public void setTeeth(int teeth) {
    this.teeth = teeth;
  }

  public String getCoat() {
    return coat;
  }

  public void setCoat(String coat) {
    this.coat = coat;
  }


  private void chew() {
    System.out.println("Dog.chew() called ");
  }

  @Override
  public void eat() {
    System.out.println("Dog.eat() called");
    this.chew();
    super.eat();
  }
}
