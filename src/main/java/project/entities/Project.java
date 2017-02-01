package project.entities;

import java.util.GregorianCalendar;
import java.util.List;

public class Project {
    private long id;
    private String name;
    private GregorianCalendar startDate;
    private GregorianCalendar estimateFinishDate;
    private GregorianCalendar rialFinishDate;
    private List<Sprint> sprints;
    private ProjectManager projectManager;


    public Project() {
    }

    public Project(long id, String name, GregorianCalendar startDate, GregorianCalendar estimateFinishDate,
                   GregorianCalendar rialFinishDate, List<Sprint> sprints, ProjectManager projectManager) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.estimateFinishDate = estimateFinishDate;
        this.rialFinishDate = rialFinishDate;
        this.sprints = sprints;
        this.projectManager = projectManager;
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

    public List<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprint> sprints) {
        this.sprints = sprints;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", estimateFinishDate=" + estimateFinishDate +
                ", rialFinishDate=" + rialFinishDate +
                ", sprints=" + sprints +
                ", projectManager=" + projectManager +
                '}';
    }
}
