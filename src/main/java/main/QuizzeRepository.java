package main;

import main.Quizze;
import org.springframework.data.repository.CrudRepository;

public interface QuizzeRepository extends CrudRepository<Quizze, Integer> {

}
