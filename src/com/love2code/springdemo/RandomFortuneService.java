package com.love2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] fortunes = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The Journey is the reward"
    };

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {

        // pick a random fortune out of the array
        int index = random.nextInt(fortunes.length);

        String fortune = fortunes[index];

        return fortune;
    }
}
