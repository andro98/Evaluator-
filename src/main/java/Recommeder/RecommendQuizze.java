package Recommeder;

import main.Quizze;
import main.User;

import java.util.ArrayList;
import java.util.List;

public class RecommendQuizze implements IRecomQuizze {

    HandleRequests handleRequests;

    public RecommendQuizze() {
        handleRequests = new HandleRequests();
    }

    @Override
    public List<Quizze> MatchQuizzeToUser(String ID) {
        try {
            User user = handleRequests.getUerByID(ID);
            List<Quizze> quizzes = handleRequests.getAllQuizze();

            List<Quizze> recQuizze = new ArrayList<>();

            for(int i =0;i<quizzes.size();i++){
                if(user.getInterst().equals(quizzes.get(i).getInterst())){
                    recQuizze.add(quizzes.get(i));
                }
            }
            return recQuizze;

        } catch (Exception e) {
            return null;
        }
    }
}
