package com.example.skypro_Question;

import com.example.skypro_quest.Question;
import com.example.skypro_repository.QuestionRepository;

import javax.annotation.PostConstruct;
import java.util.*;

//@Service
public class JavaQuestionService1 extends QuestionService {
    private final QuestionRepository questionRepository;

    public JavaQuestionService1(QuestionRepository javaQuestionRepository) {
        this.questionRepository = javaQuestionRepository;
    }

    @PostConstruct
    private void initQuestions() {
        for (int i = 0; i < 6; i++) {
            questionRepository.add(new Question("javaQuestion" + i, "javaAnswer" + i));
        }
    }

    @Override
    public Question add(Question question) {
        return questionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return questionRepository.remove(question);
    }

    public Collection<Question> getAll() {
        return questionRepository.getAll();
    }

}

