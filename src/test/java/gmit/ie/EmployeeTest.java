package gmit.ie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest{

    @Test
    public void EmployeeTestName(){
        Employee employee = new Employee("Stephen", "567534");
        assertEquals(employee.empName, new Employee("Stephen", "5675344").empName);
    }

    @Test
    public void EmployeeTestNumber(){
        Employee employee = new Employee("Stephen", "567534");
        assertEquals(employee.empNumber, new Employee("Stephenw", "567534").empNumber);
    }
    /*
    @Test
    public void  EmployeeTestInvalidName(){
        Employee employee = new Employee("Ste", "567534");
        assertEquals(employee.empName, (new IndexOutOfBoundsException("Employee Name to Short")));
    }

    @Test
    public void  EmployeeTestInvalidNumber(){
        Employee employee = new Employee("Stephen", "567");
        assertEquals(employee.empNumber, (new IndexOutOfBoundsException("Employee Number to Short")));
    }
    */
}
