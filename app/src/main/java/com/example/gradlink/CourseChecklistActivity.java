package com.example.gradlink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wajahatkarim3.easyflipview.EasyFlipView;

public class CourseChecklistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_checklist);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        final EasyFlipView easyFlipView1 = (EasyFlipView) findViewById(R.id.easyFlipView1);
        easyFlipView1.setToVerticalType();
        easyFlipView1.setFlipTypeFromBack();

    }
}
