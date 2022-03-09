package gmit.ie;

public class Employee {
    public String empName;
    public String empNumber;

    public Employee(String name, String number){
        if(name.length() > 5){
            empName = name;
        }
        else{
            throw new IndexOutOfBoundsException("Employee Name to Short");
        }
        if(number.length() > 5){
            empNumber = number;
        }
        else{
            throw new IndexOutOfBoundsException("Employee Number to Short");
        }
    }
}
