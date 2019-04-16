package main;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecommendQuizzes {

    private User getUer(String id) {
        final String uri = "http://localhost:8080/user/" + id;
        //log send request to user api try catch
        RestTemplate restTemplate = new RestTemplate();
        User result = restTemplate.getForObject(uri, User.class);
        //log cacth


        if(result == null){
            //Log result null
        }
        return result;
    }

    private  List<Quizze> getAllQuizze() {
        final String uri = "http://localhost:8080/quizze/all";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Quizze>> result = restTemplate.exchange(uri,
                HttpMethod.GET,
                null ,
                new ParameterizedTypeReference<List<Quizze>>(){});

        List<Quizze> quizzes = result.getBody();

        return quizzes;
    }

    public List<Quizze> Match(String ID){
        User user = getUer(ID);
        List<Quizze> quizzes = getAllQuizze();

        List<Quizze> recQuizze = new ArrayList<>();

        for(int i =0;i<quizzes.size();i++){
            if(user.getInterst().equals(quizzes.get(i).getInterst())){
                recQuizze.add(quizzes.get(i));
            }
        }
        return recQuizze;
    }
}
