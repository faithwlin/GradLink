package com.example.gradlink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView exploremajorsCard, puzzleplannerCard, myavatarCard, myachievementsCard, coursechecklistCard, myprofileCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_actvitity);

        exploremajorsCard = (CardView) findViewById(R.id.exploremajorscard);
        puzzleplannerCard = (CardView) findViewById(R.id.puzzleplannercard);
        myavatarCard = (CardView) findViewById(R.id.myavatarcard);
        myachievementsCard = (CardView) findViewById(R.id.myachievementscard);
        coursechecklistCard = (CardView) findViewById(R.id.coursecheclistcard);
        myprofileCard = (CardView) findViewById(R.id.myprofilecard);

        exploremajorsCard.setOnClickListener(this);
        puzzleplannerCard.setOnClickListener(this);
        myavatarCard.setOnClickListener(this);
        myachievementsCard.setOnClickListener(this);
        coursechecklistCard.setOnClickListener(this);
        myprofileCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.exploremajorscard : i = new Intent(this,ExploreMajorsActivity.class); startActivity(i); break;
            case R.id.puzzleplannercard : i = new Intent(this,PuzzlePlannerActivity.class); startActivity(i); break;
            case R.id.myavatarcard : i = new Intent(this,MyAvatarActivity.class); startActivity(i); break;
            case R.id.myachievementscard : i = new Intent(this,MyAchievementsActivity.class); startActivity(i); break;
            case R.id.coursecheclistcard : i = new Intent (this,CourseChecklistActivity.class); startActivity(i); break;
            case R.id.myprofilecard : i = new Intent(this,MyProfileActivity.class); startActivity(i); break;
            default:break;
        }
    }
}
