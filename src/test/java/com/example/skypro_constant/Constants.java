package com.example.skypro_constant;

import com.example.skypro_quest.Question;


import java.util.HashSet;
import java.util.Set;

public class Constants {
    public static final String JAVA_QUESTION1 = "JAVA_QUESTION1";
    public static final String JAVA_QUESTION2 = "JAVA_QUESTION2";
    public static final String JAVA_QUESTION3 = "JAVA_QUESTION3";
    public static final String JAVA_QUESTION4 = "JAVA_QUESTION4";
    public static final String JAVA_QUESTION5 = "JAVA_QUESTION5";
    public static final String JAVA_ANSWER1 = "JAVA_ANSWER1";
    public static final String JAVA_ANSWER2 = "JAVA_ANSWER2";
    public static final String JAVA_ANSWER3 = "JAVA_ANSWER3";
    public static final String JAVA_ANSWER4 = "JAVA_ANSWER4";
    public static final String JAVA_ANSWER5 = "JAVA_ANSWER5";
    public static final Question J_QUEST1 = new Question(JAVA_QUESTION1, JAVA_ANSWER1);
    public static final Question J_QUEST2 = new Question(JAVA_QUESTION2, JAVA_ANSWER2);
    public static final Question J_QUEST3 = new Question(JAVA_QUESTION3, JAVA_ANSWER3);
    public static final Question J_QUEST4 = new Question(JAVA_QUESTION4, JAVA_ANSWER4);
    public static final Question J_QUEST5 = new Question(JAVA_QUESTION5, JAVA_ANSWER5);
    public static final Set<Question> JAVA_QUESTIONS_SET =
            Set.of(J_QUEST1, J_QUEST2, J_QUEST3, J_QUEST4, J_QUEST5);


    public static final Set<Question> ALL_QUESTIONS_SET = new HashSet<>();

    static {

        ALL_QUESTIONS_SET.addAll(JAVA_QUESTIONS_SET);
    }

}