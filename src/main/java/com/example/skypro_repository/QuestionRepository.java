package com.example.skypro_repository;

import com.example.skypro_quest.Question;


import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();
}

