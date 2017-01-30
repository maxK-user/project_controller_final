package project.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.entities.UserAuthorizationData;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET) // ВСІ ("/") запити типу GET потраплятимуть сюди
    public ModelAndView home(/*Model model*/) {
        //Date date = new Date();
        //DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        //String formattedDate = dateFormat.format(date);

        //model.addAttribute("serverTime", formattedDate ); // кладу в атрибут дані з їх назвою, для зчитування з jsp


        /*
        Можна повертати просто String, тоді це буде іменем jsp файлу який слід відкрити,
        а можна повертати об'єкт ModelAndView. В ньому також вказується назва jsp файлу для відриття, але також й
        об'єкт для роботи з ним в jsp та ім'я як до нього звертатись (в jsp). А можна повертати просто String, але
        перед цим в аргументи метода додати Model а всередині метода записати в нього дані через model.setAttribute
        (як зараз і зроблено в методі нижче (checkUser)).
        */

        // Ми самі вирішуємо, яке значення метод повертає і які аргументи приймає.
        // В усі аргументи, що ми вкажемо, впишуться потрібні об'єкти і ми зможемо з ними працювати
        // (якщо вказати те що тут доречно).

        // відкриваємо login.jsp (в servlet-context.xml вказано де вони всі лежать (в /WEB-INF/views/)) й передаємо
        // в нього об'єкт UserAuthorizationData (в даному випадку пустий, і там ми його заповнимо)
        return new ModelAndView("login", "userAuthorizationData", new UserAuthorizationData());
    }

    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String checkUser(@Valid @ModelAttribute("userAuthorizationData") UserAuthorizationData userAuthorizationData, BindingResult bindingResult, Model model) {
        // @Valid - означає, що наступний об'єкт (userAuthorizationData), до того як потрапить сюди із jsp,
        // має бути там провалідоаний на формі так як вкзаано анотаціями в самому його класі (userAuthorizationData).
        // Ну і не забути ще в jsp вказати виведення помилок.

        // саме в такій ситуації важливо, щоб в методі аргумен BindingResult йшов відразу наступним після аргументу
        // об'єкту що ми отрмуємо із jsp (UserAuthorizationData). Детальніше це пояснюється в уроці 54.

        if(bindingResult.hasErrors()){
            return "login";
        }

        model.addAttribute("userAuthorizationData", userAuthorizationData);

        return "main";
    }

    @RequestMapping(value = "/showFirstText", method = RequestMethod.GET)
    public String addVendor(Model model) {
        model.addAttribute("text", "First text ;)");
        return "textPrinter";
    }

    @RequestMapping(value = "showSecondText", method = RequestMethod.GET)
    public String loanBooks(Model model){
        model.addAttribute("text", "Second text ;)");
        return "textPrinter";

    }

    /*@RequestMapping(value = "/submit", method = RequestMethod.GET, params = "addToCart")
    public String superAction(Model model){
        //model.addAttribute("text", "superAction");
        return "main";
    }

    @RequestMapping(value = "/loanbooks.htm", method = RequestMethod.GET, params = "favourite")
    public String addToCart(Model model) {
        //model.addAttribute("text", "superAction");
        return "main";
    }*/

    /*
        якщо треба, наприклад, перевірити дані мід відповіддю з jsp і до їх потрапляння в контроллер,
        або піся відповіді з контроллера і до того як вони прийдуть в jsp,
        то можна використати Inceptor (є окремий урок) (там нічого складного).
        Це як аналог фільтру (але з нього легше працювати зі спрінгом).
        В цій ситуації можна зробити, наприклад, редірект на якусь сторінку, якщо якісь дані не вірні
        (якщо це неможна/незручно робити в контроллері).
     */

}
