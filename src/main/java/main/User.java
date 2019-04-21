package main;

import javax.persistence.*;

@Entity
@Table(name="myuser")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "interst")
    private String interst;
    @Column(name = "problemsolving")
    private int problemSolving;
    @Column(name = "interstscore")
    private int interstScore;
    @Column(name = "age")
    private int age;

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

    public int getProblemSolving() {
        return problemSolving;
    }

    public void setProblemSolving(int problemSolving) {
        this.problemSolving = problemSolving;
    }

    public int getInterstScore() {
        return interstScore;
    }

    public void setInterstScore(int interstScore) {
        this.interstScore = interstScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
