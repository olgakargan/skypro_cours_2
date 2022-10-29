package com.example.skypro_cours_2.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DuplicateQuestionException extends IllegalArgumentException {
}
