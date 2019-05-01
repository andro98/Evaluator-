package Recommeder;

import main.Company;
import main.Quizze;
import main.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class HandleRequests {

    public User getUerByID(String id) {
        //final String uri = "http://localhost:8080/user/" + id;
        final String uri = "https://evaluator-component.herokuapp.com/user/" + id;
        //log send request to user api try catch
        RestTemplate restTemplate = new RestTemplate();
        User result = restTemplate.getForObject(uri, User.class);
        //log cacth


        if (result == null) {
            //Log result null
        }
        return result;
    }

    public List<User> getAllUsers() {
        try {
            //final String uri = "http://localhost:8080/user/all";

            final String uri = "https://evaluator-component.herokuapp.com/user/all";
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<List<User>> result = restTemplate.exchange(uri,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<User>>() {
                    });

            List<User> users = result.getBody();

            return users;
        } catch (Exception e) {
            return null;
        }
    }


    public List<Quizze> getAllQuizze() {
        //final String uri = "http://localhost:8080/quizze/all";

        final String uri = "https://evaluator-component.herokuapp.com/quizze/all" ;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Quizze>> result = restTemplate.exchange(uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Quizze>>() {
                });

        List<Quizze> quizzes = result.getBody();

        return quizzes;
    }

    public Company getCompanyByID(String id) {
        try {
            //final String url = "http://localhost:8080/company/" + id;
            final String uri = "https://evaluator-component.herokuapp.com/company/" + id ;
            RestTemplate restTemplate = new RestTemplate();
            Company result = restTemplate.getForObject(uri, Company.class);
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Company> getAllCompanies() {
        try {
            //Sending request to user api to get all companies information
            //final String uri = "http://localhost:8080/company/all";
            final String uri = "https://evaluator-component.herokuapp.com/company/all";

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<List<Company>> result = restTemplate.exchange(uri,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Company>>() {
                    });

            return result.getBody();
        } catch (Exception e) {
            return null;
        }

    }
}
