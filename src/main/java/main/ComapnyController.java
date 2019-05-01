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
    /***************************************************/
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Company getOneComapny(@PathVariable("id")String id)
    {
        return companyRepository.findOne(Integer.parseInt(id));

    }

}
