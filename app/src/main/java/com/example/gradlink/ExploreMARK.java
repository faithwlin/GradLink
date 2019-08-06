package com.example.gradlink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class ExploreMARK extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    static final String GOOGLE_API_KEY = "AIzaSyC8N9d1IKrSrZ7N_r_VY8A86rErk64OlBY";
    static final String YOUTUBE_VIDEO = "vDEYCTnezUY";
    final int REQUEST_CODE = 1;

    Toolbar toolbar;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_mark);

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
}
