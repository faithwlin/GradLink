package com.example.gradlink;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class ExploreMARK extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, View.OnClickListener {

    static final String GOOGLE_API_KEY = "AIzaSyC-TaeczGtK2yJHGPQOjsuaz-fnS1U-feQ";
    static final String YOUTUBE_VIDEO = "vDEYCTnezUY";
    final int REQUEST_CODE = 1;

    private Button mark1012, mark2051, mark2052, mark2085, mark3054, mark3082;

    Toolbar toolbar;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_mark);

        //
        mark1012 = (Button) findViewById(R.id.MARK1012);
        mark2051 = (Button) findViewById(R.id.MARK2051);
        mark2052 = (Button) findViewById(R.id.MARK2052);
        mark2085 = (Button) findViewById(R.id.MARK2085);
        mark3054 = (Button) findViewById(R.id.MARK3054);
        mark3082 = (Button) findViewById(R.id.MARK3082);

        //
        // Add Click Listener to the cards
        mark1012.setOnClickListener(this);
        mark2051.setOnClickListener(this);
        mark2052.setOnClickListener(this);
        mark2085.setOnClickListener(this);
        mark3054.setOnClickListener(this);
        mark3082.setOnClickListener(this);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        //Define YouTubePlayerView
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExploreMARK.this.onBackPressed();
            }
        });
        youTubePlayerView.initialize(GOOGLE_API_KEY, this);
        toolbar.setTitle("Marketing");

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.cueVideo(YOUTUBE_VIDEO);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE).show();
        }

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.MARK1012:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/MARK1012/"));
                startActivity(i);
                break;
            case R.id.MARK2051:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/MARK2051/"));
                startActivity(i);
                break;
            case R.id.MARK2052:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/MARK2052/"));
                startActivity(i);
                break;
            case R.id.MARK2085:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/MARK2085/"));
                startActivity(i);
                break;
            case R.id.MARK3054:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/MARK3054/"));
                startActivity(i);
                break;
            case R.id.MARK3082:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/MARK3082/"));
                startActivity(i);
                break;
        }
    }
}