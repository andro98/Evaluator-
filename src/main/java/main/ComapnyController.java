package main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/company")
public class ComapnyController {


    @Autowired
    private CompanyRepository companyRepository;
    //get all companies
    @GetMapping(path="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Iterable<Company> getAllCompanies() {
        // This returns a JSON or XML with the companies
        return companyRepository.findAll();
    }

    /************************************************************************************/

    @RequestMapping(value = "/recommendedCompanies/{id}", method = RequestMethod.GET)
    public List<Company> getRecommendedCompanies(@PathVariable("id") String id)throws Exception
    {
        //Get User by this ID
        //Get All Companies
        //Match Company with interest
        //Return Companies

        RecommendedCompany recommendedCompany = new RecommendedCompany();
        recommendedCompany.Match(id);

        return recommendedCompany.Match(id);

    }
    /*****************************************************/
    //give me company id and i will get all candidates that matches with its logistics
   /* @RequestMapping(value = "recommendedCandidates/{id}",method = RequestMethod.GET)
    public List<User>getRecommendedCandidates(@PathVariable("id") String id )throws Exception
    {
        RecommendedCompany recommendedCompany=new RecommendedCompany();
        List<User>users=recommendedCompany.match(id);
        return users;



    }
    */



}
