package Recommeder;

import org.springframework.web.client.RestTemplate;

public class HandleLog {

    public void Logging(Log l) {
 /*       final String uri = "http://localhost:8080/Log/add?message=" + l.getMessage()
                + "&userID=" + l.getId()
                + "&type="+l.getType()
                + "&date="+l.getDate();*/
        try {
            final String uri = "http://evaluator-component.herokuapp.com/Log/add";

            RestTemplate restTemplate = new RestTemplate();
            Log result = restTemplate.postForObject(uri, l, Log.class);
        } catch (Exception e) {

        }
    }
}
