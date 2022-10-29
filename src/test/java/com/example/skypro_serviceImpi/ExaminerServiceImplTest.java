package com.example.skypro_serviceImpi;


import com.example.skypro_serviceImpl.ExaminerServiceImpl;
import com.example.skypro_serviceImpl.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.example.skypro_constant.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;


    private ExaminerServiceImpl examinerService;

    @BeforeEach
    void init() {
        examinerService = new ExaminerServiceImpl(List.of(javaQuestionService));
        when(javaQuestionService.getRandomQuestion()).
                thenReturn(J_QUEST1, J_QUEST2, J_QUEST3, J_QUEST4);
            }

    @Test
    void shouldReturnCorrectAmountOfRandomQuestions() {
        assertEquals(6,
                examinerService.getQuestions(6).size());
    }

    @Test
    void shouldReturnQuestionsOnlyFromTestingSet() {
        assertTrue(ALL_QUESTIONS_SET.containsAll(examinerService.getQuestions(8)));
    }
}

