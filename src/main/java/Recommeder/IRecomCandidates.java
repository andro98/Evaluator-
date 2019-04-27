package Recommeder;

import main.User;

import java.util.List;

public interface IRecomCandidates {
    public List<User> MatchUsersToCompany(String id);
}
