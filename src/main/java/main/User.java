package main;

import javax.persistence.*;

@Entity
@Table(name="myuser")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "interst")
    private String interst;
    @Column(name = "problemsolving")
<<<<<<< HEAD
    private int problemSolving;
    @Column(name = "interstscore")
    private int interstScore;
    @Column(name = "age")
    private int age;
=======
    private Integer problemsolving;
    @Column(name = "interstscore")
    private Integer interstscore;
    @Column(name = "age")
    private Integer age;
>>>>>>> a2f660512aaba28fd91b3a751412674ae311c577

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

<<<<<<< HEAD
    public int getProblemSolving() {
        return problemSolving;
=======
    public Integer getProblemSolving() {
        return problemsolving;
>>>>>>> a2f660512aaba28fd91b3a751412674ae311c577
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
<<<<<<< HEAD

=======
>>>>>>> a2f660512aaba28fd91b3a751412674ae311c577
}
