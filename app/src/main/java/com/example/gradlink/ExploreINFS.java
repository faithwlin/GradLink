package com.example.gradlink;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ExploreINFS extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, View.OnClickListener {

    static final String GOOGLE_API_KEY = "AIzaSyC8N9d1IKrSrZ7N_r_VY8A86rErk64OlBY";
    static final String YOUTUBE_VIDEO = "fMCJFTX36J4";
    final int REQUEST_CODE = 1;

    private Button infs1602, infs1603, infs1609, infs2603, infs2605, infs2608;

    Toolbar toolbar;

    YouTubePlayerView youTubePlayerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_infs);

        //
        infs1602 = (Button) findViewById(R.id.INFS1602);
        infs1603 = (Button) findViewById(R.id.INFS1603);
        infs1609 = (Button) findViewById(R.id.INFS1609);
        infs2603 = (Button) findViewById(R.id.INFS2603);
        infs2605 = (Button) findViewById(R.id.INFS2605);
        infs2608 = (Button) findViewById(R.id.INFS2608);

        //
        // Add Click Listener to the cards
        infs1602.setOnClickListener(this);
        infs1603.setOnClickListener(this);
        infs1609.setOnClickListener(this);
        infs2603.setOnClickListener(this);
        infs2605.setOnClickListener(this);
        infs2608.setOnClickListener(this);

        //Define YouTubePlayerView
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExploreINFS.this.onBackPressed();
            }
        });
        youTubePlayerView.initialize(GOOGLE_API_KEY, this);
        toolbar.setTitle("Information Systems");

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
            case R.id.INFS1602:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/INFS1602/"));
                startActivity(i);
                break;
            case R.id.INFS1603:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/INFS1603/"));
                startActivity(i);
                break;
            case R.id.INFS1609:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/INFS1609/"));
                startActivity(i);
                break;
            case R.id.INFS2603:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/INFS2603/"));
                startActivity(i);
                break;
            case R.id.INFS2605:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/INFS2605/"));
                startActivity(i);
                break;
            case R.id.INFS2608:
                i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.handbook.unsw.edu.au/undergraduate/courses/2019/INFS2608/"));
                startActivity(i);
                break;


        }
    }
}
