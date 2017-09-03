package structural.composite.dzone.leaf;

import structural.composite.dzone.component.Employee;

public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public void print() {

    }
}
