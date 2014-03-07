package ua.wizard.promo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 06.03.14
 * Time: 23:13
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

    @ModelAttribute
    public Date getCurrentDate(){
        return new Date();
    }

    @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("currentDate", new Date());
        return "home";
    }
}
