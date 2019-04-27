package Recommeder;

import main.Company;
import main.User;

import java.util.ArrayList;
import java.util.List;

public class RecommendCandidates implements IRecomCandidates {

    HandleRequests handleRequests;

    public RecommendCandidates() {
        handleRequests = new HandleRequests();
    }

    @Override
    public List<User> MatchUsersToCompany(String id) {
        try {
            Company company = handleRequests.getCompanyByID(id);
            List<User> allUsers = handleRequests.getAllUsers();
            List<User> recomCandidates = new ArrayList<>();
            //return allUsers;
            for (int i = 0; i < allUsers.size(); i++) {
                if (company.getInterest().equalsIgnoreCase(allUsers.get(i).getInterst()) &&
                        company.getLimitAge() <= allUsers.get(i).getAge() && company.getLimitProblemSolving() <= allUsers.get(i).getProblemSolving() &&
                        company.getLimitInterestScore() <= allUsers.get(i).getInterstScore()) {
                    recomCandidates.add(allUsers.get(i));
                }
            }
            return recomCandidates;
        } catch (Exception e) {
            return null;
        }
    }
}
