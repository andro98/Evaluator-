package main;

import java.util.Date;

public class Log {

    private Integer id;
    private String message;
    private Integer type;
    private Integer userID;
    private Date date;

    public Log( String message, Integer type, Integer userID, Date date) {

        this.message = message;
        this.type = type;
        this.userID = userID;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
