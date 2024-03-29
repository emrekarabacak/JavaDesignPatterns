package memento;

import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        this.employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
