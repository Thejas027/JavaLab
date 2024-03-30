package Program9;

import java.util.Scanner;

class Employee {
    static Scanner sc = new Scanner(System.in);
    int empId;
    String empName;
    String Department;
    double basicPay, grossPay, netPay;

    void getDetails(int i) {
        System.out.println("Enter the details of " + (i + 1) + " employee:");

        System.out.print("Enter the ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Enter the Name: ");
        empName = sc.nextLine();
        System.out.print("Enter the department name: ");
        Department = sc.nextLine();
        System.out.print("Enter the basic pay amount: ");
        basicPay = sc.nextDouble();
        calculate();
    }

    void calculate() {
        double tax;
        grossPay = basicPay + (0.58 * basicPay) + (0.16 * basicPay);
        if (grossPay < 2) {
            netPay = grossPay;
        } else if (grossPay >= 2 && grossPay < 3) {
            tax = 0.1 * grossPay;
            netPay = grossPay - tax;
        } else if (grossPay >= 3 && grossPay < 5) {
            tax = 0.15 * grossPay;
            netPay = grossPay - tax;
        } else {
            tax = 0.3 * grossPay;
            netPay = grossPay - (tax + 0.2 * tax);
        }
    }

    void display() {
        System.out.println(empName + "\t" + empId + "\t" + Department + "\t" + grossPay + "\t" + netPay);
    }
}

public class EmployeeTax {
    public static void main(String[] args) {
        System.out.println("Enter the number of employees: ");
        int n = Employee.sc.nextInt();
        Employee.sc.nextLine(); // Consume newline left-over

        Employee[] e = new Employee[n];
        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            e[i].getDetails(i);
        }
        System.out.println("NAME" + "\t" + "EMP ID" + "\t" + "DEPT" + "\t" + "GPAY" + "\t" + "NPAY");
        for (int j = 0; j < n; j++) {
            e[j].display();
        }
    }
}
