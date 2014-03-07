package ua.wizard.promo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.wizard.promo.model.Task;
import ua.wizard.promo.model.User;

import javax.servlet.http.HttpSession;
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
public class TaskController {

    @RequestMapping(value = "/task/startwork",method = RequestMethod.GET)
    public String handleStartWork(Model model, @ModelAttribute("tasks")Map<TaskType,Task> tasks) {
        Task task = tasks.get(TaskType.startwork);
        task.setCompleted(true);
        return "redirect:/home";
    }


    @RequestMapping(value = "/task/finishwork",method = RequestMethod.GET)
    public String handleFinishWork(Model model, @ModelAttribute("tasks")Map<TaskType,Task> tasks) {
        Task task = tasks.get(TaskType.finishwork);
        task.setCompleted(true);
        return "redirect:/home";
    }

    @RequestMapping(value = "/task/finishworkphoto",method = RequestMethod.GET)
    public String finishworkphoto(Model model) {
        return "finishworkphoto";
    }

    @RequestMapping(value = "/task/startworkphoto",method = RequestMethod.GET)
    public String startworkphoto(Model model) {
        return "startworkphoto";
    }

    @RequestMapping(value = "/task/dailyreport",method = RequestMethod.GET)
    public String dailyReport(Model model) {
        return "dailyreport";
    }

    @RequestMapping(value = "/task/dailyreport",method = RequestMethod.POST)
    public String handleDailyReport(Model model, @ModelAttribute("tasks")Map<TaskType,Task> tasks) {
        Task task = tasks.get(TaskType.dailyreport);
        task.setCompleted(true);
        return "redirect:/home";
    }

    @ModelAttribute
    public void getTransTasks(ModelMap modelMap, HttpSession session){
        User user = (User)session.getAttribute("user");
        Map<TaskType,Task> map = new HashMap<TaskType,Task>();
        for(Task task : user.getCurrentTasks()){
            map.put(task.getType(),task);
        };
        modelMap.put("tasks",map);
    }

    @RequestMapping(value = "/photoupload",method = RequestMethod.POST)
    public String photoupload(Model model, @RequestParam TaskType taskType,@RequestParam MultipartFile file,@RequestParam(required = false) boolean partially, @ModelAttribute("tasks")Map<TaskType,Task> tasks) {
        Task task = tasks.get(taskType);
        task.setCompleted(true);
        task.setNotAllPhoto(partially);
        return "redirect:/home";
    }
}
