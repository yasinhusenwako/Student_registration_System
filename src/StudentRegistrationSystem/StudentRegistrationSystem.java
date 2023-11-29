/*
       STUDENT REGISTRATION SYSTEM
this student registration system take student name,student sex, student id,
department, collage, year and semester from the user as input and
display all student information in a table form.
 */
package StudentRegistrationSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//parent class
public class StudentRegistrationSystem {
     String name;
     String sex;
     int age;
     String studentId;
     String department;
     String college;
     int year;
     int semester;
     List<Student> students;

    public StudentRegistrationSystem() {
        students = new ArrayList<>();
    }

    public void registerStudent() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.println();

            System.out.print("Enter student's sex: ");
            String sex = scanner.nextLine();
            System.out.println();

            System.out.print("Enter student's Age: ");
            int age = scanner.nextInt();
            System.out.println();


            System.out.print("Enter student's ID: ");
            String studentId = scanner.nextLine();
            System.out.println();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            System.out.println();

            System.out.print("Enter college: ");
            String college = scanner.nextLine();
            System.out.println();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.println();

            System.out.print("Enter semester: ");
            int semester = scanner.nextInt();
            System.out.println();

            Student student = new Student(name,sex,age, studentId, department, college, year, semester);
            students.add(student);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input Please Try again. "+e);
        }

    }
    public void displayStudents() {
        System.out.println("                                                ");
        System.out.println("-----------------------STUDENT REGISTRATION DETAILS------------------------------------------------------");
        System.out.println("                                                ");
        System.out.println("=========================================================================================================");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-10s %-10s\n",
                "Name","Sex","Age", "Student ID", "Department", "College", "Year", "Semester");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (Student student : students) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-10d %-10d\n",
                    student.getName(),student.getSex(),student.getAge(), student.getStudentId(), student.getDepartment(),
                    student.getCollege(), student.getYear(), student.getSemester());
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }
    }
    public static void main(String[] args) {
        System.out.println("                                                ");
        System.out.println("--------------------STUDENT REGISTRATION SYSTEM-----------------------------------------------------");
        System.out.println("                                                  ");

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
                            System.out.println("Student " + (i ++) + ":");
                            system.registerStudent();
                            System.out.println();}
                    }
                    catch (InputMismatchException ex){
                        System.out.println("Enter Integer Number Only"+ex);
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
        }
        while (choice != 3);

        system.displayStudents();
    }
}