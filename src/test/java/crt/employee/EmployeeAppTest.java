package crt.employee;

import com.lmco.crt.employee.Employee;
import org.junit.*;
import org.springframework.boot.test.autoconfigure.*;
import static org.junit.Assert.*;

public class EmployeeAppTest {

    @Test
    public void testData(){

          Employee testEmp = this.getEmployeeTest();

              assertEquals(testEmp.name, "John");
              assertEquals(testEmp.emailAddress, "john@baeldung.com");
              assertEquals(testEmp.yearOfBirth, 1978);


    }

    private Employee getEmployeeTest(){

        Employee employee = new Employee();
        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        return employee;
    }

}