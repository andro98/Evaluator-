package main;

import javax.persistence.*;

@Entity
@Table(name="myuser")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    public User(Integer id, String name, String interst, Integer problemsolving, Integer interstscore, Integer age) {
        this.id = id;
        this.name = name;
        this.interst = interst;
        this.problemsolving = problemsolving;
        this.interstscore = interstscore;
        this.age = age;
    }

    @Column(name = "name")
    private String name;
    @Column(name = "interst")
    private String interst;
    @Column(name = "problemsolving")
    private Integer problemsolving;
    @Column(name = "interstscore")
    private Integer interstscore;
    @Column(name = "age")
    private Integer age;

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

    public Integer getProblemSolving() {
        return problemsolving;
    }

    public void setProblemSolving(Integer problemSolving) {
        this.problemsolving = problemSolving;
    }

    public Integer getInterstScore() {
        return interstscore;
    }

    public void setInterstScore(Integer interstScore) {
        this.interstscore = interstScore;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
