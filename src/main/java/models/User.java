package models;

public class User {


    String first_name;
    String last_name;
    String email;
    String age;
    String salary;
    String department;

    public User(String first_name, String last_name, String email, String age, String salary, String department) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
