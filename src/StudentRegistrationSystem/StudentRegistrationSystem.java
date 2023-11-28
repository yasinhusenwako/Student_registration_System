//STUDENT REGISTRATION SYSTEM
package StudentRegistrationSystem;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentRegistrationSystem {
    private List<Student> students;

    public StudentRegistrationSystem() {
        students = new ArrayList<>();
    }

    public void registerStudent() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student sex: ");
            String sex = scanner.nextLine();

            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter college: ");
            String college = scanner.nextLine();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            System.out.print("Enter semester: ");
            int semester = scanner.nextInt();

            Student student = new Student(name,sex, studentId, department, college, year, semester);
            students.add(student);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input Please Try again. "+e);
        }

    }

    public void displayStudents() {
        System.out.println("-----------------------STUDENT REGISTRATION DETAILS------------------------------------------------------");
        System.out.println("=========================================================================================================");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-10s %-10s\n",
                "Name","Sex", "Student ID", "Department", "College", "Year", "Semester");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (Student student : students) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-10d %-10d\n",
                    student.getName(),student.getSex(), student.getStudentId(), student.getDepartment(),
                    student.getCollege(), student.getYear(), student.getSemester());
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("--------------------STUDENT REGISTRATION SYSTEM-----------------------------------------------------");

        StudentRegistrationSystem system = new StudentRegistrationSystem();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            {
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.println("            1. Register Student");
                System.out.println("            2. Display Students");
                System.out.println("            3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                try{
                    System.out.print("Enter the number of students to register: ");
                    int numStudents = scanner.nextInt();

                    for (int i = 0; i < numStudents; i++) {
                        System.out.println("Student " + (i + 1) + ":");
                        system.registerStudent();
                        System.out.println();}
                    }
                catch (InputMismatchException ex){
                        System.out.println("Enter Intiger Number Only"+ex);
                    }

                    break;
                case 2:
                    system.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        } while (choice != 3);

        system.displayStudents();
    }

}