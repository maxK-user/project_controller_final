package project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET) // ВСІ ("/") запити типу GET потраплятимуть сюди
    public String home(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        // кладу в атрибут дані formattedDate під назвою "serverTime", які зчитаю потім з jsp
        model.addAttribute("serverTime", formattedDate );

        return "home"; // відкриваємо home.jsp (в servlet-context.xml вказано де вони всі лежать (в /WEB-INF/views/))
    }

}
