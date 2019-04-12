package main;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class RecommendedCompany {

    ///finished
    /*
    *if gives me an id and want to get compnies that candidates to him
    *
     */

    //get a unique user
    private User getUer(String id) {
        final String uri = "http://localhost:8080/user/" + id;

        RestTemplate restTemplate = new RestTemplate();
        User result = restTemplate.getForObject(uri, User.class);

        return result;
    }
    //get all companies
    private  List<Company> getAllCompanies() {
        final String uri = "http://localhost:8080/company/all";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Company>> result = restTemplate.exchange(uri,
                HttpMethod.GET,
                null ,
                new ParameterizedTypeReference<List<Company>>(){});

        List<Company> companies = result.getBody();

        return companies;
    }


    public List<Company> Match(String ID){
        User user = getUer(ID);
        List<Company> companies = getAllCompanies();

        List<Company> recCompany = new ArrayList<>();


        for(int i =0;i<companies.size();i++)
        {
            if(user.getInterst().equalsIgnoreCase(companies.get(i).getInterest()))
            {
                recCompany.add(companies.get(i));
            }
        }
        return recCompany;
    }
    /*******************************************************************/
    //get unique company
    private Company getCompany(String id)
    {
        final String url="localhost:8080/company/"+id;
        RestTemplate restTemplate=new RestTemplate();
        Company result = restTemplate.getForObject(url, Company.class);
        return  result;
    }
    /**********************************************************************/
    private  List<User> getAllUsers() {
        final String uri = "http://localhost:8080/user/all";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<User>> result = restTemplate.exchange(uri,
                HttpMethod.GET,
                null ,
                new ParameterizedTypeReference<List<User>>(){});

        List<User> users = result.getBody();

        return users;
    }
    /************************************************************************/
   /* public List<User>match(String id)
    {
        Company company=getCompany(id);
        List<User>allUsers=getAllUsers();
        List<User>recomCandidates=new ArrayList<>();
        for(int i=0;i<allUsers.size();i++)
        {
            if(company.getInterest().equalsIgnoreCase(allUsers.get(i).getInterst())&&
            company.getLimitAge()<=allUsers.get(i).getAge()&&company.getLimitProblemSolving()<=allUsers.get(i).getProblemSolving()&&
            company.getLimitInterestScore()<=allUsers.get(i).getInterstScore())
            {
                recomCandidates.add(allUsers.get(i));

            }
        }
        return recomCandidates;
    }*/
}
