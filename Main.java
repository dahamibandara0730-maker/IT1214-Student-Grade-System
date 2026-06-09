import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        while (true) {

            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Calculate Average");
            System.out.println("5.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    calculateAverage();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }

    public static void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        students.add(new Student(id, name, marks));
        System.out.println("Student Added");
    }

    public static void searchStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public static void calculateAverage() {
        double total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        if (!students.isEmpty()) {
            System.out.println("Average = " + (total / students.size()));
        } else {
            System.out.println("Not students available");
        }
    }
}