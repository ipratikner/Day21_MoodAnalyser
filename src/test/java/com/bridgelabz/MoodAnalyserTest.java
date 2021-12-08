package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    //TC1.1
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("SAD");
        String mood = moodAnalyser.analyseMood("I am in sad mood ");
        Assertions.assertEquals("HAPPY",mood);
    }
    //TC1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("HAPPY");
        String mood = moodAnalyser.analyseMood("I am in  happy Mood ");
        Assertions.assertEquals("HAPPY",mood);
    }
    //uc1 Refactor TC1.1
    @Test
    public void givenMessage_Constructor_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood ");
        String mood = moodAnalyser.analyseMood("SAD");
        Assertions.assertEquals("SAD",mood);
    }
    //uc1 Refactor TC1.2
    @Test
    public void givenMessagen_Constructor_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in  happy Mood ");
        String mood = moodAnalyser.analyseMood("Happy");
        Assertions.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}