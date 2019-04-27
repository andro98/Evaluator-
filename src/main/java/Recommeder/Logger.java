package Recommeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping(path = "/Log")
public class Logger {

    @Autowired
    private LogRepository logRepository;

    @PostMapping(path = "/add")
    public Log addNewUser(@Valid @RequestBody Log l) {
        return logRepository.save(l);
    }
}
