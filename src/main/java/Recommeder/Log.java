package Recommeder;

import javax.persistence.*;

@Entity
@Table(name="mylog")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "message")
    private String message;
    @Column(name = "type")
    private Integer type;
    @Column(name = "userid")
    private Integer userID;
    @Column(name = "date")
    private String date;

    public Log(String message, Integer type, Integer userID, String date) {

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
