package com.example.gradlink;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class HomeActivity extends NavigationActivity implements View.OnClickListener {

    private CardView exploremajorsCard, puzzleplannerCard, myavatarCard, myachievementsCard, coursechecklistCard, myprofileCard;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_home_actvitity, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.homenav);

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

        //Get profile name from google account
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        String displayName = acct.getGivenName();

        //define and set name in TextView
        name = findViewById(R.id.name);
        name.setText(displayName);
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
