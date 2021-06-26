package com.jensen.mycalorieadvisor;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfileGoal  extends AppCompatActivity {

    private TextView weightre,weightweekre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile_goal);



        weightre = findViewById(R.id.textViewTargetWeightRe);
        weightweekre = findViewById(R.id.textViewTargetWeightWeekRe);

        String weight = getIntent().getStringExtra("targetweight");
        String weightweek = getIntent().getStringExtra("stringWeeklyGoal");
        weightre.setText(weight);
        weightweekre.setText(weightweek);

    }

}
