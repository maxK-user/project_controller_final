package project.entities;

public class Contract {
    private long id;
    private Project project;
    private Company company;
    private Customer customer;

    public Contract() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Contract(long id, Project project, Company company, Customer customer) {
        this.id = id;
        this.project = project;
        this.company = company;
        this.customer = customer;


    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", project=" + project +
                ", company=" + company +
                ", customer=" + customer +
                '}';
    }
}
