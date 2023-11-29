/*
       STUDENT REGISTRATION SYSTEM
this student registration system take student name,student age,student sex, student id,
department, collage, year and semester from the user as input and
display all student information.
 */
package StudentRegistrationSystem;
// importing packages
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//parent class
 public class StudentRegistrationSystem {

    // Static arrays to store course information
    static String[] CourseList = {"Operating system                            ", "Fundamental of Networking                  ", "Probability and statistics                 ", "Computer organization and architecture       ", "Data Structure and Algorithms             ", "Object-Oriented programming                "};
    static int[] courseCreditHour ={4,4,3,3,3,3};   // Credit hours for each course
    static int[] courseECTS ={7,7,5,5,5,5};          // ECTS for each course

    // Constants for total credit hours and ECTS
    static final int[] totalCreditHour = {20};
    static final int[] totalECTS = {34};

    // Method to display the registration form
    public void displayStudents() {

        // Displaying header information
        System.out.println("=================================================================================================================================");
        System.out.println("                                             HARAMAYA UNIVERSITY                                                                 ");
        System.out.println("=================================================================================================================================");
        System.out.println("                                                          "+Student.college+" COLLAGE                                            ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                             DEPARTMENT OF " + Student.department +"                                                  ");
        System.out.println("..................................................................................................................................... ");
        System.out.println("                  NAME: " + Student.name + "                       AGE : " + Student.age + "                      ID-Number: " + Student.studentId);
        System.out.println("......................................................................................................................................");
        System.out.println("                       "+"SEX: " + Student.sex + "                            "+"YEAR/SEMESTER: "+ Student.year+ Student.semester);
        System.out.println("......................................................................................................................................");
        System.out.println("                Course                                   Credit Hour                       ECTS                                       ");
        System.out.println("......................................................................................................................................");
        System.out.println("1.     " + CourseList[0] + "             " + courseCreditHour[0] + "                          " + courseECTS[0]);
        System.out.println("2.     " + CourseList[1] + "              " + courseCreditHour[1] + "                          " + courseECTS[1]);
        System.out.println("3.     " + CourseList[2] + "              " + courseCreditHour[2] + "                          " + courseECTS[2]);
        System.out.println("4.     " + CourseList[3] + "            " + courseCreditHour[3] + "                          " + courseECTS[3]);
        System.out.println("5.     " + CourseList[4] + "               " + courseCreditHour[4] + "                          " + courseECTS[4]);
        System.out.println("6.     " + CourseList[5] + "              " + courseCreditHour[5] + "                          " + courseECTS[5]);
        System.out.println(".......................................................................................................................................");
        System.out.println("                                                    TOTAl Chr:" + totalCreditHour[0] + "                    TOTAL ECTS:" + totalECTS[0]);
        System.out.println(".......................................................................................................................................");
        System.out.println("                                            Registered successfully                                                            ");
        System.out.println(".......................................................................................................................................");
    }
     List<Student> students;
// Array list to store student insormation
    public StudentRegistrationSystem() {
        students = new ArrayList<>();
    }
  //method to take input from the user
    public void registerStudent() {
        Scanner scanner = new Scanner(System.in);
//exception handling used
        try {
            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter college: ");
            String college = scanner.nextLine();

            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student's sex: ");
            String sex = scanner.nextLine();

            System.out.print("Enter student's Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter student's ID: ");
            String studentId = scanner.next();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            System.out.print("Enter semester: ");
            int semester = scanner.nextInt();

            Student student = new Student(name,sex,age, studentId, department, college, year, semester);
            students.add(student);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input Please Try again. "+e);
        }

    }
    //Main method here will called all other methods
    public static void main(String[] args) {
        System.out.println("                                                ");
        System.out.println("--------------------STUDENT REGISTRATION SYSTEM-----------------------------------------------------");
        System.out.println("                                                  ");
//creating an object instance and instantiating
        StudentRegistrationSystem system = new StudentRegistrationSystem();
// Scanner class to receive input from user
        Scanner scanner = new Scanner(System.in);
        int choice;
//do while finite loop to repetitively input information and display
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
