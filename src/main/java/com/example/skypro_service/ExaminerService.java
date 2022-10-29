package com.example.skypro_service;

import com.example.skypro_quest.Question;


import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}