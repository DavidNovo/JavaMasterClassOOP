package net.novogrodsky;

public class Room {

  private Chair chair;
  private Sofa  sofa;
  private Door  door;
  private Wall  wall;

  public Chair getChair() {
    return chair;
  }

  public void setChair(Chair chair) {
    this.chair = chair;
  }

  public Sofa getSofa() {
    return sofa;
  }

  public void setSofa(Sofa sofa) {
    this.sofa = sofa;
  }

  public Door getDoor() {
    return door;
  }

  public void setDoor(Door door) {
    this.door = door;
  }

  public Wall getWall() {
    return wall;
  }

  public void setWall(Wall wall) {
    this.wall = wall;
  }

  public Room(Chair chair, Sofa sofa, Door door, Wall wall) {
    this.chair = chair;
    this.sofa = sofa;
    this.door = door;
    this.wall = wall;
  }

  /**
   * This constructor is used to create a default room with several chairs.
   * @param chair
   */
  public Room(Chair chair) {
    Sofa sofa = new Sofa();
    Door door = new Door();
    Wall wall = Wall.INNER;
    Room newRoom = new Room(chair, sofa, door, Wall.INNER);
    System.out.println("Created new room");
  }
}
