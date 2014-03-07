package ua.wizard.promo.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.03.14
 * Time: 2:02
 * To change this template use File | Settings | File Templates.
 */
public class UserProductDailyReport {
    private User user;
    private ProductCategory category;
    private Date date;
    private Rating rating;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
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
