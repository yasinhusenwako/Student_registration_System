package StudentRegistrationSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentRegistrationSystemTest {
    @Test
    public void testStudentRegistrationSystem() {
        Student student = new Student("Yasin Husen", "M", "1826", "Software Engineering", "CCI", 2,2);

        Assertions.assertEquals("Yasin Husen", student.getName());
        Assertions.assertEquals("M", student.getSex());
        Assertions.assertEquals("1826", student.getStudentId());
        Assertions.assertEquals("Software Engineering", student.getDepartment());
        Assertions.assertEquals("CCI", student.getCollege());
        Assertions.assertEquals(2, student.getYear());
        Assertions.assertEquals(2, student.getSemester());
    }

    @Test
    void name() {
    }
}
