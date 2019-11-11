import java.util.*;

public class EmployeeArrayListLambdaDemo{
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"Pavan"));
        empList.add(new Employee(2,"Piyush"));
        empList.add(new Employee(3, "Abhijeet"));
        empList.add(new Employee(4, "Shreshtha"));
        empList.add(new Employee(5, "Krishna"));
        empList.forEach(obj -> System.out.println(obj.EmpId+"\t"+obj.name));
    }
}