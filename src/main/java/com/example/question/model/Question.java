package com.example.question.model;

public class Question {
    private String question;
    private String subject;
    private String topic;
    private String difficulty;
    private int marks;

    public Question(String question, String subject, String topic, String difficulty, int marks) {
        this.question = question;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.marks = marks;
    }

    public String getQuestion() {
        return question;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getMarks() {
        return marks;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", subject='" + subject + '\'' +
                ", topic='" + topic + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", marks=" + marks +
                '}';
    }
}


// {
//     "question" : "which programming language do you know",
//     "subject" : "JAVA",
//     "topic" : "Oops",
//     "difficulty":"easy",
//     "marks" : 5
// }

// [
//     {
//         "question": "what is Collections",
//         "subject": "JAVA",
//         "topic": "collections",
//         "difficulty": "Hard",
//         "marks": 80
//     },
//     {
//         "question": "what is JAVA",
//         "subject": "JAVA",
//         "topic": "JAVA",
//         "difficulty": "easy",
//         "marks": 100
//     },
//     {
//         "question": "what is Multi-Threading",
//         "subject": "JAVA",
//         "topic": "Threading",
//         "difficulty": "medium",
//         "marks": 30
//     }
// ]