package net.novogrodsky;

/*
net.novogrodsky.Hello, set language in File ->Project Structure
 */
public class Main {

  /**
   * This is a class used for testing code from the class.
   *
   * @param args Standard parameter.
   */
  public static void main(String[] args) {
    System.out.println("net.novogrodsky.Hello World");

    Dog testDog = new Dog(2,5);

    testDog.eat();
  }
}