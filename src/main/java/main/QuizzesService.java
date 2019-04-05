package main;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizzesService {


    @Autowired
    private UserRepository userRepository;
    private QuizzeRepository quizzeRepository;
    private Query query;
     public List<String> getRecommendedQuizzes( int id)throws Exception{
        return query.getInfo(id);
     }
     public Iterable<Quizze>getAllQuizzes()
     {
         return quizzeRepository.findAll();
     }
}
