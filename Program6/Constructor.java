// create a class called cube write functions to read the side and print then volume and the lateral surface area

class Cube {
  private int side;

  public int getSide() {
    return side;
  }

  public void setSide(int s) {
    if (s > 0) {
      side = s;
    } else {
      side = 0;
    }
  }

  public Cube(int s) {
    setSide(s);
  }

  public int vol() {
    return side * side * side;
  }

  public int surfaceArea() {
    return 4 * side * side;
  }
}

class Cuboid {
  private int length;
  private int breadth;
  private int height;

  public int getLenght() {
    return length;
  }

  public int getBreadth() {
    return breadth;
  }

  public int getHeight() {
    return height;
  }

  public void setLength(int l) {
    if (l > 0) {
      length = l;
    } else {
      length = 0;
    }
  }

  public void setBreadth(int b) {
    if (b > 0) {
      breadth = b;
    } else {
      breadth = 0;
    }
  }

  public void setHeight(int h) {
    if (h > 0) {
      height = h;
    } else {
      height = 0;
    }
  }

  public Cuboid(int l, int b, int h) {
    setLength(l);
    setBreadth(b);
    setHeight(h);
  }

  public Cuboid(int l, int b) {
    setLength(l);
    setBreadth(b);
    height = 10;
  }

  public Cuboid(int b) {
    length = 20;
    setBreadth(b);
    height = 10;
  }

  public int arae() {
    return length * breadth * height;
  }

  public int surfaceArea2() {
    return 2 * (length * breadth + breadth * height + height * length);
  }

}

public class Constructor {

  public static void main(String[] args) {
    Cube c1 = new Cube(10);

    System.out.println("The volume of Cube :" + c1.vol());
    System.out.println("The surface area of cube:" + c1.surfaceArea());

    Cuboid C1 = new Cuboid(30);
    Cuboid C2 = new Cuboid(40, 50);
    Cuboid C3 = new Cuboid(70, 20, 30);

    System.out.println("The area of Cuboid:" + C1.arae());
    System.out.println("The Surfacearea of Cuboid:" + C1.surfaceArea2());
    System.out.println("The area of Cuboid:" + C2.arae());
    System.out.println("The Surfacearea of Cuboid:" + C2.surfaceArea2());
    System.out.println("The area of Cuboid:" + C3.arae());
    System.out.println("The Surfacearea of Cuboid:" + C3.surfaceArea2());
  }
}