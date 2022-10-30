package com.example.skypro_service;

import com.example.skypro_quest.Question;


import java.util.Collection;

public interface QuestionService {
    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();
}

