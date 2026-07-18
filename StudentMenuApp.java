import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String department;
    double cgpa;

    Student(String name, int rollNumber, String department, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNumber +
               ", Department: " + department + ", CGPA: " + cgpa;
    }
}

public class StudentMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student Details");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    students.add(new Student(name, roll, dept, cgpa));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\n--- Student Details ---");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
