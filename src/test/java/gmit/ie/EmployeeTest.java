package gmit.ie;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public class EmployeeStart(){
        Employee employee = new employee("Stephen", "567534");

    }

    @Test
    public class EmployeeInvalidName(){
        Employee employee = new employee("Ste", "567534");

    }

    @Test
    public class EmployeeInvalidNumber(){
        Employee employee = new employee("Stephen", "567");

    }

}
