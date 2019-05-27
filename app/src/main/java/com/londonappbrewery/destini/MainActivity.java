package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private Destini destini = new Destini();

    private TextView storyView;
    private Button b1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyView = findViewById(R.id.storyTextView);
        b1 = findViewById(R.id.buttonTop);
        b2 = findViewById(R.id.buttonBottom);

        updateView();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                destini.update(destini.getCurrentStory().getAns1());
                updateView();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                destini.update(destini.getCurrentStory().getAns2());
                updateView();
            }
        });

    }

    private void updateView() {
        //set the text
        storyView.setText(getString(destini.getCurrentStory().getQuestion()));

        if (!destini.getCurrentStory().isEnding()) {
            b1.setText(getString(destini.getCurrentStory().getAns1()));
            b2.setText(getString(destini.getCurrentStory().getAns2()));
        } else {
            b1.setVisibility(View.GONE);
            b2.setVisibility(View.GONE);
        }

    }


}
