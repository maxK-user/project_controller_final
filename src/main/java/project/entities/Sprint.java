package project.entities;

import java.util.GregorianCalendar;
import java.util.List;

public class Sprint {
    private long id;
    private String name;
    private GregorianCalendar startDate;
    private GregorianCalendar estimateFinishDate;
    private GregorianCalendar rialFinishDate;
    private List<Task> tasks;

    public Sprint() {
    }

    public Sprint(long id, String name, GregorianCalendar startDate, GregorianCalendar finishDate,
                  GregorianCalendar rialFinishDate, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.estimateFinishDate = finishDate;
        this.rialFinishDate = rialFinishDate;
        this.tasks = tasks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getEstimateFinishDate() {
        return estimateFinishDate;
    }

    public void setEstimateFinishDate(GregorianCalendar estimateFinishDate) {
        this.estimateFinishDate = estimateFinishDate;
    }

    public GregorianCalendar getRialFinishDate() {
        return rialFinishDate;
    }

    public void setRialFinishDate(GregorianCalendar rialFinishDate) {
        this.rialFinishDate = rialFinishDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", estimateFinishDate=" + estimateFinishDate +
                ", rialFinishDate=" + rialFinishDate +
                ", tasks=" + tasks +
                '}';
    }
}
