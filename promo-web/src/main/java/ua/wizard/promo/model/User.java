package ua.wizard.promo.model;

import ua.wizard.promo.web.controller.TaskType;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 06.03.14
 * Time: 23:18
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private final String email;
    private final String password;
    private final String name;
    private List<Task> currentTasks=new LinkedList<Task>();
    private List<UserBrandDailyReport> dailyReports =new LinkedList<UserBrandDailyReport>();
    private List<UserProductDailyReport> productDailyReports =new LinkedList<UserProductDailyReport>();

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Task> getCurrentTasks() {
        return currentTasks;
    }

    public List<UserBrandDailyReport> getDailyReports() {
        return dailyReports;
    }

    public List<UserProductDailyReport> getProductDailyReports() {
        return productDailyReports;
    }
}
