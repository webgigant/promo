package ua.wizard.promo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ua.wizard.promo.model.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 28.01.14
 * Time: 1:10
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String handleLogin(RedirectAttributes redirectModel,Model model,@RequestParam String email,@RequestParam String password, HttpSession session) {
        if(email.equals("demo@promo")){
            User user = new User("Promouter", email, password);
            session.setAttribute("user", user);
            List<Task> taskList = user.getCurrentTasks();

            taskList.add(newTask(TaskType.startwork));
            taskList.add(newTask(TaskType.startworkphoto));
            taskList.add(newTask(TaskType.dailyreport));
            taskList.add(newTask(TaskType.finishworkphoto));
            taskList.add(newTask(TaskType.finishwork));

            List<UserBrandDailyReport> dailyReports = user.getDailyReports();
            dailyReports.add(newDailyReport("brand1"));
            dailyReports.add(newDailyReport("brand2"));
            dailyReports.add(newDailyReport("brand3"));
            dailyReports.add(newDailyReport("brand4"));
            dailyReports.add(newDailyReport("brand5"));

            List<UserProductDailyReport> productDailyReports = user.getProductDailyReports();
            productDailyReports.add(newProductDailyReport("category1"));
            productDailyReports.add(newProductDailyReport("category2"));
            productDailyReports.add(newProductDailyReport("category3"));
            productDailyReports.add(newProductDailyReport("category4"));
            productDailyReports.add(newProductDailyReport("category5"));
            productDailyReports.add(newProductDailyReport("category6"));
            productDailyReports.add(newProductDailyReport("category7"));
            return "redirect:/home";
        }

        redirectModel.addAttribute("errorMessage","login.failed");
        return "redirect:/login";
    }

    private UserProductDailyReport newProductDailyReport(String category) {
        UserProductDailyReport report = new UserProductDailyReport();
        report.setDate(new Date());
        report.setCategory(new ProductCategory(category));
        return report;
    }

    private UserBrandDailyReport newDailyReport(String brand) {
        UserBrandDailyReport res = new UserBrandDailyReport();
        res.setDate(new Date());
        res.setBrand(new Brand(brand));
        return res;
    }

    private Task newTask(TaskType taskType) {
        Task task = new Task();
        task.setDate(new Date());
        task.setType(taskType);
        return task;
    }
}
