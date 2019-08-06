package com.example.gradlink;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MyAvatarActivity extends NavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_my_avatar, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.myavatarnav);
    }
}
