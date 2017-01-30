package project.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project.dao.CompanyDAO;
import project.entities.Company;

/**
 * Created by Maksim on 30.01.2017.
 */
public class WorkWithCompany {

    public String getCompanyById(int id){
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring/root-context.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring/appServlet/servlet-context.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CompanyDAO companyDAO = (CompanyDAO) context.getBean("companyDAO");

        Company company = companyDAO.selectCompanyById(id);

        return company.toString();
    }
}
