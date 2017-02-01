package project;

import project.services.CompanyService;

public class Main {
    public static void main(String[] args) {
        CompanyService companyService = new CompanyService();

        // getCompanyById
        /*Company company = companyService.getCompanyById(1);
        System.out.println(company);*/

        // findAll
        /*for(Company company: companyService.findAll()){
            System.out.println(company);
        }*/

        // insert
        /*Company company = new Company();
        company.setName("testCompany2");
        System.out.println(companyService.insert(company));*/

        // update
        /*Company company = companyService.getCompanyById(1);
        company.setName(company.getName() + "New");
        System.out.println(companyService.update(company));*/

        /*System.out.println(companyService.deleteById(15));*/

    }
}
