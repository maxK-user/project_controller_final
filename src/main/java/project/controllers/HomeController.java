package project.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.entities.UserAuthorizationData;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET) // ВСІ ("/") запити типу GET потраплятимуть сюди
    public ModelAndView home(Locale locale, Model model) {
        //Date date = new Date();
        //DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        //String formattedDate = dateFormat.format(date);

        //model.addAttribute("serverTime", formattedDate ); // кладу в атрибут дані з їх назвою, для зчитування з jsp


        /*
        Можна повертати просто String, тоді це буде іменем jsp файлу який слід відкрити,
        а можна повертати об'єкт ModelAndView. В ньому також вказується назва jsp файлу для відриття, але також й
        об'єкт для роботи з ним в jsp та ім'я як до нього звертатись (в jsp).
        */
        // відкриваємо login.jsp (в servlet-context.xml вказано де вони всі лежать (в /WEB-INF/views/)) й передаємо
        // в нього об'єкт UserAuthorizationData (в даному випадку пустий, і там ми його заповнимо)
        return new ModelAndView("login", "userAuthorizationData", new UserAuthorizationData());
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("userAuthorizationData") UserAuthorizationData userAuthorizationData) {
        System.out.println(userAuthorizationData);
        return new ModelAndView("main", "userAuthorizationData", userAuthorizationData);
    }

}
