package com.example.skypro_serviceImpl;

import com.example.skypro_quest.Question;
import com.example.skypro_service.ExaminerService;
import com.example.skypro_service.QuestionService;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final Random random = new Random();
    private final List<QuestionService> questionServices;

    public ExaminerServiceImpl(List<QuestionService> questionServices) {
        this.questionServices = questionServices;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            QuestionService randomService = questionServices.get(random.nextInt(questionServices.size()));
            questions.add(randomService.getRandomQuestion());
        }
        return questions;
    }
}

