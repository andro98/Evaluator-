package Recommeder;

import main.Company;

import java.util.List;

public interface IRecomCompany {
    public List<Company> MatchCompaniesToUser(String ID);
}
