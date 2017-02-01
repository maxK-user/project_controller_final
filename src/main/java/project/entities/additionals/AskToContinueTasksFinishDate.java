package project.entities.additionals;

import project.entities.Employee;
import project.entities.Task;

import java.util.GregorianCalendar;

public class AskToContinueTasksFinishDate {
    private Employee employee;
    private Task task;
    private GregorianCalendar newFinishDate;

    public AskToContinueTasksFinishDate() {
    }

    public AskToContinueTasksFinishDate(Employee employee, Task task, GregorianCalendar newFinishDate) {
        this.employee = employee;
        this.task = task;
        this.newFinishDate = newFinishDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public GregorianCalendar getNewFinishDate() {
        return newFinishDate;
    }

    public void setNewFinishDate(GregorianCalendar newFinishDate) {
        this.newFinishDate = newFinishDate;
    }

    @Override
    public String toString() {
        return "AskToContinueTasksFinishDate{" +
                "employee=" + employee +
                ", task=" + task +
                ", newFinishDate=" + newFinishDate +
                '}';
    }
}
