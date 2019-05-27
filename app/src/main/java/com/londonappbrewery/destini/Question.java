package com.londonappbrewery.destini;

public class Question {

    private Integer question;
    private Integer ans1; // if user clicks button 1
    private Integer ans2; // if button 2 clicked


    public Question(Integer q, Integer a1, Integer a2) {
        question = q;
        ans1 = a1;
        ans2 = a2;
    }

    //ending is just a question with no answers
    public Question(Integer q) {
        question = q;
    }

    public Integer getAns1() {
        return ans1;
    }

    public Integer getAns2() {
        return ans2;
    }

    public Integer getQuestion() {
        return question;
    }

    public boolean isEnding() {
        return ans1 == null && ans2 == null;
    }


}
