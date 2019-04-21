package main;


import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="interst")
    private String interest;
    @Column(name="limitproblemsolving")
<<<<<<< HEAD
    private int limitProblemSolving;
    @Column(name="limitinterestscore")
    private int limitInterestScore;
    @Column(name="limitage")
    private int limitAge;

    public int getId() {
=======
    private Integer limitproblemsolving;
    @Column(name="limitinterestscore")
    private Integer limitinterestscore;
    @Column(name="limitage")
    private Integer limitage;

    public Integer getId() {
>>>>>>> a2f660512aaba28fd91b3a751412674ae311c577
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

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

<<<<<<< HEAD
   public int getLimitProblemSolving() {
        return limitProblemSolving;
=======
    public Integer getLimitProblemSolving() {
        return limitproblemsolving;
>>>>>>> a2f660512aaba28fd91b3a751412674ae311c577
    }

    public void setLimitProblemSolving(Integer limitProblemSolving) {
        this.limitproblemsolving = limitProblemSolving;
    }

    public Integer getLimitInterestScore() {
        return limitinterestscore;
    }

    public void setLimitInterestScore(Integer limitInterestScore) {
        this.limitinterestscore = limitInterestScore;
    }

    public Integer getLimitAge() {
        return limitage;
    }

<<<<<<< HEAD
    public void setLimitAge(int limitAge) {
        this.limitAge = limitAge;
=======
    public void setLimitAge(Integer limitAge) {
        this.limitage = limitAge;
>>>>>>> a2f660512aaba28fd91b3a751412674ae311c577
    }
}
