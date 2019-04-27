package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/quizze")
public class QuizzeController {

    @Autowired
    private QuizzeRepository quizzeRepository;


    @GetMapping(path="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Iterable<Quizze> getAllQuizzes() {
        // This returns a JSON or XML with the users
        return quizzeRepository.findAll();
    }


}
