package com.example.question.model;

public class GeneratePaperRequest {
    private int totalMarks;
    private double easyPercentage;
    private double mediumPercentage;
    private double hardPercentage;


    public GeneratePaperRequest(int totalMarks, double easyPercentage, double mediumPercentage, double hardPercentage) {
        this.totalMarks = totalMarks;
        this.easyPercentage = easyPercentage;
        this.mediumPercentage = mediumPercentage;
        this.hardPercentage = hardPercentage;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public double getEasyPercentage() {
        return easyPercentage;
    }

    public double getMediumPercentage() {
        return mediumPercentage;
    }

    public double getHardPercentage() {
        return hardPercentage;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setEasyPercentage(double easyPercentage) {
        this.easyPercentage = easyPercentage;
    }

    public void setMediumPercentage(double mediumPercentage) {
        this.mediumPercentage = mediumPercentage;
    }

    public void setHardPercentage(double hardPercentage) {
        this.hardPercentage = hardPercentage;
    }

    @Override
    public String toString() {
        return "GeneratePaperRequest{" +
                "totalMarks=" + totalMarks +
                ", easyPercentage=" + easyPercentage +
                ", mediumPercentage=" + mediumPercentage +
                ", hardPercentage=" + hardPercentage +
                '}';
    }
}
