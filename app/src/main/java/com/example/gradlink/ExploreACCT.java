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
import com.google.android.youtube.player.YouTubePlayer.Provider;

public class ExploreACCT extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, View.OnClickListener {

    static final String GOOGLE_API_KEY = "AIzaSyC-TaeczGtK2yJHGPQOjsuaz-fnS1U-feQ";
    static final String YOUTUBE_VIDEO = "PqchLUOnHs4";
    final int REQUEST_CODE = 1;

    private Button acct1501, acct1511, acct2522, acct2542, acct3563, acct2507;

    Toolbar toolbar;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_acct);

        //
        acct1501 = (Button) findViewById(R.id.ACCT1501);
        acct1511 = (Button) findViewById(R.id.ACCT1511);
        acct2522 = (Button) findViewById(R.id.ACCT2522);
        acct2542 = (Button) findViewById(R.id.ACCT2542);
        acct3563 = (Button) findViewById(R.id.ACCT3563);
        acct2507 = (Button) findViewById(R.id.ACCT2507);

        //
        // Add Click Listener to the cards
        acct1501.setOnClickListener(this);
        acct1511.setOnClickListener(this);
        acct2522.setOnClickListener(this);
        acct2542.setOnClickListener(this);
        acct3563.setOnClickListener(this);
        acct2507.setOnClickListener(this);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);


        //Define YouTubePlayerView
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExploreACCT.this.onBackPressed();
            }
        });
        youTubePlayerView.initialize(GOOGLE_API_KEY, this);
        toolbar.setTitle("Accounting");

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
            case R.id.ACCT1501:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/ACCT1501/"));
                startActivity(i);
                break;
            case R.id.ACCT1511:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/ACCT1511/"));
                startActivity(i);
                break;
            case R.id.ACCT2522:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/ACCT2522/"));
                startActivity(i);
                break;
            case R.id.ACCT2542:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/ACCT2542/"));
                startActivity(i);
                break;
            case R.id.ACCT3563:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/ACCT3563/"));
                startActivity(i);
                break;
            case R.id.ACCT2507:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/ACCT2507/"));
                startActivity(i);
                break;
        }
    }
}
