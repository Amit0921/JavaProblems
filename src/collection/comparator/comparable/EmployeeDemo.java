package collection.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(6,"Andrew",47000,"DEVELOPMENT",26));
        emp.add(new Employee(4,"Joe",25000,"IT",31));
        emp.add(new Employee(2,"Charlie",45000,"MANAGER",26));
        emp.add(new Employee(3,"Sam",47000,"DEVELOPMENT",29));
        emp.add(new Employee(1,"Sandip",20000,"IT",22));
        emp.add(new Employee(5,"Chris",43500,"SALES",35));
        emp.add(new Employee(7,"Sandip",20000,"IT",26));

//        Comparable Demo
        Collections.sort(emp);
        System.out.println(emp);

//        Comparator Demo by name
//        Collections.sort(emp, new NameComparator());
//        below code can be used instead of above
        emp.sort(new NameComparator());
        System.out.println(emp);

//        Comparator Demo by salary
        Collections.sort(emp, new SalaryComparator());
        System.out.println(emp);

//        Comparator Demo by name age
        Collections.sort(emp, new NameAgeComparator());
        System.out.println(emp);
    }
}
