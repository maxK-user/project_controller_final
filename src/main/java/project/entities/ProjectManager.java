package project.entities;

import project.entities.additionals.AskToContinueTasksFinishDate;
import project.entities.additionals.Qualification;
import project.entities.additionals.TaskInfoForEmployee;

import java.util.GregorianCalendar;
import java.util.List;

public class ProjectManager extends Employee {
    private List<AskToContinueTasksFinishDate> asksToContinueTasksFinishDate;

    public ProjectManager(){
    }

    public ProjectManager(long id, String firstName, String secondName, String surname, String phoneNumber,
                          GregorianCalendar dateOfBirth, Company company, String login, String password,
                          List<Qualification> qualificationsList, List<TaskInfoForEmployee> listOfTaskInfo,
                          List<AskToContinueTasksFinishDate> asksToContinueTasksFinishDate) {
        super(id, firstName, secondName, surname, phoneNumber, dateOfBirth, company, login, password,
                qualificationsList, listOfTaskInfo);
        this.asksToContinueTasksFinishDate = asksToContinueTasksFinishDate;
    }

    public List<AskToContinueTasksFinishDate> getAsksToContinueTasksFinishDate() {
        return asksToContinueTasksFinishDate;
    }

    public void setAsksToContinueTasksFinishDate(List<AskToContinueTasksFinishDate> asksToContinueTasksFinishDate) {
        this.asksToContinueTasksFinishDate = asksToContinueTasksFinishDate;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "asksToContinueTasksFinishDate=" + asksToContinueTasksFinishDate +
                "} " + super.toString();
    }
}
