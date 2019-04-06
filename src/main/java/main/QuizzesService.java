package main;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
     public List<String> getQuizzes(Integer id)
     {
         User ob=userRepository.findOne(id);
         String interest=ob.getInterst();

         TypedQuery<String> query = em.createQuery(
                 "SELECT name FROM quizzes WHERE interst="+interest+"", String.class);
          List<String> results = query.getResultList();
         return results;
     }
}

