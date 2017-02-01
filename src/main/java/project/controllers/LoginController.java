package project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.entities.additionals.UserAuthorizationData;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        return new ModelAndView("login", "userAuthorizationData", new UserAuthorizationData());
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String checkUser(@Valid @ModelAttribute("userAuthorizationData") UserAuthorizationData userAuthorizationData, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return "login";
        }

        model.addAttribute("userLogin", userAuthorizationData.getLogin());
        // todo проверка пользователя

        return "adminMain";
    }
}
