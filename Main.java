import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

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
            System.out.println("No students available ");
        }
    }
}