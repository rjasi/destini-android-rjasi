package com.londonappbrewery.destini;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Destini {

    // this map tells us which story to display next based on which
    // answer was chosen

    private static final HashMap<Integer, Question> ans_to_story_map;

    private Question currentStory;

    static {

        Question t2 = new Question(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2);
        Question t3 = new Question(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2);

        Question t4 = new Question(R.string.T4_End);
        Question t5 = new Question(R.string.T5_End);
        Question t6 = new Question(R.string.T6_End);


        //build our story paths
        ans_to_story_map = new HashMap<>();

        ans_to_story_map.put(R.string.T1_Ans1, t3);
        ans_to_story_map.put(R.string.T1_Ans2, t2);

        ans_to_story_map.put(R.string.T2_Ans1, t3);
        ans_to_story_map.put(R.string.T2_Ans2, t4);

        ans_to_story_map.put(R.string.T3_Ans1, t6);
        ans_to_story_map.put(R.string.T3_Ans2, t5);
    }

    public Destini() {
        currentStory = new Question(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2);
    }

    public Question update(Integer ans) {
        if (ans_to_story_map.containsKey(ans)) {
            currentStory = ans_to_story_map.get(ans);
        }
        // story is unchanged means the ans does not exist
        return currentStory;
    }

    public Question getCurrentStory() {
        return currentStory;
    }

}
