package com.example.question.service;

import com.example.question.model.Question;
import com.example.question.repository.QuestionStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
    private final QuestionStore questionStore;
    private final Random random;

    @Autowired
    public QuestionService(QuestionStore questionStore) {
        this.questionStore = questionStore;
        this.random = new Random();
    }

    public void addQuestion(Question question) {
        questionStore.addQuestion(question);
    }

    public List<Question> getAllQuestions() {
        return questionStore.getQuestions();
    }

    public List<Question> generateQuestionPaper(int totalMarks, double easyPercentage, double mediumPercentage, double hardPercentage) {
        List<Question> questionPaper = new ArrayList<>();
        List<Question> easyQuestions = filterQuestionsByDifficulty("Easy");
        List<Question> mediumQuestions = filterQuestionsByDifficulty("Medium");
        List<Question> hardQuestions = filterQuestionsByDifficulty("Hard");

        int easyMarks = (int) (totalMarks * easyPercentage / 100);
        int mediumMarks = (int) (totalMarks * mediumPercentage / 100);
        int hardMarks = (int) (totalMarks * hardPercentage / 100);

        addRandomQuestionsToPaper(questionPaper, easyQuestions, easyMarks);
        addRandomQuestionsToPaper(questionPaper, mediumQuestions, mediumMarks);
        addRandomQuestionsToPaper(questionPaper, hardQuestions, hardMarks);

        return questionPaper;
    }

    private List<Question> filterQuestionsByDifficulty(String difficulty) {
        List<Question> allQuestions = questionStore.getQuestions();
        List<Question> filteredQuestions = new ArrayList<>();
        for (Question question : allQuestions) {
            if (question.getDifficulty().equalsIgnoreCase(difficulty)) {
                filteredQuestions.add(question);
            }
        }
        return filteredQuestions;
    }

    private void addRandomQuestionsToPaper(List<Question> questionPaper, List<Question> questions, int marks) {
        while (marks > 0 && !questions.isEmpty()) {
            Question randomQuestion = getRandomQuestion(questions);
            questionPaper.add(randomQuestion);
            marks -= randomQuestion.getMarks();
            questions.remove(randomQuestion);
        }
    }

    private Question getRandomQuestion(List<Question> questions) {
        return questions.get(random.nextInt(questions.size()));
    }
}
