package Recommeder;

import main.Company;
import main.User;

import java.util.ArrayList;
import java.util.List;

public class RecommendCompany implements IRecomCompany{

    HandleRequests handleRequests;
    public RecommendCompany(){
        handleRequests = new HandleRequests();
    }


    @Override
    public List<Company> MatchCompaniesToUser(String ID) {
        try{
            User user = handleRequests.getUerByID(ID);
            List<Company> companies = handleRequests.getAllCompanies();

            List<Company> recCompany = new ArrayList<>();


            for (int i = 0; i < companies.size(); i++) {
                if (user.getInterst().equalsIgnoreCase(companies.get(i).getInterest()) && user.getAge() >= companies.get(i).getLimitAge()
                && user.getInterstScore() >= companies.get(i).getLimitInterestScore()
                && user.getProblemSolving() >= companies.get(i).getLimitProblemSolving()) {
                    recCompany.add(companies.get(i));
                }
            }
            return recCompany;
        }catch (Exception e)
        {
            return null;
        }
    }
}
