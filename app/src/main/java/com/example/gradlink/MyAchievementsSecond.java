package com.example.gradlink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;


public class MyAchievementsSecond extends NavigationActivity {

    private static Button submitbutton1;
    private static Button submitbutton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_my_achievements_second, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.myachievementsnav);
        OnClickButtonListener1();
        OnClickButtonListener2();
    }


    public void OnClickButtonListener1() {
        submitbutton1 = (Button)findViewById(R.id.submitbutton1);
        submitbutton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.gradlink.MyAchievementsThird");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListener2() {
        submitbutton2 = (Button)findViewById(R.id.submitbutton2);
        submitbutton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.gradlink.MyAchievementsFourth");
                        startActivity(intent);
                    }
                }
        );
    }



}
