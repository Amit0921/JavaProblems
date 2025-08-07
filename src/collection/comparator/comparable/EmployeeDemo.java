package collection.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(6,"Andrew",47000,"DEVELOPMENT"));
        emp.add(new Employee(4,"Joe",25000,"IT"));
        emp.add(new Employee(2,"Charlie",45000,"MANAGER"));
        emp.add(new Employee(3,"Sam",47000,"DEVELOPMENT"));
        emp.add(new Employee(1,"Bob",20000,"IT"));
        emp.add(new Employee(5,"Chris",43500,"SALES"));


//        Comparable Demo
        Collections.sort(emp);
        System.out.println(emp);

//        Comparable Demo by name
        Collections.sort(emp, new NameComparator());
        System.out.println(emp);

//        Comparable Demo by salary
        Collections.sort(emp, new SalaryComparator());
        System.out.println(emp);
    }
}
