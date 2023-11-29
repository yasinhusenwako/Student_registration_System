package StudentRegistrationSystem;

// Child class
class Student extends StudentRegistrationSystem {

    //constructor
    public Student(String name,String sex,int age, String studentId, String department, String college, int year, int semester) {
        super();//to indicate that patent class is constructed first

        this.name = name;
        this.sex = sex;
        this.age = age;
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
    public  int getAge(){
        return age;}
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
