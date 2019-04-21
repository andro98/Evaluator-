package main;


import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="interest")
    private String interest;
    @Column(name="limitproblemsolving")
    private int limitProblemSolving;
    @Column(name="limitinterestscore")
    private int limitInterestScore;
    @Column(name="limitage")
    private int limitAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

   public int getLimitProblemSolving() {
        return limitProblemSolving;
    }

    public void setLimitProblemSolving(int limitProblemSolving) {
        this.limitProblemSolving = limitProblemSolving;
    }

    public int getLimitInterestScore() {
        return limitInterestScore;
    }

    public void setLimitInterestScore(int limitInterestScore) {
        this.limitInterestScore = limitInterestScore;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public void setLimitAge(int limitAge) {
        this.limitAge = limitAge;
    }
}
