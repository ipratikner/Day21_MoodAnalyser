package com.bridgelabz;

public class MoodAnalyser {
    public MoodAnalyser(String message) {
    }
    public String analyseMood(String message){
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
