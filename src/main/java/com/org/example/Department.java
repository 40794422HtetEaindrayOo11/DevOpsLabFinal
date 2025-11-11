package org.example;

public class Department {
    public String dept_no;
    public String dept_name;
    public Employee manager;

    public Department(String dept_no, String dept_name, Employee manager) {
        this.dept_no = dept_no;
        this.dept_name = dept_name;
        this.manager = manager;
    }

    public String getDept_no() {
        return dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
