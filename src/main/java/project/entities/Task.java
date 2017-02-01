package project.entities;

import project.entities.additionals.Qualification;

import java.util.GregorianCalendar;
import java.util.List;

public class Task {

    private long id;
    private String taskName;
    private GregorianCalendar startDate;
    private GregorianCalendar finishDate;
    private GregorianCalendar rialFinishDate;
    private int estimateNumberOfHumanHours;
    private int realNumberOfHumanHours;
    private List<Qualification> qualificationsList;
    private List<Employee> employeeList;
    // таски, які мають виконатися до того як розпочати роботу над цією (цей список може бути пустий (чи нулл))
    private List<Task> influencingTasks;

    public Task() {
    }

    public Task(long id, String taskName, GregorianCalendar startDate, GregorianCalendar finishDate,
                GregorianCalendar rialFinishDate, int estimateNumberOfHumanHours, int realNumberOfHumanHours,
                List<Qualification> qualificationsList, List<Employee> employeeList, List<Task> influencingTasks) {
        this.id = id;
        this.taskName = taskName;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.rialFinishDate = rialFinishDate;
        this.estimateNumberOfHumanHours = estimateNumberOfHumanHours;
        this.realNumberOfHumanHours = realNumberOfHumanHours;
        this.qualificationsList = qualificationsList;
        this.employeeList = employeeList;
        this.influencingTasks = influencingTasks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(GregorianCalendar finishDate) {
        this.finishDate = finishDate;
    }

    public GregorianCalendar getRialFinishDate() {
        return rialFinishDate;
    }

    public void setRialFinishDate(GregorianCalendar rialFinishDate) {
        this.rialFinishDate = rialFinishDate;
    }

    public int getEstimateNumberOfHumanHours() {
        return estimateNumberOfHumanHours;
    }

    public void setEstimateNumberOfHumanHours(int estimateNumberOfHumanHours) {
        this.estimateNumberOfHumanHours = estimateNumberOfHumanHours;
    }

    public int getRealNumberOfHumanHours() {
        return realNumberOfHumanHours;
    }

    public void setRealNumberOfHumanHours(int realNumberOfHumanHours) {
        this.realNumberOfHumanHours = realNumberOfHumanHours;
    }

    public List<Qualification> getQualificationsList() {
        return qualificationsList;
    }

    public void setQualificationsList(List<Qualification> qualificationsList) {
        this.qualificationsList = qualificationsList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Task> getInfluencingTasks() {
        return influencingTasks;
    }

    public void setInfluencingTasks(List<Task> influencingTasks) {
        this.influencingTasks = influencingTasks;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", rialFinishDate=" + rialFinishDate +
                ", estimateNumberOfHumanHours=" + estimateNumberOfHumanHours +
                ", realNumberOfHumanHours=" + realNumberOfHumanHours +
                ", qualificationsList=" + qualificationsList +
                ", employeeList=" + employeeList +
                ", influencingTasks=" + influencingTasks +
                '}';
    }
}
