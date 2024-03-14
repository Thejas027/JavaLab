package Program11;



import java.util.Scanner;

interface Sports {
  void assingWeigth(int sportsWeight);

  void displayWeight();
}

class student {
  protected int rollNum;

  public void readNum() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter roll number ");
    rollNum = sc.nextInt();
  }

  public void printNum() {
    System.out.println("Roll number : " + rollNum);
  }
}

class Test extends student {
  protected int marks1;
  protected int marks2;

  public void identifyMarks() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks for subject 1 : ");
    marks1 = sc.nextInt();
    System.out.println("Enter marks for subject 2 : ");
    marks2 = sc.nextInt();
  }

  public void displayMarks() {
    System.out.println("Marks obtained in subject 1 :" + marks1);
    System.out.println("marks obatined in subject 2 : " + marks2);
  }
}

class Results extends Test implements Sports {
  private int sportsWeight;

  public void assingWeigth(int weight) {
    sportsWeight = weight;
  }

  public void displayWeight() {
    System.out.println("sports weight : " + sportsWeight);
  }

  public void displayScoreCard() {
    int totalMarks = marks1 + marks2 + sportsWeight;
    printNum();
    displayMarks();
    displayWeight();
    System.out.println("total score " + totalMarks);
  }
}

public class InterfaceStudent {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Results s = new Results();
    s.readNum();
    s.identifyMarks();
    System.out.println("Enter sports weightage ");
    int sportsWeight = new Scanner(System.in).nextInt();
    s.assingWeigth(sportsWeight);
    s.displayScoreCard();
  }
}
