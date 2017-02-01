package project.entities.additionals;

import project.entities.Employee;

import java.util.GregorianCalendar;

public class TaskInfoForEmployee {
    // Task info:
    private long taskId;
    private String taskName;
    private GregorianCalendar taskStartDate;
    private GregorianCalendar taskFinishDate;

    // info about my part of the task:
    private boolean isEmployeeConfirmThisTask;
    private GregorianCalendar startDateOfMyWork;
    private GregorianCalendar finishDateOfMyWork;
    private int quantityOfSpendHours; // employee проставляє скільки він реально витратив часу на неї

    private String sprintName;
    private String projectName;
    private Employee projectManager;

    public void confrmTask(){
        isEmployeeConfirmThisTask = true;
    }

    public void setQuantityOfSpendHours(int quantityOfSpendHours) {
        this.quantityOfSpendHours = quantityOfSpendHours;
    }

    public TaskInfoForEmployee() {
    }

    public TaskInfoForEmployee(boolean isEmployeeConfirmThisTask, GregorianCalendar startDateOfMyWork,
                               GregorianCalendar finishDateOfMyWork, int quantityOfSpendHours, long taskId, String taskName,
                               GregorianCalendar taskStartDate, GregorianCalendar taskFinishDate, String sprintName,
                               String projectName, Employee projectManager) {
        this.isEmployeeConfirmThisTask = isEmployeeConfirmThisTask;
        this.startDateOfMyWork = startDateOfMyWork;
        this.finishDateOfMyWork = finishDateOfMyWork;
        this.quantityOfSpendHours = quantityOfSpendHours;
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskStartDate = taskStartDate;
        this.taskFinishDate = taskFinishDate;
        this.sprintName = sprintName;
        this.projectName = projectName;
        this.projectManager = projectManager;
    }

    public boolean isEmployeeConfirmThisTask() {
        return isEmployeeConfirmThisTask;
    }

    public void setEmployeeConfirmThisTask(boolean employeeConfirmThisTask) {
        isEmployeeConfirmThisTask = employeeConfirmThisTask;
    }

    public GregorianCalendar getStartDateOfMyWork() {
        return startDateOfMyWork;
    }

    public void setStartDateOfMyWork(GregorianCalendar startDateOfMyWork) {
        this.startDateOfMyWork = startDateOfMyWork;
    }

    public GregorianCalendar getFinishDateOfMyWork() {
        return finishDateOfMyWork;
    }

    public void setFinishDateOfMyWork(GregorianCalendar finishDateOfMyWork) {
        this.finishDateOfMyWork = finishDateOfMyWork;
    }

    public int getQuantityOfSpendHours() {
        return quantityOfSpendHours;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public GregorianCalendar getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(GregorianCalendar taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public GregorianCalendar getTaskFinishDate() {
        return taskFinishDate;
    }

    public void setTaskFinishDate(GregorianCalendar taskFinishDate) {
        this.taskFinishDate = taskFinishDate;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "TaskInfoForEmployee{" +
                "isEmployeeConfirmThisTask=" + isEmployeeConfirmThisTask +
                ", startDateOfMyWork=" + startDateOfMyWork +
                ", finishDateOfMyWork=" + finishDateOfMyWork +
                ", quantityOfSpendHours=" + quantityOfSpendHours +
                ", taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskStartDate=" + taskStartDate +
                ", taskFinishDate=" + taskFinishDate +
                ", sprintName='" + sprintName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectManager=" + projectManager +
                '}';
    }
}
