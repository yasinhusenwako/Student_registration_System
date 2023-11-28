package StudentRegistrationSystem;
class Student {
    private String name;
    private String sex;
    private String studentId;
    private String department;
    private String college;
    private int year;
    private int semester;

    public Student(String name,String sex, String studentId, String department, String college, int year, int semester) {
        this.name = name;
        this.sex = sex;
        this.studentId = studentId;
        this.department = department;
        this.college = college;
        this.year = year;
        this.semester = semester;
    }
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

