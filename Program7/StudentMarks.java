package Program7;

import java.util.Scanner;

class StudentInfo {
  int rollNo;
  int marks1;
  int marks2;
  int marks3;
  int total;
  Scanner sc = new Scanner(System.in);

  void getDetails(int i) {
    System.out.println("enter the details of " + (i + 1) + "student");
    System.out.println("enter the roll number");
    rollNo = sc.nextInt();
    System.out.println("enter the marks of 3 subjects ");
    marks1 = sc.nextInt();
    marks2 = sc.nextInt();
    marks3 = sc.nextInt();
    total = marks1+marks2+marks3;
  }

  static void print(StudentInfo s[]) {
    int b1 = 0, brno1 = 0, b2 = 0, brno2 = 0, b3 = 0, brno3 = 0, tot = 0, totalrno = 0;
    System.out.println("Roll No" + "\t" + "Subject-1" + "Subject-2" + "\t" + "Subject-3" + "\t" + "Total");
    for (int i = 0; i < s.length; i++) {

      System.out
          .println(s[i].rollNo + "\t" + s[i].marks1 + "\t" + s[i].marks2 + "\t" + s[i].marks3 + "\t" + s[i].total);
      if (s[i].marks1 > b1) {
        b1 = s[i].marks1;
        brno1 = s[i].rollNo;
      }
      if (s[i].marks2 > b2) {
        b2 = s[i].marks2;
        brno2 = s[i].rollNo;
      }
      if (s[i].rollNo > b3) {
        b3 = s[i].marks3;
        brno3 = s[i].rollNo;
      }
      if (s[i].total > tot) {
        tot = s[i].total;
        totalrno = s[i].rollNo;
      }
    }
    System.out.println("Subject-1 " + b1 + "by student " + brno1);
    System.out.println("Subject-1 " + b2 + "by student " + brno2);
    System.out.println("Subject-1 " + b3 + "by student " + brno3);
    System.out.println("Highets Marks -" + tot + "by student " + totalrno);
  }
}

public class StudentMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No of  students");
    int n = sc.nextInt();
    StudentInfo[] s = new StudentInfo[n];
    for (int i = 0; i < n; i++) {

      s[i] = new StudentInfo();
      s[i].getDetails(i);
    }
    StudentInfo.print(s);
  }
}