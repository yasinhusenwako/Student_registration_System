package StudentRegistrationSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StudentTest {
    Student student = new Student("Yasin Husen", "M", 22,"1826" ,"Software Engineering", "CCI", 2, 2);
    @Test
    void getName() {
        Assertions.assertEquals("Yasin Husen", student.getName());
    }
    @Test
    void getSex() {
        Assertions.assertEquals("M", student.getSex());
    }
    @Test
    void getAge() {
            Assertions.assertEquals(22, student.getAge());
    }
    @Test
    void getStudentId() {
        Assertions.assertEquals("1826", student.getStudentId());
    }
    @Test
    void getDepartment() {
        Assertions.assertEquals("Software Engineering", student.getDepartment());
    }
    @Test
    void getCollege() {
        Assertions.assertEquals("CCI", student.getCollege());
    }
    @Test
    void getYear() {
        Assertions.assertEquals(2, student.getYear());
    }
    @Test
    void getSemester() {
        Assertions.assertEquals(2, student.getSemester());
    }
}