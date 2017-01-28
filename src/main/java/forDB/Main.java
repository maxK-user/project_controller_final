package forDB;

import forDB.dao.CompanyDAO;
import forDB.entities.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Maksim on 27.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CompanyDAO companyDAO = (CompanyDAO) context.getBean("companyDAO");

        Company company = companyDAO.selectCompanyById(1);

        System.out.println(company);
    }
}
