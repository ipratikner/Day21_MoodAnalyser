package com.bridgelabz;

public class MoodAnalyser {
    public String message;
    //constructor class
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    //analyseMood instance method
    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }
    //analyseMood method and handling NullPointerException
    public String analyseMood() {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
