package ua.wizard.promo.model;

import ua.wizard.promo.web.controller.TaskType;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.03.14
 * Time: 0:57
 * To change this template use File | Settings | File Templates.
 */
public class Task {
    private User user;
    private boolean completed;
    private TaskType type;
    private Date date;
    private boolean photoExist;
    private String photoURL;
    private boolean notAllPhoto;
    private String comment;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPhotoExist() {
        return photoExist;
    }

    public void setPhotoExist(boolean photoExist) {
        this.photoExist = photoExist;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public boolean isNotAllPhoto() {
        return notAllPhoto;
    }

    public void setNotAllPhoto(boolean notAllPhoto) {
        this.notAllPhoto = notAllPhoto;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
