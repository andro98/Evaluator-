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

    private Integer limitproblemsolving;
    @Column(name="limitinterestscore")
    private Integer limitinterestscore;
    @Column(name="limitage")
    private Integer limitage;

    public Company(){

    }

    public Company(Integer id, String name, String interest, Integer limitproblemsolving, Integer limitinterestscore, Integer limitage) {
        this.id = id;
        this.name = name;
        this.interest = interest;
        this.limitproblemsolving = limitproblemsolving;
        this.limitinterestscore = limitinterestscore;
        this.limitage = limitage;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLimitproblemsolving() {
        return limitproblemsolving;
    }

    public Integer getLimitinterestscore() {
        return limitinterestscore;
    }

    public Integer getLimitage() {
        return limitage;
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


    public Integer getLimitProblemSolving() {
        return limitproblemsolving;
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

    public void setLimitAge(Integer limitAge) {
        this.limitage = limitAge;
    }
}
