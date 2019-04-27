package main;

import Recommeder.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/Evaluator")
public class Evaluator {

    private IRecomQuizze recomQuizze;
    private IRecomCandidates recomCandidates;
    private IRecomCompany recomCompany;
    private HandleLog handleLog = new HandleLog();

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @RequestMapping(value = "/Companies/{id}", method = RequestMethod.GET)
    public List<Company> getRecommendedCompanies(@PathVariable("id") String id) throws Exception {
        try {
            recomCompany = new RecommendCompany();
            handleLog.Logging(new Log("On getRecommendedCompanies"
                    , 3, Integer.parseInt(id), sdf.format(new Date().getTime())));
            return recomCompany.MatchCompaniesToUser(id);
        } catch (Exception e) {
            handleLog.Logging(new Log("On getRecommendedCompanies: " + e.getMessage(), 3, Integer.parseInt(id), sdf.format(new Date().getTime())));
            return null;
        }
    }

    @RequestMapping(value = "/Quizze/{id}", method = RequestMethod.GET)
    public List<Quizze> getRecommendedQuizzes(@PathVariable("id") String id) throws Exception {
        try {
            recomQuizze = new RecommendQuizze();
            return recomQuizze.MatchQuizzeToUser(id);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/Candidates/{id}", method = RequestMethod.GET)
    public List<User> getRecommendedCandidates(@PathVariable("id") String id) throws Exception {
        try {
            recomCandidates = new RecommendCandidates();
            return recomCandidates.MatchUsersToCompany(id);
        } catch (Exception e) {
            return null;
        }
    }

}
