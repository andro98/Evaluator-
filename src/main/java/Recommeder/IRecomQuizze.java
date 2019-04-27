package Recommeder;

import main.Quizze;

import java.util.List;

public interface IRecomQuizze {
    public List<Quizze> MatchQuizzeToUser(String ID);
}
