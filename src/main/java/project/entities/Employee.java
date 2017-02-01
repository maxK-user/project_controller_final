package project.entities;

import project.entities.additionals.Qualification;
import project.entities.additionals.TaskInfoForEmployee;

import java.util.GregorianCalendar;
import java.util.List;

public class Employee{
    private long id;
    private String firstName;
    private String secondName;
    private String surname;
    private String phoneNumber;
    private GregorianCalendar dateOfBirth;
    private Company company;
    private String login;
    private String password;
    private List<Qualification> qualificationsList;
    private List<TaskInfoForEmployee> listOfTaskInfo;

    // якщо в listOfTaskInfo є таска з таким id, то викликаю в неї метод confrmTask,
    // інакше повертаю false
    public boolean confirmTask(long taskId){
        for (int i = 0; i < listOfTaskInfo.size(); i++) {
            if (listOfTaskInfo.get(i).getTaskId() == taskId){
                listOfTaskInfo.get(i).confrmTask();
                return true;
            }
        }
        return false;
    }

    // якщо в listOfTaskInfo є таска з таким id, то викликаю в неї метод setQuantityOfSpendHours,
    // інакше повертаю false
    public boolean setQuantityOfSpendHoursForTask(long taskId, int quantityOfSpendHours){
        for (int i = 0; i < listOfTaskInfo.size(); i++) {
            if (listOfTaskInfo.get(i).getTaskId() == taskId){
                listOfTaskInfo.get(i).setQuantityOfSpendHours(quantityOfSpendHours);
                return true;
            }
        }
        return false;
    }

    public Employee() {
    }

    public Employee(long id, String firstName, String secondName, String surname, String phoneNumber,
                    GregorianCalendar dateOfBirth, Company company, String login, String password,
                    List<Qualification> qualificationsList, List<TaskInfoForEmployee> listOfTaskInfo) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.company = company;
        this.login = login;
        this.password = password;
        this.qualificationsList = qualificationsList;
        this.listOfTaskInfo = listOfTaskInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Qualification> getQualificationsList() {
        return qualificationsList;
    }

    public void setQualificationsList(List<Qualification> qualificationsList) {
        this.qualificationsList = qualificationsList;
    }

    public List<TaskInfoForEmployee> getListOfTaskInfo() {
        return listOfTaskInfo;
    }

    public void setListOfTaskInfo(List<TaskInfoForEmployee> listOfTaskInfo) {
        this.listOfTaskInfo = listOfTaskInfo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", company=" + company +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", qualificationsList=" + qualificationsList +
                ", listOfTaskInfo=" + listOfTaskInfo +
                '}';
    }
}
