package main;

import javax.persistence.*;

@Entity
@Table(name="quizzes")
public class Quizze {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    private String interst;

    public Quizze(){

    }

    public Quizze(Integer id, String name, String interst) {
        this.id = id;
        this.name = name;
        this.interst = interst;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterst() {
        return interst;
    }

    public void setInterst(String interst) {
        this.interst = interst;
    }
}
