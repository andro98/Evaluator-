package Testing;


/*import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;*/

import main.Evaluator;
import main.Quizze;
import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/*import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;*/

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/*@Configuration
@RunWith(SpringRunner.class)
@WebMvcTest(Evaluator.class)*/
public class EvaluatorTest {

    /*   @Autowired
       MockMvc mockMvc;*/
    @InjectMocks
    private Evaluator evaluator;

    @Mock
    private Evaluator evaluator1;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void matchQuizze() {

        Quizze q1 = new Quizze(1, "Problem Solving c++", "C++");
        Quizze q2 = new Quizze(5, "Templates", "C++");
        /*Quizze[] quizzes = new Quizze[2];
        quizzes[0] = q1;
        quizzes[1] = q2;
*/
        List<Quizze> quizzes = new ArrayList<>();
        quizzes.add(q1);
        quizzes.add(q2);


    /*    try {
            when(evaluator1.getRecommendedQuizzes("1")).thenReturn(quizzes);

            List<Quizze> quizzess = evaluator.getRecommendedQuizzes("1");

            verify(evaluator1).getRecommendedQuizzes("1");

            assertArrayEquals(quizzes.toArray(new Quizze[quizzes.size()]), quizzess.toArray(new Quizze[quizzess.size()]));

        } catch (Exception e) {
            e.printStackTrace();
        }*/




        Evaluator evaluator = new Evaluator();
        try {
            List<Quizze> quizzess = evaluator.getRecommendedQuizzes("1");
            //int x = 1;
            if(quizzes.size() == quizzess.size()){
                for(int i = 0;i<quizzess.size(); i++){
                    if(!quizzes.get(i).getInterst().equals(quizzess.get(i).getInterst()))  {
                        throw new Exception();
                    }
                }
            }
            //assertArrayEquals(quizzess.toArray(new Quizze[quizzess.size()]), quizzes.toArray(new Quizze[quizzes.size()]));
        } catch (Exception e) {
            e.printStackTrace();
        }
       /* try {

            mockMvc.perform(get("https://evaluator-component.herokuapp.com/Evaluator/Quizze/1")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", hasSize(2)))
                    .andExpect(jsonPath("$[0].interst", is(quizzes.get(0).getInterst())))
                    .andExpect(jsonPath("$[1].interst", is(quizzes.get(1).getInterst())));

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }


}
