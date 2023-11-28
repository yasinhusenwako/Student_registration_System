package StudentRegistrationSystem;

// Child class
class Student extends StudentRegistrationSystem {
    final String name;
    final String sex;
    final String studentId;
    final String department;
    final String college;
    final int year;
    final int semester;

    //constructor
    public Student(String name,String sex, String studentId, String department, String college, int year, int semester) {

        this.name = name;
        this.sex = sex;
        this.studentId = studentId;
        this.department = department;
        this.college = college;
        this.year = year;
        this.semester = semester;
    }
    //getters methods
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getDepartment() {
        return department;
    }
    public String getCollege() {
        return college;
    }
    public int getYear() {
        return year;
    }
    public int getSemester() {
        return semester;
    }
}
