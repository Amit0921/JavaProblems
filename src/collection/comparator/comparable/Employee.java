package collection.comparator.comparable;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;
    String dept;
    int age;

    public Employee(int id, String name, int salary, String dept, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.age = age;

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public String getDept() {
        return dept;
    }
    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee obj) {
        return this.id - obj.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
