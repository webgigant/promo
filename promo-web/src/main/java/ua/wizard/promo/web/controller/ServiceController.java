package ua.wizard.promo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ua.wizard.promo.model.Product;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.03.14
 * Time: 4:09
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/services")
public class ServiceController {
    public static final String ATTR_SUCCESS_MESSAGE = "successMessage";
    public static final String ATTR_ERROR_MESSAGE = "errorMessage";

    @ModelAttribute
    public Date getCurrentDate(){
        return new Date();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        return "services/list";
    }

    @RequestMapping(value = "/defectsearch",method = RequestMethod.GET)
    public String defect(Model model) {
        return "services/defectsearch";
    }

    @RequestMapping(value = "/defectsearch",method = RequestMethod.POST)
    public String defectsearch(Model model, String itemCode, RedirectAttributes redirectModel) {
        if(itemCode.equals("101")){
            model.addAttribute("defectProduct",new Product("Ванна акрилова","101"));
        } else{
            redirectModel.addFlashAttribute(ATTR_ERROR_MESSAGE,"product.not_forund");
            return "redirect:/services/defectsearch";
        }
        return "services/defect";
    }

    @RequestMapping(value = "/delivery",method = RequestMethod.GET)
    public String delivery(Model model) {
        return "services/delivery";
    }

    @RequestMapping(value = "/netimport",method = RequestMethod.GET)
    public String netimport(Model model) {
        return "services/netimport";
    }

    @RequestMapping(value = "/storage",method = RequestMethod.GET)
    public String storage(Model model) {
        return "services/storage";
    }

    @RequestMapping(value = "/defect",method = RequestMethod.POST)
    public String handleDefect(Model model,@RequestParam MultipartFile file,@RequestParam String comment, RedirectAttributes redirectModel) {
        redirectModel.addFlashAttribute(ATTR_SUCCESS_MESSAGE,"notification.sent");
        return "redirect:/services";
    }

    @RequestMapping(value = "/delivery",method = RequestMethod.POST)
    public String handleDelivery(Model model,@RequestParam MultipartFile file,@RequestParam String comment, RedirectAttributes redirectModel) {
        redirectModel.addFlashAttribute(ATTR_SUCCESS_MESSAGE,"notification.sent");
        return "redirect:/services";
    }

    @RequestMapping(value = "/netimport",method = RequestMethod.POST)
    public String handleNetimport(Model model,@RequestParam MultipartFile file,@RequestParam String comment, RedirectAttributes redirectModel) {
        redirectModel.addFlashAttribute(ATTR_SUCCESS_MESSAGE,"notification.sent");
        return "redirect:/services";
    }

    @RequestMapping(value = "/storage",method = RequestMethod.POST)
    public String handleStorage(Model model,@RequestParam MultipartFile file,@RequestParam String comment, RedirectAttributes redirectModel) {
        redirectModel.addFlashAttribute(ATTR_SUCCESS_MESSAGE,"notification.sent");
        return "redirect:/services";
    }
}
