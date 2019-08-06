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

public class ExploreFINS extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, View.OnClickListener {

    static final String GOOGLE_API_KEY = "AIzaSyC-TaeczGtK2yJHGPQOjsuaz-fnS1U-feQ";
    static final String YOUTUBE_VIDEO = "53Lv0t3dZBc";
    final int REQUEST_CODE = 1;

    private Button fins1612, fins1613, fins2624, fins2622, fins3616, fins3626;

    Toolbar toolbar;

    YouTubePlayerView youTubePlayerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_fins);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        //
        fins1612 = (Button) findViewById(R.id.FINS1612);
        fins1613 = (Button) findViewById(R.id.FINS1613);
        fins2624 = (Button) findViewById(R.id.FINS2624);
        fins2622 = (Button) findViewById(R.id.FINS2622);
        fins3616 = (Button) findViewById(R.id.FINS3616);
        fins3626 = (Button) findViewById(R.id.FINS3626);

        //
        // Add Click Listener to the cards
        fins1612.setOnClickListener(this);
        fins1613.setOnClickListener(this);
        fins2624.setOnClickListener(this);
        fins2622.setOnClickListener(this);
        fins3616.setOnClickListener(this);
        fins3626.setOnClickListener(this);

        //Define YouTubePlayerView
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExploreFINS.this.onBackPressed();
            }
        });
        youTubePlayerView.initialize(GOOGLE_API_KEY, this);
        toolbar.setTitle("Finance");

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
    public void onClick (View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.FINS1612:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/FINS1612/"));
                startActivity(i);
                break;
            case R.id.FINS1613:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/FINS1613/"));
                startActivity(i);
                break;
            case R.id.FINS2624:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/FINS2624/"));
                startActivity(i);
                break;
            case R.id.FINS2622:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/FINS2622/"));
                startActivity(i);
                break;
            case R.id.FINS3616:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/FINS3616/"));
                startActivity(i);
                break;
            case R.id.FINS3626:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/FINS3626/"));
                startActivity(i);
                break;


        }
    }
}
