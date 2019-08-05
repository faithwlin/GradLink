package com.example.gradlink;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;

public class ExploreMajorsActivity extends NavigationActivity implements View.OnClickListener {

    private CardView infsCard, finsCard, acctCard, markCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_explore_majors, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.exploremajorsnav);

        // Define the cardviews
        infsCard = (CardView) findViewById(R.id.informationsystems);
        finsCard = (CardView) findViewById(R.id.finance);
        acctCard = (CardView) findViewById(R.id.accounting);
        markCard = (CardView) findViewById(R.id.marketing);

        // Add Click Listener to the cards
        infsCard.setOnClickListener(this);
        finsCard.setOnClickListener(this);
        acctCard.setOnClickListener(this);
        markCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.informationsystems:
                i = new Intent(this, ExploreINFS.class);
                startActivity(i);
                break;
            case R.id.finance:
                i = new Intent(this, ExploreFINS.class);
                startActivity(i);
                break;
            case R.id.accounting:
                i = new Intent(this, ExploreACCT.class);
                startActivity(i);
                break;
            case R.id.marketing:
                i = new Intent(this, ExploreMARK.class);
                startActivity(i);
                break;
            default:
                break;

        }

    }
}
