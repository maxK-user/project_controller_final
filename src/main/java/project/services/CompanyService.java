package project.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import project.dao.CompanyDAO;
import project.entities.Company;

import java.util.List;


public class CompanyService {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    private CompanyDAO companyDAO = (CompanyDAO) context.getBean("companyDAO");

    public Company getCompanyById(long id){
        Company company;
        try{
            company = companyDAO.getById(id);
        } catch (NullPointerException | EmptyResultDataAccessException n){
            return null;
        }

        return company;
    }

    public List<Company> findAll(){
        return companyDAO.getAll();
    }

    public boolean insert(Company company){
        if(company == null){
            return false;
        }
        try{
            return companyDAO.insert(company);
        } catch (DuplicateKeyException e){
            return false;
        } catch(DataIntegrityViolationException d){
            return false;
        }
    }

    public boolean update(Company company){
        if (company == null){
            return false;
        }
        return companyDAO.update(company);
    }

    public boolean deleteById(long id){
        return companyDAO.deleteById(id);
    }
}
