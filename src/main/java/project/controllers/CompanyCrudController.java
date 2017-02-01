package project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.entities.Company;
import project.services.CompanyService;

import java.util.List;

@Controller
public class CompanyCrudController {

    @RequestMapping(value = "/showCompanyTable", method = RequestMethod.GET)
    public String showTable(Model model){

        CompanyService companyService = new CompanyService();
        List<Company> allCompanies = companyService.findAll();
        model.addAttribute("themeList", allCompanies);

        return "CompanyCRUD";
    }
}
