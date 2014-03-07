package ua.wizard.promo.model;


import java.util.Date;
/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.03.14
 * Time: 2:02
 * To change this template use File | Settings | File Templates.
 */
public class UserBrandDailyReport {
    private User user;
    private Brand brand;
    private Date date;
    private Rating rating = Rating.NO;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
